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

import com.squareup.picasso.Picasso;

import java.util.List;

import jzfp.gs.com.juhenews.R;
import jzfp.gs.com.juhenews.activity.WebActivity;
import jzfp.gs.com.juhenews.gsonbean.newsbean.NewsBean;
import jzfp.gs.com.juhenews.gsonbean.newsbean.NewsData;

/**
 * Created by lisa on 2016/12/2.
 */

public class NewsAdapter extends RecyclerView.Adapter {
    List<NewsData> newsData;
    Context context;

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
            NewsData data = newsData.get(position);

            newsViewHolder.title.setText(data.getTitle());
            newsViewHolder.author.setText(data.getAuthor_name());
            newsViewHolder.date.setText(data.getDate());

            String pic1path = data.getThumbnail_pic_s();
            String pic2path = data.getThumbnail_pic_s02();
            String pic3path = data.getThumbnail_pic_s03();
            if (pic1path != null) {
                Picasso.with(context).load(pic1path).into(newsViewHolder.pic1);
            }
            if (pic2path != null) {
                Picasso.with(context).load(pic1path).into(newsViewHolder.pic2);
            }
            if (pic3path != null) {
                Picasso.with(context).load(pic1path).into(newsViewHolder.pic3);
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

    public void setNews(NewsBean newsBean) {
        this.newsData = newsBean.getResult().getData();
        notifyDataSetChanged();
    }


    class NewsViewHolder extends RecyclerView.ViewHolder {
        public TextView title, author, date;
        public ImageView pic1, pic2, pic3;


        public NewsViewHolder(View itemView) {
            super(itemView);
            title = (TextView) itemView.findViewById(R.id.tv_news_title);
            author = (TextView) itemView.findViewById(R.id.tv_news_author);
            date = (TextView) itemView.findViewById(R.id.tv_news_date);
            pic1 = (ImageView) itemView.findViewById(R.id.iv_news_pic1);
            pic2 = (ImageView) itemView.findViewById(R.id.iv_news_pic2);
            pic3 = (ImageView) itemView.findViewById(R.id.iv_news_pic3);
        }

    }
}
