package jzfp.gs.com.juhenews.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.gson.Gson;

import jzfp.gs.com.juhenews.R;
import jzfp.gs.com.juhenews.adapter.FunnyAdapter;
import jzfp.gs.com.juhenews.gsonbean.funnybean.FunnyBean;
import jzfp.gs.com.juhenews.utils.OkhttpUtils;
import rx.Observable;
import rx.Observer;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by lisa on 2016/12/2.
 * Email: 457420045@qq.com
 */

@SuppressWarnings("deprecation")
public class FunnyFragment extends Fragment {
    private SwipeRefreshLayout swipeRefreshLayout;
    private FunnyAdapter funnyAdapter;

    /*
     * new instance 方法 FunnyFragment
     */
    public static FunnyFragment newInstance() {
        Bundle args = new Bundle();
        FunnyFragment fragment = new FunnyFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);

        //      create main panel for fragment
        View view = inflater.inflate(R.layout.base_fragment, container, false);
        swipeRefreshLayout = (SwipeRefreshLayout) view.findViewById(R.id.swipe_container);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.tv_content);
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);

        funnyAdapter = new FunnyAdapter();

        recyclerView.setLayoutManager(staggeredGridLayoutManager);
        recyclerView.setAdapter(funnyAdapter);

        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                swipeRefreshLayout.setRefreshing(true);
                pullFunnyData();
            }
        });
        swipeRefreshLayout.setRefreshing(true);
        pullFunnyData();
        swipeRefreshLayout.setColorSchemeColors(getResources().getColor(android.R.color.holo_blue_bright),
                getResources().getColor(android.R.color.holo_green_light),
                getResources().getColor(android.R.color.holo_orange_light));
        return view;
    }


    /*获取趣图信息*/
    private void pullFunnyData() {
        Observable.create(new Observable.OnSubscribe<String>() {
            @Override
            public void call(Subscriber<? super String> subscriber) {
                String response = OkhttpUtils.getFunny();
                subscriber.onNext(response);
                subscriber.onCompleted();
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Observer<String>() {
            @Override
            public void onNext(String response) {
                swipeRefreshLayout.setRefreshing(true);
                Gson gson = new Gson();
                FunnyBean funnyBean = gson.fromJson(response, FunnyBean.class);
                funnyAdapter.setFunnyData(funnyBean);
            }

            @Override
            public void onCompleted() {
                swipeRefreshLayout.setRefreshing(false);
            }

            @Override
            public void onError(Throwable e) {
                //handle exception
                e.printStackTrace();
            }
        });
    }
}
