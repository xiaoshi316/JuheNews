package jzfp.gs.com.juhenews.gsonbean.querynewsbean;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lisa on 2016/12/15.
 * Email: 457420045@qq.com
 */

public class QueryNewsBean {
    /**
     * reason : 查询成功
     * result : [{"title":"Jr·NBA2016邀请赛上海中学国际部喜夺冠","content":"日前,NBA中国举办的\"Jr·NBA2016邀请赛\"于上海协和<em>国际<\/em>学校进行,上海中学<em>国际<\/em>部(SHSID)获得冠军。这是NBA青少年篮球发展项目,也是与教育部战略合作的重要组成部分。  本次赛事参赛对象为14岁及以下的篮球爱好者,共有来自不同学校及俱乐部的百余位小球员组成的8支球队参...","img_width":"","full_title":"Jr·NBA2016邀请赛上海中学国际部喜夺冠","pdate":"27分钟前","src":"国家体育总局","img_length":"","img":"","url":"http://www.sport.gov.cn/n318/n352/c780634/content.html","pdate_src":"2016-12-15 13:14:27"},{"title":"中国青年设计师作品在法国国际建筑设计大赛中获佳绩","content":"新华社巴黎12月14日电(记者张雪飞)由法国雅克·鲁热里基金会和法国研究院(也称法兰西学会)共同举办的第六届<em>国际<\/em>建筑设计大赛颁奖典礼14日晚在位于巴黎的法国研究院举行。两支有中国青年建筑设计师参与的<em>国际<\/em>团队的设计方案分别在两大竞赛单元获得奖项。  这项<em>国际<\/em>建筑设...","img_width":"","full_title":"中国青年设计师作品在法国国际建筑设计大赛中获佳绩","pdate":"29分钟前","src":"新华网","img_length":"","img":"","url":"http://news.xinhuanet.com/world/2016-12/15/c_1120123943.htm","pdate_src":"2016-12-15 13:12:43"},{"title":"(国际)特稿:俄西\"多方博弈\"与\"有限合作\"","content":"当然,尽管俄罗斯与美国等西方国家关系目前还处于几十年来的最低水平,但在打击<em>国际<\/em>恐怖主义、应对欧洲难民危机、维护网络安全与核不扩散等问题上,双方都将不可避免地进行磋商与合作。  可以预见的是,在涉及国家根本利益的时候,美国无法接受有朝一日与俄罗斯平起平坐。而这势...","img_width":"","full_title":"(国际)特稿:俄西\"多方博弈\"与\"有限合作\"","pdate":"35分钟前","src":"和讯网","img_length":"","img":"","url":"http://news.hexun.com/2016-12-15/187356687.html","pdate_src":"2016-12-15 13:07:00"},{"title":"中国学子在法国国际建筑设计大赛斩获佳绩","content":"来自广州的崔子成在颁奖仪式后对记者表示:\"这一比赛主题特殊,面向未来。我对获奖感到很高兴,将来会脚踏实地,继续努力,争取参加更高层次、更加<em>国际<\/em>化的建筑设计比赛。\" 据介绍,\"雅克·鲁热里基金会\"基金会由法兰西学院院士、海洋建筑设计师雅克·鲁热里创建。该基金会主办一...","img_width":"360","full_title":"中国学子在法国国际建筑设计大赛斩获佳绩","pdate":"47分钟前","src":"环球网","img_length":"540","img":"http://p1.qhimg.com/t01fef364960a2f5573.jpg","url":"http://society.huanqiu.com/shrd/2016-12/9815077.html","pdate_src":"2016-12-15 12:55:00"}]
     * error_code : 0
     */

    private String reason;
    private int error_code;
    private List<ResultBean> result;

    public static QueryNewsBean objectFromData(String str) {

        return new Gson().fromJson(str, QueryNewsBean.class);
    }

    public static List<QueryNewsBean> arrayQueryNewsBeanFromData(String str) {

        Type listType = new TypeToken<ArrayList<QueryNewsBean>>() {
        }.getType();

        return new Gson().fromJson(str, listType);
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public List<ResultBean> getResult() {
        return result;
    }

    public void setResult(List<ResultBean> result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         * title : Jr·NBA2016邀请赛上海中学国际部喜夺冠
         * content : 日前,NBA中国举办的"Jr·NBA2016邀请赛"于上海协和<em>国际</em>学校进行,上海中学<em>国际</em>部(SHSID)获得冠军。这是NBA青少年篮球发展项目,也是与教育部战略合作的重要组成部分。  本次赛事参赛对象为14岁及以下的篮球爱好者,共有来自不同学校及俱乐部的百余位小球员组成的8支球队参...
         * img_width :
         * full_title : Jr·NBA2016邀请赛上海中学国际部喜夺冠
         * pdate : 27分钟前
         * src : 国家体育总局
         * img_length :
         * img :
         * url : http://www.sport.gov.cn/n318/n352/c780634/content.html
         * pdate_src : 2016-12-15 13:14:27
         */

        private String title;
        private String content;
        private String img_width;
        private String full_title;
        private String pdate;
        private String src;
        private String img_length;
        private String img;
        private String url;
        private String pdate_src;

        public static ResultBean objectFromData(String str) {

            return new Gson().fromJson(str, ResultBean.class);
        }


        public static List<ResultBean> arrayResultBeanFromData(String str) {

            Type listType = new TypeToken<ArrayList<ResultBean>>() {
            }.getType();

            return new Gson().fromJson(str, listType);
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getImg_width() {
            return img_width;
        }

        public void setImg_width(String img_width) {
            this.img_width = img_width;
        }

        public String getFull_title() {
            return full_title;
        }

        public void setFull_title(String full_title) {
            this.full_title = full_title;
        }

        public String getPdate() {
            return pdate;
        }

        public void setPdate(String pdate) {
            this.pdate = pdate;
        }

        public String getSrc() {
            return src;
        }

        public void setSrc(String src) {
            this.src = src;
        }

        public String getImg_length() {
            return img_length;
        }

        public void setImg_length(String img_length) {
            this.img_length = img_length;
        }

        public String getImg() {
            return img;
        }

        public void setImg(String img) {
            this.img = img;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getPdate_src() {
            return pdate_src;
        }

        public void setPdate_src(String pdate_src) {
            this.pdate_src = pdate_src;
        }
    }
}
