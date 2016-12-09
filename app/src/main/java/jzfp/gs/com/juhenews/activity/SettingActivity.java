package jzfp.gs.com.juhenews.activity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.app.NavUtils;
import android.support.v4.app.TaskStackBuilder;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

import java.io.File;
import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;
import jzfp.gs.com.juhenews.R;
import jzfp.gs.com.juhenews.fragment.SettingsFragment;
import me.iwf.photopicker.PhotoPicker;

public class SettingActivity extends AppCompatActivity implements View.OnClickListener {

    private CircleImageView circleImageViewProfile = null;
    private SharedPreferences sharedPreferences = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting_preference);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setNavigationIcon(R.drawable.back);
        setSupportActionBar(toolbar);
        toolbar.setTitleTextAppearance(this, R.style.ToolBarTextAppearance);


        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);//getSharedPreferences("jzfp.gs.com.juhenews_preferences.xml", MODE_PRIVATE);

        circleImageViewProfile = (CircleImageView) findViewById(R.id.civ_image);
        circleImageViewProfile.setOnClickListener(this);
        String imagepath = sharedPreferences.getString("PROFILE", null);
        if (imagepath != null) {
            File file = new File(imagepath);
            if (file.exists()) {
                Bitmap bitmap = BitmapFactory.decodeFile(imagepath);
                circleImageViewProfile.setImageBitmap(bitmap);
            }
        }

        SettingsFragment settingFragment = SettingsFragment.newInstance();

        getSupportFragmentManager().beginTransaction().replace(R.id.fl_content, settingFragment).commit();

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home: {
                Intent upIntent = NavUtils.getParentActivityIntent(this);
                if (NavUtils.shouldUpRecreateTask(this, upIntent)) {
                    TaskStackBuilder.create(this)
                            .addNextIntentWithParentStack(upIntent)
                            .startActivities();
                } else {
                    upIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    NavUtils.navigateUpTo(this, upIntent);
                }
            }
            break;
            default:
                break;
        }
        return true;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.civ_image: {
                System.err.println("yidong -- onClick");
                PhotoPicker.builder()
                        .setPhotoCount(1)
                        .setShowCamera(true)
                        .setShowGif(true)
                        .setPreviewEnabled(false)
                        .start(SettingActivity.this);
            }
            break;
            default:
                break;
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == PhotoPicker.REQUEST_CODE && resultCode == RESULT_OK && data != null) {
            ArrayList<String> photos =
                    data.getStringArrayListExtra(PhotoPicker.KEY_SELECTED_PHOTOS);
            String path = photos.get(0);
            File file = new File(path);
            if (file.exists()) {
                Bitmap bitmap = BitmapFactory.decodeFile(path);
                circleImageViewProfile.setImageBitmap(bitmap);
                if (sharedPreferences != null) {
                    SharedPreferences.Editor editor = sharedPreferences.edit();
                    editor.putString("PROFILE", path);
                    editor.commit();
                }
            }


        }
    }
}
