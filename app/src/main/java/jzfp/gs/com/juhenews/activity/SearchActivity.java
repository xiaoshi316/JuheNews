package jzfp.gs.com.juhenews.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.OnTextChanged;
import jzfp.gs.com.juhenews.R;

public class SearchActivity extends AppCompatActivity{


    @BindView(R.id.et_search)
    EditText etSearch;
    @BindView(R.id.fl_searchResult)
    FrameLayout flSearchResult;
    @BindView(R.id.toolbar_search)
    Toolbar toolbarSearch;
    @BindView(R.id.activity_search)
    LinearLayout activitySearch;
    @BindView(R.id.tv_search)
    TextView tvSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        ButterKnife.bind(this);

        toolbarSearch.setNavigationIcon(R.drawable.back);
        setSupportActionBar(toolbarSearch);
    }

    @OnClick({R.id.tv_search})
    public void onClick() {
        if(etSearch.getText().toString()!= null) {

        }
    }

    @OnTextChanged(R.id.et_search)
    public void onTextChange(CharSequence text){
        if(text!= null) {
            tvSearch.setTextColor(getResources().getColor(R.color.colorBlack));
        } else {
            tvSearch.setTextColor(getResources().getColor(R.color.colorComment));
        }
    }

}
