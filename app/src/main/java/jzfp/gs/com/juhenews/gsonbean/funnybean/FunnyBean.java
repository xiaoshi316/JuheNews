package jzfp.gs.com.juhenews.gsonbean.funnybean;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lisa on 2016/12/9.
 */

public class FunnyBean {
    /**
     * error_code : 0
     * reason : Success
     * result : {"data":[{"content":"谁动了我的冰箱！","hashId":"DDE51B6C09E1557D6542627755901308","unixtime":1418967626,"updatetime":"2014-12-19 13:40:26","url":"http://img.juhe.cn/joke/201412/19/DDE51B6C09E1557D6542627755901308.gif"},{"content":"这鱼我怎么抓不到？","hashId":"B0C3ABBEBBE0A6EA5B8FE04E27215FBC","unixtime":1418965236,"updatetime":"2014-12-19 13:00:36","url":"http://img.juhe.cn/joke/201412/19/B0C3ABBEBBE0A6EA5B8FE04E27215FBC.gif"},{"content":"期末考试了，送各位学生党一张图","hashId":"B9EBF01A3C718DABB4C166356CC839A8","unixtime":1418964026,"updatetime":"2014-12-19 12:40:26","url":"http://img.juhe.cn/joke/201412/19/B9EBF01A3C718DABB4C166356CC839A8.jpg"},{"content":"云雨过后，男友抱着我说\u201c想想咱俩还真是有缘\u201d　　\u201c可不是吗，咋俩小学同校，初中同班，高中同桌，大学同寝\u201d","hashId":"62287B57ED97B8A06861ADA51D921CEB","unixtime":1418962826,"updatetime":"2014-12-19 12:20:26","url":"http://img.juhe.cn/joke/201412/19/62287B57ED97B8A06861ADA51D921CEB.jpg"},{"content":"自从有了这个装置，妈妈再也不担心我的起床了！","hashId":"E005FFD7C7A9C80F1C0E8EEF3F44DB71","unixtime":1418961624,"updatetime":"2014-12-19 12:00:24","url":"http://img.juhe.cn/joke/201412/19/E005FFD7C7A9C80F1C0E8EEF3F44DB71.gif"},{"content":"那些神馬有錢任性的都弱爆了，前幾天在銀行辦理業務，一哥們走到櫃檯，哥們：\u201c給我取30萬，謝謝！\u201d一會兒工作人員就說：\u201c先生，對不起！卡上餘額不足。\u201d只見這哥們悠悠衝懷裡掏出手槍：\u201c沒辦法有槍就是任性！！\u201d我想說哥們你搶劫就搶劫，裝神馬B！","hashId":"E3070767518CB4DFEA708DCCC332EE2F","unixtime":1418960433,"updatetime":"2014-12-19 11:40:33","url":"http://img.juhe.cn/joke/201412/19/E3070767518CB4DFEA708DCCC332EE2F.jpg"},{"content":"妹纸你想多了吧。","hashId":"334E065AEF92B5C7ACB1CDD332DE5A59","unixtime":1418956854,"updatetime":"2014-12-19 10:40:54","url":"http://img.juhe.cn/joke/201412/19/334E065AEF92B5C7ACB1CDD332DE5A59.gif"},{"content":"班里一女生对小明说，如果这次考试你在班里能考第一的话，我就同意做你女朋友。考试那天，班里所有同学都把笔往桌上一放，俨然一副交白卷的节奏。多么感人的一幕啊\u2026\u2026 小明一看，直接哭了，然后伴着泪水把试卷吃了。","hashId":"3C77F1A6A8B66083206E44EABDAE7BB6","unixtime":1418955707,"updatetime":"2014-12-19 10:21:47","url":"http://img.juhe.cn/joke/201412/19/3C77F1A6A8B66083206E44EABDAE7BB6.png"},{"content":"最假的碰瓷","hashId":"61B105FCECFD537CA6249CEB71168C17","unixtime":1418954054,"updatetime":"2014-12-19 09:54:14","url":"http://img.juhe.cn/joke/201412/19/61B105FCECFD537CA6249CEB71168C17.gif"},{"content":"你跟这棵树有仇吗","hashId":"02E745D0EDF038C01CA320C3E2FC3780","unixtime":1418954054,"updatetime":"2014-12-19 09:54:14","url":"http://img.juhe.cn/joke/201412/19/02E745D0EDF038C01CA320C3E2FC3780.gif"}]}
     */

    private int error_code;
    private String reason;
    private ResultBean result;

    public static FunnyBean objectFromData(String str) {

        return new Gson().fromJson(str, FunnyBean.class);
    }


    public static List<FunnyBean> arrayFunnyPicBeanFromData(String str) {

        Type listType = new TypeToken<ArrayList<FunnyBean>>() {
        }.getType();

        return new Gson().fromJson(str, listType);
    }


    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public static class ResultBean {
        private List<DataBean> data;

        public static ResultBean objectFromData(String str) {

            return new Gson().fromJson(str, ResultBean.class);
        }


        public static List<ResultBean> arrayResultBeanFromData(String str) {

            Type listType = new TypeToken<ArrayList<ResultBean>>() {
            }.getType();

            return new Gson().fromJson(str, listType);
        }


        public List<DataBean> getData() {
            return data;
        }

        public void setData(List<DataBean> data) {
            this.data = data;
        }

        public static class DataBean {
            /**
             * content : 谁动了我的冰箱！
             * hashId : DDE51B6C09E1557D6542627755901308
             * unixtime : 1418967626
             * updatetime : 2014-12-19 13:40:26
             * url : http://img.juhe.cn/joke/201412/19/DDE51B6C09E1557D6542627755901308.gif
             */

            private String content;
            private String hashId;
            private int unixtime;
            private String updatetime;
            private String url;

            public static DataBean objectFromData(String str) {

                return new Gson().fromJson(str, DataBean.class);
            }


            public static List<DataBean> arrayDataBeanFromData(String str) {

                Type listType = new TypeToken<ArrayList<DataBean>>() {
                }.getType();

                return new Gson().fromJson(str, listType);
            }


            public String getContent() {
                return content;
            }

            public void setContent(String content) {
                this.content = content;
            }

            public String getHashId() {
                return hashId;
            }

            public void setHashId(String hashId) {
                this.hashId = hashId;
            }

            public int getUnixtime() {
                return unixtime;
            }

            public void setUnixtime(int unixtime) {
                this.unixtime = unixtime;
            }

            public String getUpdatetime() {
                return updatetime;
            }

            public void setUpdatetime(String updatetime) {
                this.updatetime = updatetime;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }
        }
    }
}
