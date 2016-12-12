package jzfp.gs.com.juhenews.gsonbean.newsbean;

/**
 * Created by lisa on 2016/12/2.
 * Email: 457420045@qq.com
 */

import java.util.List;

public class NewsResult {

    private String stat;
    private List<NewsData> data;

    public String getStat() {
        return stat;
    }

    public void setStat(String stat) {
        this.stat = stat;
    }

    public List<NewsData> getData() {
        return data;
    }

    public void setData(List<NewsData> data) {
        this.data = data;
    }

}