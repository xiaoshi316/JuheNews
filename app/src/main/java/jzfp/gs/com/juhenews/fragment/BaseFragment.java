package jzfp.gs.com.juhenews.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.BindView;
import butterknife.ButterKnife;
import jzfp.gs.com.juhenews.R;

/**
 * Created by lisa on 2016/12/13.
 * Email: 457420045@qq.com
 */

@SuppressWarnings("deprecation")
public class BaseFragment extends Fragment {
    @BindView(R.id.swipe_container)
    SwipeRefreshLayout swipeRefreshLayout;
    @BindView(R.id.rv_content)
    RecyclerView recyclerView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);

        //      create main panel for fragment
        View view = inflater.inflate(R.layout.base_fragment, container, false);
        ButterKnife.bind(this, view);

        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                swipeRefreshLayout.setRefreshing(true);
                pullData();
            }
        });
        swipeRefreshLayout.setRefreshing(true);
        pullData();
        swipeRefreshLayout.setColorSchemeColors(getResources().getColor(android.R.color.holo_blue_bright),
                getResources().getColor(android.R.color.holo_green_light),
                getResources().getColor(android.R.color.holo_orange_light));
        return view;
    }

    public void pullData() {
    }
}
