package jzfp.gs.com.juhenews.fragment;

import android.os.Bundle;
import android.preference.PreferenceFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import jzfp.gs.com.juhenews.R;

/**
 * Created by lisa on 2016/12/6.
 */

public class SettingPreferenceFragment extends PreferenceFragment {

    public static SettingPreferenceFragment newInstance() {

        Bundle args = new Bundle();

        SettingPreferenceFragment fragment = new SettingPreferenceFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        addPreferencesFromResource(R.xml.settings);
        return super.onCreateView(inflater, container, savedInstanceState);
    }
}
