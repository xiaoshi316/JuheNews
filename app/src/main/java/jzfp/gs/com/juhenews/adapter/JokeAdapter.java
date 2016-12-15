package jzfp.gs.com.juhenews.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import jzfp.gs.com.juhenews.R;
import jzfp.gs.com.juhenews.gsonbean.jokebean.JokeBean;

/**
 * Created by lisa on 2016/12/2.
 * Email: 457420045@qq.com
 */

public class JokeAdapter extends RecyclerView.Adapter {
    private List<JokeBean.Data> jokeData;

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.jokeitem, null, false);
        return (new JokeViewHolder(view));
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof JokeViewHolder && jokeData != null) {
            ((JokeViewHolder) holder).content.setText(jokeData.get(position).getContent());
            ((JokeViewHolder) holder).updateTime.setText(jokeData.get(position).getUpdatetime());
        }
    }

    @Override
    public int getItemCount() {
        if (jokeData != null) return jokeData.size();
        return 0;
    }

    public void setJokes(JokeBean jokeBean) {
        this.jokeData = jokeBean.getResult().getData();
        notifyDataSetChanged();
    }

    class JokeViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.tv_joke_content)
        public TextView content;
        @BindView(R.id.tv_joke_updatetime)
        public TextView updateTime;

        public JokeViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
