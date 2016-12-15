package jzfp.gs.com.juhenews.adapter;

import android.content.Context;
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
import jzfp.gs.com.juhenews.gsonbean.historybean.HistoryBean;

/**
 * Created by lisa on 2016/12/2.
 * Email: 457420045@qq.com
 */

public class HistoryAdapter extends RecyclerView.Adapter {
    private List<HistoryBean.ResultBean> historyData;
    private Context context;

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
                Glide.with(context).load(pic).placeholder(R.drawable.share).crossFade().into(historyViewHolder.pic);
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
        @BindView(R.id.tv_history_title)
        public TextView title;
        @BindView(R.id.tv_history_content)
        public TextView content;
        @BindView(R.id.tv_history_date)
        public TextView date;
        @BindView(R.id.iv_history_pic)
        public ImageView pic;

        public HistoryViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }

    }
}
