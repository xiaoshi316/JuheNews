package jzfp.gs.com.juhenews.activity;

import android.os.Bundle;
import android.support.v4.view.PagerTitleStrip;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;

import jzfp.gs.com.juhenews.R;
import jzfp.gs.com.juhenews.adapter.MainPagerAdapter;

public class HomeActivity extends AppCompatActivity {
    private Toolbar toolbar = null;
    private ViewPager viewPager = null;
    private MainPagerAdapter mainPagerAdapter = null;
    private PagerTitleStrip pagerTitleStrip = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //透明状态栏
        //getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        //透明导航栏
        //getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);

        mainPagerAdapter = new MainPagerAdapter(getSupportFragmentManager());


        viewPager = (ViewPager) findViewById(R.id.vp_content);
        viewPager.setAdapter(mainPagerAdapter);

        pagerTitleStrip = (PagerTitleStrip)findViewById(R.id.pts);
        pagerTitleStrip.setTextSize(TypedValue.COMPLEX_UNIT_SP, 15);
        pagerTitleStrip.setTextColor(getResources().getColor(R.color.colorWhite));
        pagerTitleStrip.setGravity(Gravity.CENTER);

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

}
