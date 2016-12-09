package jzfp.gs.com.juhenews.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.squareup.picasso.Picasso;

import java.util.List;

import jzfp.gs.com.juhenews.R;
import jzfp.gs.com.juhenews.gsonbean.funnybean.FunnyBean;

/**
 * Created by lisa on 2016/12/2.
 */

public class FunnyAdapter extends RecyclerView.Adapter {
    List<FunnyBean.ResultBean.DataBean> funnyData;
    Context context;

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        context = parent.getContext();
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.funnyitem, null, false);
        return (new FunnyViewHolder(view));
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof FunnyViewHolder && funnyData != null) {
            FunnyViewHolder funnyViewHolder = (FunnyViewHolder) holder;
            FunnyBean.ResultBean.DataBean resultBean = funnyData.get(position);

            funnyViewHolder.content.setText(resultBean.getContent());
            //historyViewHolder.content.setText(resultBean.getDes());
            funnyViewHolder.date.setText(resultBean.getUpdatetime());

            String pic = resultBean.getUrl();
            if (pic != null && !pic.isEmpty()) {
                funnyViewHolder.gif.setVisibility(View.VISIBLE);
                Glide.with(context).load(pic).placeholder(R.drawable.share).crossFade().into(funnyViewHolder.gif);
            } else {
                funnyViewHolder.gif.setVisibility(View.GONE);
            }
        }
    }

    @Override
    public int getItemCount() {
        if (funnyData != null) return funnyData.size();
        return 0;
    }

    public void setFunnyData(FunnyBean funnyBean) {
        this.funnyData = funnyBean.getResult().getData();
        notifyDataSetChanged();
    }

    class FunnyViewHolder extends RecyclerView.ViewHolder {
        public TextView content, date;
        public ImageView gif;


        public FunnyViewHolder(View itemView) {
            super(itemView);
            content = (TextView) itemView.findViewById(R.id.tv_funny_title);
            date = (TextView) itemView.findViewById(R.id.tv_funny_date);
            gif = (ImageView) itemView.findViewById(R.id.gv_funny_gif);
        }

    }
}
