package jzfp.gs.com.juhenews.utils;

import android.text.format.Time;

import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by lisa on 2016/12/2.
 * Email: 457420045@qq.com
 */

@SuppressWarnings("deprecation")
public class OkhttpUtils {
    private static final String JOKE_URL = "http://japi.juhe.cn/joke/content/text.from?key=facd3f89a62400877ee559778e89bb6c&page=1&pagesize=20";
    private static final String FUNNY_URL = "http://japi.juhe.cn/joke/img/text.from?key=facd3f89a62400877ee559778e89bb6c&page=1&pagesize=20";

    private static final String HISTORY_URL = "http://api.juheapi.com/japi/toh?key=e5819f08efaa65bc97a7ef93de55cc46&v=1.0";
    /*	类型,,top(头条，默认),shehui(社会),guonei(国内),guoji(国际),yule(娱乐),
    tiyu(体育)junshi(军事),keji(科技),caijing(财经),shishang(时尚)*/
    private static final String NEWS_URL = "http://v.juhe.cn/toutiao/index?type=top&key=53555bf8010e1bf9c42cc0f9fbe8578a";


    private static final OkHttpClient okHttpClient = new OkHttpClient();

    /*获取笑话信息*/
    public static String getJokes() {
        return getContentByURL(JOKE_URL);
    }

    /*获取新闻头条信息*/
    public static String getNews(String type) {
        String URL = "http://v.juhe.cn/toutiao/index?type="+ type + "&key=53555bf8010e1bf9c42cc0f9fbe8578a";
        return getContentByURL(URL);
    }

    /*通过URL获取对应的内容信息*/
    private static String getContentByURL(String url) {
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

    private static String getHistoryOnTodayURL() {
        Time time = new Time("GMT+8");
        time.setToNow();
        return (HISTORY_URL + "&month=" + (time.month + 1) + "&day=" + time.monthDay);
    }

    public static String getHistory() {
        return getContentByURL(getHistoryOnTodayURL());
    }

    public static String getFunny() {
        return getContentByURL(FUNNY_URL);
    }
}
