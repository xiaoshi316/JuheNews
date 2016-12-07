package jzfp.gs.com.juhenews.gsonbean.newsbean;

/**
 * Created by lisa on 2016/12/2.
 */

import java.util.List;

public class NewsResult {

    private String stat;
    private List<NewsData> data;

    public void setStat(String stat) {
        this.stat = stat;
    }

    public String getStat() {
        return stat;
    }

    public void setData(List<NewsData> data) {
        this.data = data;
    }

    public List<NewsData> getData() {
        return data;
    }

}