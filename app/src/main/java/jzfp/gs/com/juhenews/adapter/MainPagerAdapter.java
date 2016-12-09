package jzfp.gs.com.juhenews.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import jzfp.gs.com.juhenews.fragment.FunnyFragment;
import jzfp.gs.com.juhenews.fragment.HistoryFragment;
import jzfp.gs.com.juhenews.fragment.JokeFragment;
import jzfp.gs.com.juhenews.fragment.NewsFragment;

/**
 * Created by lisa on 2016/12/2.
 */

public class MainPagerAdapter extends FragmentPagerAdapter {

    public static final String[] titles = {"头条", " 笑话", "趣图","今天"};

    public MainPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return NewsFragment.newInstance("头条");
            case 1:
                return JokeFragment.newInstance("笑话");
            case 2:
                return FunnyFragment.newInstance("趣图");
            case 3:
                return HistoryFragment.newInstance("今天");
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
