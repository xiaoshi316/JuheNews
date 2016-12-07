package jzfp.gs.com.juhenews.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

import jzfp.gs.com.juhenews.R;
import jzfp.gs.com.juhenews.gsonbean.historybean.HistoryBean;

/**
 * Created by lisa on 2016/12/2.
 */

public class HistoryAdapter extends RecyclerView.Adapter {
    List<HistoryBean.ResultBean> historyData;
    Context context;

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        context = parent.getContext();
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.historyitem, null, false);
        return (new HistoryViewHolder(view));
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof HistoryViewHolder && historyData != null) {
            HistoryViewHolder historyViewHolder = (HistoryViewHolder) holder;
            HistoryBean.ResultBean resultBean = historyData.get(position);

            historyViewHolder.title.setText(resultBean.getTitle());
            historyViewHolder.content.setText(resultBean.getDes());
            historyViewHolder.date.setText(resultBean.getYear() + "年" + resultBean.getMonth() + "月" + resultBean.getDay() + "日  " + resultBean.getLunar());

            String pic = resultBean.getPic();
            if (pic != null && !pic.isEmpty()) {
                historyViewHolder.pic.setVisibility(View.VISIBLE);
                Picasso.with(context).load(pic).into(historyViewHolder.pic);
            } else {
                historyViewHolder.pic.setVisibility(View.GONE);
            }
        }
    }

    @Override
    public int getItemCount() {
        if (historyData != null) return historyData.size();
        return 0;
    }

    public void setHistory(HistoryBean newsBean) {
        this.historyData = newsBean.getResult();
        notifyDataSetChanged();
    }

    class HistoryViewHolder extends RecyclerView.ViewHolder {
        public TextView title, content, date;
        public ImageView pic;


        public HistoryViewHolder(View itemView) {
            super(itemView);
            title = (TextView) itemView.findViewById(R.id.tv_history_title);
            content = (TextView) itemView.findViewById(R.id.tv_history_content);
            date = (TextView) itemView.findViewById(R.id.tv_history_date);
            pic = (ImageView) itemView.findViewById(R.id.iv_history_pic);

        }

    }
}
