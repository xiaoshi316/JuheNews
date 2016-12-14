package jzfp.gs.com.juhenews.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import jzfp.gs.com.juhenews.fragment.NewsFragment;

/**
 * Created by lisa on 2016/12/2.
 * Email: 457420045@qq.com
 */

public class NewsPagerAdapter extends FragmentPagerAdapter {

    public static final String[] titles = {"头条","社会","国内","国际","娱乐","体育","军事","科技","财经","时尚"};

    public NewsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return NewsFragment.newInstance("top");
            case 1:
                return NewsFragment.newInstance("shehui");
            case 2:
                return NewsFragment.newInstance("guonei");
            case 3:
                return NewsFragment.newInstance("guoji");
            case 4:
                return NewsFragment.newInstance("yule");
            case 5:
                return NewsFragment.newInstance("tiyu");
            case 6:
                return NewsFragment.newInstance("junshi");
            case 7:
                return NewsFragment.newInstance("keji");
            case 8:
                return NewsFragment.newInstance("caijing");
            case 9:
                return NewsFragment.newInstance("shishang");
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
