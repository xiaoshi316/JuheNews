package jzfp.gs.com.juhenews.activity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.PagerTitleStrip;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import net.lucode.hackware.magicindicator.MagicIndicator;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.CommonNavigator;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.CommonNavigatorAdapter;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerIndicator;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerTitleView;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.ClipPagerTitleView;

import java.io.File;

import de.hdodenhof.circleimageview.CircleImageView;
import jzfp.gs.com.juhenews.R;
import jzfp.gs.com.juhenews.adapter.MainPagerAdapter;

public class HomeActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private ViewPager viewPager = null;
    private MainPagerAdapter mainPagerAdapter = null;
    private PagerTitleStrip pagerTitleStrip = null;
    private NavigationView navigationView = null;
    private DrawerLayout drawerLayout = null;
    private CircleImageView circleImageView = null;
    private TextView textViewName = null, textViewEmail = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawerLayout = (DrawerLayout) findViewById(R.id.dl_main);
        navigationView = (NavigationView) findViewById(R.id.nv_left);
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

        mainPagerAdapter = new MainPagerAdapter(getSupportFragmentManager());
        viewPager = (ViewPager) findViewById(R.id.vp_content);
        viewPager.setAdapter(mainPagerAdapter);

        pagerTitleStrip = (PagerTitleStrip) findViewById(R.id.pts);
        pagerTitleStrip.setTextSize(TypedValue.COMPLEX_UNIT_SP, 15);
        pagerTitleStrip.setTextColor(getResources().getColor(R.color.colorWhite));
        pagerTitleStrip.setGravity(Gravity.CENTER);

    }

    @Override
    protected void onResume() {
        super.onResume();
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(this);//getSharedPreferences("jzfp.gs.com.juhenews_preferences.xml", MODE_PRIVATE);
        String imagePath = sp.getString("PROFILE", null);
        if (imagePath != null) {
            File file = new File(imagePath);
            if (file.exists()) {
                Bitmap bitmap = BitmapFactory.decodeFile(imagePath);
                circleImageView.setImageBitmap(bitmap);
            }
        }
        String name = sp.getString("edit_text_preference_name", null);
        textViewName.setText(name);
        String email = sp.getString("edit_text_preference_email", null);
        textViewEmail.setText(email);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        if (drawerLayout.isDrawerOpen(Gravity.LEFT)) {
            drawerLayout.closeDrawers();
        }
        switch (item.getItemId()) {
            case R.id.news:
                viewPager.setCurrentItem(0);
                break;
            case R.id.joke:
                viewPager.setCurrentItem(1);
                break;
            case R.id.history:
                viewPager.setCurrentItem(2);
                break;
            default:
                break;
        }
        return true;
    }

    private void directToSettings() {
        Intent intent = new Intent();
        intent.setClass(this, SettingActivity.class);
        startActivity(intent);
    }
}
