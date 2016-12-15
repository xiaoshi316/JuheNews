package jzfp.gs.com.juhenews.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.astuetz.PagerSlidingTabStrip;

import butterknife.BindView;
import butterknife.ButterKnife;
import jzfp.gs.com.juhenews.R;
import jzfp.gs.com.juhenews.adapter.NewsPagerAdapter;

/**
 * Created by lisa on 2016/12/14.
 * Email: 457420045@qq.com
 */

public class ZixunFragment extends Fragment {

    @BindView(R.id.psts_title)
    PagerSlidingTabStrip pagerSlidingTabStrip = null;
    @BindView(R.id.vp_news)
    ViewPager viewPager = null;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_zixun, container, false);
        ButterKnife.bind(this, view);
        viewPager.setAdapter(new NewsPagerAdapter(getFragmentManager()));
        pagerSlidingTabStrip.setViewPager(viewPager);
        return view;
    }
}
