package jzfp.gs.com.juhenews.adapter;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import jzfp.gs.com.juhenews.R;
import jzfp.gs.com.juhenews.activity.WebActivity;
import jzfp.gs.com.juhenews.gsonbean.newsbean.NewsBean;
import jzfp.gs.com.juhenews.gsonbean.querynewsbean.QueryNewsBean;

import static android.view.View.GONE;

/**
 * Created by lisa on 2016/12/2.
 * Email: 457420045@qq.com
 */

public class QueryNewsAdapter extends RecyclerView.Adapter {
    private List<QueryNewsBean.ResultBean> newsData;
    private Context context;

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        context = parent.getContext();
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.newsitem, null, false);
        return (new NewsViewHolder(view));
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof NewsViewHolder && newsData != null) {
            NewsViewHolder newsViewHolder = (NewsViewHolder) holder;
            QueryNewsBean.ResultBean data = newsData.get(position);

            newsViewHolder.title.setText(data.getTitle());
            newsViewHolder.author.setText(data.getSrc());
            newsViewHolder.date.setText(data.getPdate());

            String pic1path = data.getImg();
            if (pic1path != null) {
                Glide.with(context).load(pic1path).placeholder(R.mipmap.loading).crossFade().into(newsViewHolder.pic1);
            } else {
                newsViewHolder.pic1.setVisibility(GONE);
            }

            final String url = data.getUrl();
            newsViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent();
                    intent.setClass(context, WebActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putString("URL", url);
                    intent.putExtra("extra", bundle);
                    context.startActivity(intent);
                }
            });
        }
    }

    @Override
    public int getItemCount() {
        if (newsData != null) return newsData.size();
        return 0;
    }

    public void setQueryNews(QueryNewsBean newsBean) {
        this.newsData = newsBean.getResult();
        System.err.println("yidong -- newsData = " + newsData);
        notifyDataSetChanged();
    }


    class NewsViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.tv_news_title)
        public TextView title;
        @BindView(R.id.tv_news_author)
        public TextView author;
        @BindView(R.id.tv_news_date)
        public TextView date;
        @BindView(R.id.iv_news_pic1)
        public ImageView pic1;


        public NewsViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }

    }

}
