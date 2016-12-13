package jzfp.gs.com.juhenews.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.gson.Gson;

import butterknife.ButterKnife;
import jzfp.gs.com.juhenews.adapter.HistoryAdapter;
import jzfp.gs.com.juhenews.gsonbean.historybean.HistoryBean;
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
public class HistoryFragment extends BaseFragment {
    private HistoryAdapter historyAdapter;

    /*
     * new instance 方法 HistoryFragment
     */
    public static HistoryFragment newInstance() {
        Bundle args = new Bundle();
        HistoryFragment fragment = new HistoryFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = super.onCreateView(inflater, container, savedInstanceState);
        ButterKnife.bind(this, view);
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        historyAdapter = new HistoryAdapter();

        recyclerView.setLayoutManager(staggeredGridLayoutManager);
        recyclerView.setAdapter(historyAdapter);
        return view;
    }


    @Override
    public void pullData() {
        Observable.create(new Observable.OnSubscribe<String>() {
            @Override
            public void call(Subscriber<? super String> subscriber) {
                String response = OkhttpUtils.getHistory();
                subscriber.onNext(response);
                subscriber.onCompleted();
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Observer<String>() {
            @Override
            public void onNext(String response) {
                swipeRefreshLayout.setRefreshing(true);
                Gson gson = new Gson();
                HistoryBean historyBean = gson.fromJson(response, HistoryBean.class);
                historyAdapter.setHistory(historyBean);
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
