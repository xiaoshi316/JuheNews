package jzfp.gs.com.juhenews.gsonbean.newsbean;

/**
 * Created by lisa on 2016/12/2.
 */

public class NewsData {

    private String title;//标题
    private String date;//日期
    private String author_name;//作者
    private String thumbnail_pic_s;//图片
    private String thumbnail_pic_s02;//图片
    private String thumbnail_pic_s03;//图片
    private String url;//链接
    private String uniquekey;
    private String type;//查询type，头条都属于top
    private String realtype;//新闻类型
    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }

    public void setDate(String date) {
        this.date = date;
    }
    public String getDate() {
        return date;
    }

    public String getAuthor_name() {
        return author_name;
    }

    public void setAuthor_name(String author_name) {
        this.author_name = author_name;
    }

    public String getThumbnail_pic_s02() {
        return thumbnail_pic_s02;
    }

    public void setThumbnail_pic_s02(String thumbnail_pic_s02) {
        this.thumbnail_pic_s02 = thumbnail_pic_s02;
    }

    public String getThumbnail_pic_s03() {
        return thumbnail_pic_s03;
    }

    public void setThumbnail_pic_s03(String thumbnail_pic_s03) {
        this.thumbnail_pic_s03 = thumbnail_pic_s03;
    }

    public String getThumbnail_pic_s() {
        return thumbnail_pic_s;
    }

    public void setThumbnail_pic_s(String thumbnail_pic_s) {
        this.thumbnail_pic_s = thumbnail_pic_s;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    public String getUrl() {
        return url;
    }

    public void setUniquekey(String uniquekey) {
        this.uniquekey = uniquekey;
    }
    public String getUniquekey() {
        return uniquekey;
    }

    public void setType(String type) {
        this.type = type;
    }
    public String getType() {
        return type;
    }

    public void setRealtype(String realtype) {
        this.realtype = realtype;
    }
    public String getRealtype() {
        return realtype;
    }

    @Override
    public String toString() {
        return "NewsData{" +
                "author_name='" + author_name + '\'' +
                ", title='" + title + '\'' +
                ", date='" + date + '\'' +
                ", thumbnail_pic_s='" + thumbnail_pic_s + '\'' +
                ", thumbnail_pic_s02='" + thumbnail_pic_s02 + '\'' +
                ", thumbnail_pic_s03='" + thumbnail_pic_s03 + '\'' +
                ", url='" + url + '\'' +
                ", uniquekey='" + uniquekey + '\'' +
                ", type='" + type + '\'' +
                ", realtype='" + realtype + '\'' +
                '}';
    }
}
