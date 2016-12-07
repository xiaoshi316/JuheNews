package jzfp.gs.com.juhenews.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import jzfp.gs.com.juhenews.fragment.HistoryFragment;
import jzfp.gs.com.juhenews.fragment.JokeFragment;
import jzfp.gs.com.juhenews.fragment.NewsFragment;

/**
 * Created by lisa on 2016/12/2.
 */

public class MainPagerAdapter extends FragmentPagerAdapter {

    public static final String[] titles = {"新闻头条", " 笑话大全", "历史上的今天"};

    public MainPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return NewsFragment.newInstance("新闻");
            case 1:
                return JokeFragment.newInstance("笑话大全");
            case 2:
                return HistoryFragment.newInstance("历史上的今天");
            default:
                break;
        }
        return null;
    }

    @Override
    public int getCount() {
        return titles.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titles[position];
    }


}
