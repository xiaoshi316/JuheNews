package jzfp.gs.com.juhenews.activity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import java.io.File;
import java.util.HashMap;

import butterknife.BindArray;
import butterknife.BindView;
import butterknife.ButterKnife;
import de.hdodenhof.circleimageview.CircleImageView;
import jzfp.gs.com.juhenews.R;
import jzfp.gs.com.juhenews.adapter.NewsPagerAdapter;

public class HomeActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private static final HashMap<Integer, Integer> sPageMenuMap = new HashMap<Integer, Integer>() {
        {
            put(0, R.id.news);
            put(1, R.id.joke);
            put(2, R.id.funny);
            put(3, R.id.history);
        }
    };
    private static final HashMap<Integer, Integer> sMenuPageMap = new HashMap<Integer, Integer>() {
        {
            put(R.id.news, 0);
            put(R.id.joke, 1);
            put(R.id.funny, 2);
            put(R.id.history, 3);
        }
    };

    @BindView(R.id.vp_content)
    ViewPager viewPager = null;
    @BindView(R.id.nv_left)
    NavigationView navigationView = null;
    @BindView(R.id.dl_main)
    DrawerLayout drawerLayout = null;
    @BindView(R.id.tab_title)
    TabLayout tabLayout = null;
    @BindArray(R.array.setting_options)
    String[] options = null;

    CircleImageView circleImageView = null;
    TextView textViewName = null;
    TextView textViewEmail = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        navigationView.setNavigationItemSelectedListener(this);

        View headerLayout = navigationView.getHeaderView(0); // 0-index header
        circleImageView = (CircleImageView) headerLayout.findViewById(R.id.civ_profile);
        textViewName = (TextView) headerLayout.findViewById(R.id.tv_name);
        textViewEmail = (TextView) headerLayout.findViewById(R.id.tv_email);

        headerLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                directToSettings();
            }
        });

        NewsPagerAdapter mainPagerAdapter = new NewsPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(mainPagerAdapter);
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {

            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                navigationView.setCheckedItem(sPageMenuMap.get(viewPager.getCurrentItem()));
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        //设置TabLayout的模式
        tabLayout.setTabMode(TabLayout.MODE_FIXED);
        //为TabLayout添加tab名称
        tabLayout.addTab(tabLayout.newTab().setText(NewsPagerAdapter.titles[0]));
        tabLayout.addTab(tabLayout.newTab().setText(NewsPagerAdapter.titles[1]));
        tabLayout.addTab(tabLayout.newTab().setText(NewsPagerAdapter.titles[2]));
        tabLayout.addTab(tabLayout.newTab().setText(NewsPagerAdapter.titles[3]));
        tabLayout.setupWithViewPager(viewPager);

    }

    @Override
    protected void onResume() {
        super.onResume();
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(this);
        String imagePath = sp.getString("PROFILE", null);
        if (imagePath != null) {
            File file = new File(imagePath);
            if (file.exists()) {
                Bitmap bitmap = BitmapFactory.decodeFile(imagePath);
                circleImageView.setImageBitmap(bitmap);
            }
        }
        String name = sp.getString(options[0], null);
        textViewName.setText(name);
        String email = sp.getString(options[2], null);
        textViewEmail.setText(email);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar, menu);
        return true;
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        if (drawerLayout.isDrawerOpen(Gravity.LEFT)) {
            drawerLayout.closeDrawers();
        }
        viewPager.setCurrentItem(sMenuPageMap.get(item.getItemId()));
        return true;
    }

    private void directToSettings() {
        Intent intent = new Intent();
        intent.setClass(this, SettingActivity.class);
        startActivity(intent);
    }
}
