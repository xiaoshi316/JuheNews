package jzfp.gs.com.juhenews.utils;

import android.text.format.Time;

import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by lisa on 2016/12/2.
 */

public class OkhttpUtils {
    public static final String JOKE_URL = "http://japi.juhe.cn/joke/content/list.from?key=facd3f89a62400877ee559778e89bb6c&page=2&pagesize=10&sort=asc&time=1418745237";
    public static final String NEWS_URL = "http://v.juhe.cn/toutiao/index?type=top&key=53555bf8010e1bf9c42cc0f9fbe8578a";
    public static final String HISTORY_URL = "http://api.juheapi.com/japi/toh?key=e5819f08efaa65bc97a7ef93de55cc46&v=1.0";
    public static final String NBA_URL = "http://op.juhe.cn/onebox/basketball/nba?key=e71455134a8512f406d73fe6597b2344";


    public static OkHttpClient okHttpClient = new OkHttpClient();

    /*获取笑话信息*/
    public static String getJokes() {
        return getContentByURL(JOKE_URL);
    }

    /*获取新闻头条信息*/
    public static String getNews() {
        return getContentByURL(NEWS_URL);
    }

    /*通过URL获取对应的内容信息*/
    public static String getContentByURL(String url) {
        Request request = new Request.Builder().url(url).get().build();
        try {
            Response response = okHttpClient.newCall(request).execute();
            //response.body().string()只能调用一次
            return response.body().string();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String getHistoryOnTodayURL() {
        Time time = new Time("GMT+8");
        time.setToNow();
        return (HISTORY_URL + "&month=" + (time.month + 1) + "&day=" + time.monthDay);
    }

    public static String getHistory() {
        return getContentByURL(getHistoryOnTodayURL());
    }
}
