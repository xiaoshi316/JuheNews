package jzfp.gs.com.juhenews.activity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.OnTextChanged;
import jzfp.gs.com.juhenews.R;
import jzfp.gs.com.juhenews.adapter.QueryNewsAdapter;
import jzfp.gs.com.juhenews.gsonbean.querynewsbean.QueryNewsBean;
import jzfp.gs.com.juhenews.utils.OkhttpUtils;
import rx.Observable;
import rx.Observer;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class SearchActivity extends AppCompatActivity{


    @BindView(R.id.et_search)
    EditText etSearch;
    @BindView(R.id.rv_searchResult)
    RecyclerView rvSearchResult;
    @BindView(R.id.toolbar_search)
    Toolbar toolbarSearch;
    @BindView(R.id.tv_search)
    TextView tvSearch;

    QueryNewsAdapter queryNewsAdapter;
    ProgressDialog loadingDialog = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        ButterKnife.bind(this);


        loadingDialog = new ProgressDialog(this);
        loadingDialog.setIndeterminate(true);
        loadingDialog.setTitle("提示");
        loadingDialog.setMessage("正在加载...");
        loadingDialog.setCancelable(true);

        toolbarSearch.setNavigationIcon(R.drawable.back);
        setSupportActionBar(toolbarSearch);


        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        queryNewsAdapter = new QueryNewsAdapter();
        rvSearchResult.setAdapter(queryNewsAdapter);
        rvSearchResult.setLayoutManager(linearLayoutManager);

    }

    @OnClick({R.id.tv_search})
    public void onClick() {
        loadingDialog.show();
        if(etSearch.getText().toString()!= null) {
            Observable.create(new Observable.OnSubscribe<String>() {
                @Override
                public void call(Subscriber<? super String> subscriber) {
                    String response =  OkhttpUtils.getCurrentNews(etSearch.getText().toString());
                    subscriber.onNext(response);
                    subscriber.onCompleted();
                }
            }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Observer<String>() {
                @Override
                public void onNext(String response) {
                    Gson gson = new Gson();
                    queryNewsAdapter.setQueryNews(gson.fromJson(response, QueryNewsBean.class));
                }

                @Override
                public void onCompleted() {
                    if(loadingDialog.isShowing()) {
                        loadingDialog.cancel();
                    }
                    if (rvSearchResult.getAdapter().getItemCount() == 0) {
                        Toast  toast = Toast.makeText(SearchActivity.this, "Sorry, 没有搜索到任何东西", Toast.LENGTH_LONG);
                        toast.setGravity(Gravity.CENTER, 0, 0);
                        toast.show();
                    }
                }

                @Override
                public void onError(Throwable e) {
                    //handle exception
                    e.printStackTrace();
                }
            });

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

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                break;
            default:break;
        }
        return true;
    }
}
