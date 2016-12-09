package jzfp.gs.com.juhenews.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import jzfp.gs.com.juhenews.R;
import jzfp.gs.com.juhenews.adapter.SettingsAdapter;

/**
 * Created by lisa on 2016/12/9.
 */

public class SettingsFragment2 extends Fragment {
    private RecyclerView recyclerView = null;

    public static SettingsFragment2 newInstance() {

        Bundle args = new Bundle();

        SettingsFragment2 fragment = new SettingsFragment2();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.activity_settings_backup, container, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.tv_settings);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);
        SettingsAdapter settingsAdapter = new SettingsAdapter(getContext(), getResources().getStringArray(R.array.setting_options));

        recyclerView.setAdapter(settingsAdapter);
        recyclerView.setLayoutManager(linearLayoutManager);
        return view;
    }
}
