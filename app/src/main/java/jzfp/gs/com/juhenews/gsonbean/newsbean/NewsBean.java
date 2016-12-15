package jzfp.gs.com.juhenews.gsonbean.newsbean;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lisa on 2016/12/15.
 * Email: 457420045@qq.com
 */

public class NewsBean {


    /**
     * reason : 成功的返回
     * result : {"stat":"1","data":[{"title":"东方八卦：大S复出和老公分房睡，郑爽改行当木工，马思纯劝虹桥一姐找男友","date":"2016-12-15 10:54","author_name":"东方头条","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20161215/20161215105441_c6c8e68e976f1637af113759926a3bd1_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://05.imgmini.eastday.com/mobile/20161215/20161215105441_c6c8e68e976f1637af113759926a3bd1_1_mwpl_05500201.jpg","thumbnail_pic_s03":"http://05.imgmini.eastday.com/mobile/20161215/20161215105441_c6c8e68e976f1637af113759926a3bd1_1_mwpl_05500201.jpg","url":"http://mini.eastday.com/mobile/161215105441390.html?qid=juheshuju","uniquekey":"161215105441390","type":"头条","realtype":"娱乐"},{"title":"女子结过3次婚装白富美 租豪车设陷阱","date":"2016-12-15 08:28","author_name":"成都商报","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20161215/20161215082840_419a91b236a4437efbca82f5dbc978be_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20161215/20161215082840_419a91b236a4437efbca82f5dbc978be_1_mwpl_05500201.jpeg","thumbnail_pic_s03":"http://00.imgmini.eastday.com/mobile/20161215/20161215082840_419a91b236a4437efbca82f5dbc978be_1_mwpl_05500201.jpeg","url":"http://mini.eastday.com/mobile/161215082840320.html?qid=juheshuju","uniquekey":"161215082840320","type":"头条","realtype":"社会"},{"title":"机舱内自摸下体、内衣乱丢 外国人素质高只是个传说","date":"2016-12-15 11:21","author_name":"东方头条","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20161215/20161215112134_930b0ef82c19c9e4a4b035dcd45ec010_1_mwpm_03200403.png","thumbnail_pic_s02":"http://03.imgmini.eastday.com/mobile/20161215/20161215112134_930b0ef82c19c9e4a4b035dcd45ec010_1_mwpl_05500201.png","thumbnail_pic_s03":"http://03.imgmini.eastday.com/mobile/20161215/20161215112134_930b0ef82c19c9e4a4b035dcd45ec010_1_mwpl_05500201.png","url":"http://mini.eastday.com/mobile/161215112134477.html?qid=juheshuju","uniquekey":"161215112134477","type":"头条","realtype":"国际"},{"title":"联合国突然传来一重磅消息：对中国特大利好！","date":"2016-12-15 11:50","author_name":"西陆网","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20161215/20161215115055_f8697b173161d5962b8d8d35c7dbab8d_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://08.imgmini.eastday.com/mobile/20161215/20161215115055_f8697b173161d5962b8d8d35c7dbab8d_1_mwpl_05500201.jpeg","thumbnail_pic_s03":"http://08.imgmini.eastday.com/mobile/20161215/20161215115055_f8697b173161d5962b8d8d35c7dbab8d_1_mwpl_05500201.jpeg","url":"http://mini.eastday.com/mobile/161215115055430.html?qid=juheshuju","uniquekey":"161215115055430","type":"头条","realtype":"军事"},{"title":"幻想吸奶！香港已婚男偷母乳喝 短信骚扰女同事：你的奶好甜","date":"2016-12-15 11:37","author_name":"东方头条","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20161215/20161215113758_de6841558a4291975a4cf0d7d0aea758_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://03.imgmini.eastday.com/mobile/20161215/20161215113758_de6841558a4291975a4cf0d7d0aea758_1_mwpl_05500201.jpg","thumbnail_pic_s03":"http://03.imgmini.eastday.com/mobile/20161215/20161215113758_de6841558a4291975a4cf0d7d0aea758_1_mwpl_05500201.jpg","url":"http://mini.eastday.com/mobile/161215113758483.html?qid=juheshuju","uniquekey":"161215113758483","type":"头条","realtype":"社会"},{"title":"放言5年内超过周杰伦，和豪门千金相恋分手，如今失聪！","date":"2016-12-15 09:39","author_name":"娱乐串串鲜","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20161215/20161215093930_cb364206d858abf31e447bb3c3fbe111_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://08.imgmini.eastday.com/mobile/20161215/20161215093930_cb364206d858abf31e447bb3c3fbe111_1_mwpl_05500201.jpeg","thumbnail_pic_s03":"http://08.imgmini.eastday.com/mobile/20161215/20161215093930_cb364206d858abf31e447bb3c3fbe111_1_mwpl_05500201.jpeg","url":"http://mini.eastday.com/mobile/161215093930903.html?qid=juheshuju","uniquekey":"161215093930903","type":"头条","realtype":"科技"},{"title":"对中国最好的国家曝光，国人打死也想不到！","date":"2016-12-15 11:19","author_name":"内涵神评论","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20161215/20161215111919_7c7ece4fa0051025e2efd1e68d1d3fd8_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20161215/20161215111919_7c7ece4fa0051025e2efd1e68d1d3fd8_1_mwpl_05500201.jpeg","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20161215/20161215111919_7c7ece4fa0051025e2efd1e68d1d3fd8_1_mwpl_05500201.jpeg","url":"http://mini.eastday.com/mobile/161215111919607.html?qid=juheshuju","uniquekey":"161215111919607","type":"头条","realtype":"军事"},{"title":"女子酒后乱性怀孕产子 用矿泉水瓶做鉴定找到生父","date":"2016-12-15 07:40","author_name":"新民网","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20161215/20161215074048_4bd97abf3520b0e654e704094ac959db_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20161215/20161215074048_4bd97abf3520b0e654e704094ac959db_1_mwpl_05500201.jpeg","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20161215/20161215074048_4bd97abf3520b0e654e704094ac959db_1_mwpl_05500201.jpeg","url":"http://mini.eastday.com/mobile/161215074048885.html?qid=juheshuju","uniquekey":"161215074048885","type":"头条","realtype":"社会"},{"title":"给中央政治局讲课的清华教授详解网络强国战略","date":"2016-12-15 12:14","author_name":"凤凰资讯","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20161215/20161215121431_b5e49d3b329f97ad61c38a51e4911ed3_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20161215/20161215121431_b5e49d3b329f97ad61c38a51e4911ed3_1_mwpl_05500201.jpeg","thumbnail_pic_s03":"http://02.imgmini.eastday.com/mobile/20161215/20161215121431_b5e49d3b329f97ad61c38a51e4911ed3_1_mwpl_05500201.jpeg","url":"http://mini.eastday.com/mobile/161215121431481.html?qid=juheshuju","uniquekey":"161215121431481","type":"头条","realtype":"国内"},{"title":"赵构给儿子送十个处女, 十天后作出一决定, 群臣叹服!","date":"2016-12-15 09:02","author_name":"搞哥读史","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20161215/20161215090215_a02a8649476e630220adebf8ef969570_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20161215/20161215090215_a02a8649476e630220adebf8ef969570_1_mwpl_05500201.jpeg","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20161215/20161215090215_a02a8649476e630220adebf8ef969570_1_mwpl_05500201.jpeg","url":"http://mini.eastday.com/mobile/161215090215188.html?qid=juheshuju","uniquekey":"161215090215188","type":"头条","realtype":"历史"},{"title":"中国\u201c最性感\u201d的民族 男人去了把持不住","date":"2016-12-15 07:07","author_name":"凤凰网","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20161215/20161215070757_66ff6dd691a4fa5f5dfc7afbb8b53def_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://03.imgmini.eastday.com/mobile/20161215/20161215070757_66ff6dd691a4fa5f5dfc7afbb8b53def_1_mwpl_05500201.jpeg","thumbnail_pic_s03":"http://03.imgmini.eastday.com/mobile/20161215/20161215070757_66ff6dd691a4fa5f5dfc7afbb8b53def_1_mwpl_05500201.jpeg","url":"http://mini.eastday.com/mobile/161215070757951.html?qid=juheshuju","uniquekey":"161215070757951","type":"头条","realtype":"科技"},{"title":"男子野外河边发现三具漂浮尸体，打捞上来后让人羡慕不已","date":"2016-12-15 12:27","author_name":"宠物资讯","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20161215/20161215122741_38598542c8ef57ca64a95c93ebd54776_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://06.imgmini.eastday.com/mobile/20161215/20161215122741_38598542c8ef57ca64a95c93ebd54776_1_mwpl_05500201.jpeg","thumbnail_pic_s03":"http://06.imgmini.eastday.com/mobile/20161215/20161215122741_38598542c8ef57ca64a95c93ebd54776_1_mwpl_05500201.jpeg","url":"http://mini.eastday.com/mobile/161215122741630.html?qid=juheshuju","uniquekey":"161215122741630","type":"头条","realtype":"国际"},{"title":"在农村有三种人惹不起还得要巴结呢","date":"2016-12-15 10:15","author_name":"珍茜幸福","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20161215/20161215101525_61180018387a260b56dabad9928e6164_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20161215/20161215101525_61180018387a260b56dabad9928e6164_1_mwpl_05500201.jpeg","thumbnail_pic_s03":"http://02.imgmini.eastday.com/mobile/20161215/20161215101525_61180018387a260b56dabad9928e6164_1_mwpl_05500201.jpeg","url":"http://mini.eastday.com/mobile/161215101525340.html?qid=juheshuju","uniquekey":"161215101525340","type":"头条","realtype":"社会"},{"title":"中国核聚变技术全球第一：美国只能痛苦承认被反超","date":"2016-12-15 11:19","author_name":"西夏铁骑","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20161215/20161215111921_9131955ca57d325e3c3834a6cf4ad5e7_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20161215/20161215111921_9131955ca57d325e3c3834a6cf4ad5e7_1_mwpl_05500201.jpeg","thumbnail_pic_s03":"http://09.imgmini.eastday.com/mobile/20161215/20161215111921_9131955ca57d325e3c3834a6cf4ad5e7_1_mwpl_05500201.jpeg","url":"http://mini.eastday.com/mobile/161215111921598.html?qid=juheshuju","uniquekey":"161215111921598","type":"头条","realtype":"军事"},{"title":"女司机撞死人了竟不知道 夜驾车底伸出一只血手","date":"2016-12-14 14:26","author_name":"狐che","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20161214/20161214142614_ea2ff968273ec26d90f25b36e31a15a4_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20161214/20161214142614_ea2ff968273ec26d90f25b36e31a15a4_1_mwpl_05500201.jpeg","thumbnail_pic_s03":"http://00.imgmini.eastday.com/mobile/20161214/20161214142614_ea2ff968273ec26d90f25b36e31a15a4_1_mwpl_05500201.jpeg","url":"http://mini.eastday.com/mobile/161214142614320.html?qid=juheshuju","uniquekey":"161214142614320","type":"头条","realtype":"汽车"},{"title":"中国已成单身大国，2亿男女没对象近，4成单身女性不想结婚","date":"2016-12-15 11:34","author_name":"优先采纳","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20161215/20161215113458_4695397e0635517efec98955e6ff1fbb_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20161215/20161215113458_4695397e0635517efec98955e6ff1fbb_1_mwpl_05500201.jpeg","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20161215/20161215113458_4695397e0635517efec98955e6ff1fbb_1_mwpl_05500201.jpeg","url":"http://mini.eastday.com/mobile/161215113458659.html?qid=juheshuju","uniquekey":"161215113458659","type":"头条","realtype":"国际"},{"title":"东方图秀：16岁\u201c袭胸狂魔\u201d摸遍女明星 谢娜是她第一个\u201c猎物\u201d","date":"2016-12-14 13:37","author_name":"东方头条","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20161214/20161214133734_24a3c60909533a27d27c6afae4b6b886_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20161214/20161214133734_24a3c60909533a27d27c6afae4b6b886_1_mwpl_05500201.jpg","thumbnail_pic_s03":"http://04.imgmini.eastday.com/mobile/20161214/20161214133734_24a3c60909533a27d27c6afae4b6b886_1_mwpl_05500201.jpg","url":"http://mini.eastday.com/mobile/161214133734717.html?qid=juheshuju","uniquekey":"161214133734717","type":"头条","realtype":"社会"},{"title":"智利经济部长带充气娃娃参加商务峰会","date":"2016-12-15 11:09","author_name":"腾讯网","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20161215/20161215110950_97d62ac5719ac6ab4cf3bd8b6236e82e_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://03.imgmini.eastday.com/mobile/20161215/20161215110950_97d62ac5719ac6ab4cf3bd8b6236e82e_1_mwpl_05500201.jpeg","thumbnail_pic_s03":"http://03.imgmini.eastday.com/mobile/20161215/20161215110950_97d62ac5719ac6ab4cf3bd8b6236e82e_1_mwpl_05500201.jpeg","url":"http://mini.eastday.com/mobile/161215110950037.html?qid=juheshuju","uniquekey":"161215110950037","type":"头条","realtype":"国际"},{"title":"这就是报应！中国突然抡起对美国制裁大棒","date":"2016-12-15 11:55","author_name":"强国军事","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20161215/20161215115558_7e4ee1292566d9d5a2231f4b195d252b_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://03.imgmini.eastday.com/mobile/20161215/20161215115558_7e4ee1292566d9d5a2231f4b195d252b_1_mwpl_05500201.jpeg","thumbnail_pic_s03":"http://03.imgmini.eastday.com/mobile/20161215/20161215115558_7e4ee1292566d9d5a2231f4b195d252b_1_mwpl_05500201.jpeg","url":"http://mini.eastday.com/mobile/161215115558050.html?qid=juheshuju","uniquekey":"161215115558050","type":"头条","realtype":"军事"},{"title":"怒甩48斤肥肉逆袭成女神 现恋上男神玄彬","date":"2016-12-15 10:45","author_name":"腾讯娱乐","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20161215/20161215104525_b5876b14c5e19d052653e97e4cfbf0cc_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://05.imgmini.eastday.com/mobile/20161215/20161215104525_b5876b14c5e19d052653e97e4cfbf0cc_1_mwpl_05500201.jpeg","thumbnail_pic_s03":"http://05.imgmini.eastday.com/mobile/20161215/20161215104525_b5876b14c5e19d052653e97e4cfbf0cc_1_mwpl_05500201.jpeg","url":"http://mini.eastday.com/mobile/161215104525399.html?qid=juheshuju","uniquekey":"161215104525399","type":"头条","realtype":"娱乐"},{"title":"妈妈带十岁男孩进女澡堂 家长心太大让人尴尬","date":"2016-12-14 12:20","author_name":"天津北方网","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20161214/20161214122040_9b20cb412d1462eb5e59d55d8e86fd3d_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20161214/20161214122040_9b20cb412d1462eb5e59d55d8e86fd3d_1_mwpl_05500201.jpeg","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20161214/20161214122040_9b20cb412d1462eb5e59d55d8e86fd3d_1_mwpl_05500201.jpeg","url":"http://mini.eastday.com/mobile/161214122040341.html?qid=juheshuju","uniquekey":"161214122040341","type":"头条","realtype":"国内"},{"title":"专家对这只海豚下了死亡宣言，没想它创造了奇迹！","date":"2016-12-15 10:29","author_name":"有宠","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20161215/20161215_e06364144f216e35088c2aca5c228880_mwpm_03200403.png","thumbnail_pic_s02":"http://01.imgmini.eastday.com/mobile/20161215/20161215_e06364144f216e35088c2aca5c228880_mwpl_05500201.png","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20161215/20161215_e06364144f216e35088c2aca5c228880_mwpl_05500201.png","url":"http://mini.eastday.com/mobile/161215102956532.html?qid=juheshuju","uniquekey":"161215102956532","type":"头条","realtype":"国际"},{"title":"\u201c李莫愁\u201d17岁未婚生子遭抛弃 51岁依旧单身","date":"2016-12-15 08:36","author_name":"凤凰网娱乐","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20161215/20161215083644_8e859d3b44cdb592a773b2c3b970e7ee_2_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20161215/20161215083644_8e859d3b44cdb592a773b2c3b970e7ee_2_mwpl_05500201.jpeg","thumbnail_pic_s03":"http://00.imgmini.eastday.com/mobile/20161215/20161215083644_8e859d3b44cdb592a773b2c3b970e7ee_2_mwpl_05500201.jpeg","url":"http://mini.eastday.com/mobile/161215083644016.html?qid=juheshuju","uniquekey":"161215083644016","type":"头条","realtype":"娱乐"},{"title":"夫妇骗400多人6000多万 住宅豪华一根柱子20万","date":"2016-12-15 04:08","author_name":"华商报","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20161215/20161215040814_12e1ba2e513dd909a1d3332ca2fb5505_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20161215/20161215040814_12e1ba2e513dd909a1d3332ca2fb5505_1_mwpl_05500201.jpeg","thumbnail_pic_s03":"http://00.imgmini.eastday.com/mobile/20161215/20161215040814_12e1ba2e513dd909a1d3332ca2fb5505_1_mwpl_05500201.jpeg","url":"http://mini.eastday.com/mobile/161215040814592.html?qid=juheshuju","uniquekey":"161215040814592","type":"头条","realtype":"社会"},{"title":"韩女团GFRIEND穿毛衣厚外套 下身却光腿","date":"2016-12-15 11:37","author_name":"bntnews","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20161215/20161215113759_e49027f80056c20bb3283818d0b8a31e_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20161215/20161215113759_e49027f80056c20bb3283818d0b8a31e_1_mwpl_05500201.jpeg","thumbnail_pic_s03":"http://00.imgmini.eastday.com/mobile/20161215/20161215113759_e49027f80056c20bb3283818d0b8a31e_1_mwpl_05500201.jpeg","url":"http://mini.eastday.com/mobile/161215113759188.html?qid=juheshuju","uniquekey":"161215113759188","type":"头条","realtype":"娱乐"},{"title":"男子吃出带牙黄焖鸡续:\"老鼠头\"经检测实为鸡肉","date":"2016-12-15 10:24","author_name":"大河报","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20161215/20161215102419_28cacdd8472c5461e6afe6a84651e3e4_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://01.imgmini.eastday.com/mobile/20161215/20161215102419_28cacdd8472c5461e6afe6a84651e3e4_1_mwpl_05500201.jpeg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20161215/20161215102419_28cacdd8472c5461e6afe6a84651e3e4_1_mwpl_05500201.jpeg","url":"http://mini.eastday.com/mobile/161215102419211.html?qid=juheshuju","uniquekey":"161215102419211","type":"头条","realtype":"社会"},{"title":"未来3年过后，走好运一直到老的人","date":"2016-12-15 10:25","author_name":"李师傅情感分析","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20161215/20161215102546_5557f811d68f16dc6b6f283472bdf456_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://06.imgmini.eastday.com/mobile/20161215/20161215102546_5557f811d68f16dc6b6f283472bdf456_1_mwpl_05500201.jpeg","thumbnail_pic_s03":"http://06.imgmini.eastday.com/mobile/20161215/20161215102546_5557f811d68f16dc6b6f283472bdf456_1_mwpl_05500201.jpeg","url":"http://mini.eastday.com/mobile/161215102546804.html?qid=juheshuju","uniquekey":"161215102546804","type":"头条","realtype":"星座"},{"title":"美媒：特朗普长女或入主第一夫人办公室 承担白宫女主人职责","date":"2016-12-15 10:32","author_name":"中国日报网","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20161215/20161215103210_c1fc49d117f6a31d6982ee7f6056a110_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://03.imgmini.eastday.com/mobile/20161215/20161215103210_c1fc49d117f6a31d6982ee7f6056a110_1_mwpl_05500201.jpeg","thumbnail_pic_s03":"http://03.imgmini.eastday.com/mobile/20161215/20161215103210_c1fc49d117f6a31d6982ee7f6056a110_1_mwpl_05500201.jpeg","url":"http://mini.eastday.com/mobile/161215103210902.html?qid=juheshuju","uniquekey":"161215103210902","type":"头条","realtype":"国际"},{"title":"江西省卫计委主任李利任江西省副省长","date":"2016-12-15 11:14","author_name":"\u201c江西日报时政头条\u201d微信公众号","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20161215/20161215111441_620032b7ff2d321cc8eacdc27cf234ce_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://05.imgmini.eastday.com/mobile/20161215/20161215111441_620032b7ff2d321cc8eacdc27cf234ce_1_mwpl_05500201.jpeg","thumbnail_pic_s03":"http://05.imgmini.eastday.com/mobile/20161215/20161215111441_620032b7ff2d321cc8eacdc27cf234ce_1_mwpl_05500201.jpeg","url":"http://mini.eastday.com/mobile/161215111441649.html?qid=juheshuju","uniquekey":"161215111441649","type":"头条","realtype":"国内"},{"title":"5岁孩子回家呕吐高烧流鼻血 看监控才知被老师打","date":"2016-12-15 09:09","author_name":"黑龙江晨报","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20161215/20161215090952_1d8835bb074084d65dd0debe3fd091aa_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://01.imgmini.eastday.com/mobile/20161215/20161215090952_1d8835bb074084d65dd0debe3fd091aa_1_mwpl_05500201.jpeg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20161215/20161215090952_1d8835bb074084d65dd0debe3fd091aa_1_mwpl_05500201.jpeg","url":"http://mini.eastday.com/mobile/161215090952569.html?qid=juheshuju","uniquekey":"161215090952569","type":"头条","realtype":"社会"},{"title":"统计局：11月原煤产量同比降幅明显收窄 价格回落","date":"2016-12-15 11:28","author_name":"中国新闻网","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20161215/20161215112815_61b3b5af10f0c4d7ce9365a8e106ef1c_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20161215/20161215112815_61b3b5af10f0c4d7ce9365a8e106ef1c_1_mwpl_05500201.jpeg","thumbnail_pic_s03":"http://02.imgmini.eastday.com/mobile/20161215/20161215112815_61b3b5af10f0c4d7ce9365a8e106ef1c_1_mwpl_05500201.jpeg","url":"http://mini.eastday.com/mobile/161215112815903.html?qid=juheshuju","uniquekey":"161215112815903","type":"头条","realtype":"国内"}]}
     * error_code : 0
     */

    private String reason;
    private ResultBean result;
    private int error_code;

    public static NewsBean objectFromData(String str) {

        return new Gson().fromJson(str, NewsBean.class);
    }


    public static List<NewsBean> arrayNewsBeanFromData(String str) {

        Type listType = new TypeToken<ArrayList<NewsBean>>() {
        }.getType();

        return new Gson().fromJson(str, listType);
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

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public static class ResultBean {
        /**
         * stat : 1
         * data : [{"title":"东方八卦：大S复出和老公分房睡，郑爽改行当木工，马思纯劝虹桥一姐找男友","date":"2016-12-15 10:54","author_name":"东方头条","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20161215/20161215105441_c6c8e68e976f1637af113759926a3bd1_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://05.imgmini.eastday.com/mobile/20161215/20161215105441_c6c8e68e976f1637af113759926a3bd1_1_mwpl_05500201.jpg","thumbnail_pic_s03":"http://05.imgmini.eastday.com/mobile/20161215/20161215105441_c6c8e68e976f1637af113759926a3bd1_1_mwpl_05500201.jpg","url":"http://mini.eastday.com/mobile/161215105441390.html?qid=juheshuju","uniquekey":"161215105441390","type":"头条","realtype":"娱乐"},{"title":"女子结过3次婚装白富美 租豪车设陷阱","date":"2016-12-15 08:28","author_name":"成都商报","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20161215/20161215082840_419a91b236a4437efbca82f5dbc978be_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20161215/20161215082840_419a91b236a4437efbca82f5dbc978be_1_mwpl_05500201.jpeg","thumbnail_pic_s03":"http://00.imgmini.eastday.com/mobile/20161215/20161215082840_419a91b236a4437efbca82f5dbc978be_1_mwpl_05500201.jpeg","url":"http://mini.eastday.com/mobile/161215082840320.html?qid=juheshuju","uniquekey":"161215082840320","type":"头条","realtype":"社会"},{"title":"机舱内自摸下体、内衣乱丢 外国人素质高只是个传说","date":"2016-12-15 11:21","author_name":"东方头条","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20161215/20161215112134_930b0ef82c19c9e4a4b035dcd45ec010_1_mwpm_03200403.png","thumbnail_pic_s02":"http://03.imgmini.eastday.com/mobile/20161215/20161215112134_930b0ef82c19c9e4a4b035dcd45ec010_1_mwpl_05500201.png","thumbnail_pic_s03":"http://03.imgmini.eastday.com/mobile/20161215/20161215112134_930b0ef82c19c9e4a4b035dcd45ec010_1_mwpl_05500201.png","url":"http://mini.eastday.com/mobile/161215112134477.html?qid=juheshuju","uniquekey":"161215112134477","type":"头条","realtype":"国际"},{"title":"联合国突然传来一重磅消息：对中国特大利好！","date":"2016-12-15 11:50","author_name":"西陆网","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20161215/20161215115055_f8697b173161d5962b8d8d35c7dbab8d_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://08.imgmini.eastday.com/mobile/20161215/20161215115055_f8697b173161d5962b8d8d35c7dbab8d_1_mwpl_05500201.jpeg","thumbnail_pic_s03":"http://08.imgmini.eastday.com/mobile/20161215/20161215115055_f8697b173161d5962b8d8d35c7dbab8d_1_mwpl_05500201.jpeg","url":"http://mini.eastday.com/mobile/161215115055430.html?qid=juheshuju","uniquekey":"161215115055430","type":"头条","realtype":"军事"},{"title":"幻想吸奶！香港已婚男偷母乳喝 短信骚扰女同事：你的奶好甜","date":"2016-12-15 11:37","author_name":"东方头条","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20161215/20161215113758_de6841558a4291975a4cf0d7d0aea758_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://03.imgmini.eastday.com/mobile/20161215/20161215113758_de6841558a4291975a4cf0d7d0aea758_1_mwpl_05500201.jpg","thumbnail_pic_s03":"http://03.imgmini.eastday.com/mobile/20161215/20161215113758_de6841558a4291975a4cf0d7d0aea758_1_mwpl_05500201.jpg","url":"http://mini.eastday.com/mobile/161215113758483.html?qid=juheshuju","uniquekey":"161215113758483","type":"头条","realtype":"社会"},{"title":"放言5年内超过周杰伦，和豪门千金相恋分手，如今失聪！","date":"2016-12-15 09:39","author_name":"娱乐串串鲜","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20161215/20161215093930_cb364206d858abf31e447bb3c3fbe111_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://08.imgmini.eastday.com/mobile/20161215/20161215093930_cb364206d858abf31e447bb3c3fbe111_1_mwpl_05500201.jpeg","thumbnail_pic_s03":"http://08.imgmini.eastday.com/mobile/20161215/20161215093930_cb364206d858abf31e447bb3c3fbe111_1_mwpl_05500201.jpeg","url":"http://mini.eastday.com/mobile/161215093930903.html?qid=juheshuju","uniquekey":"161215093930903","type":"头条","realtype":"科技"},{"title":"对中国最好的国家曝光，国人打死也想不到！","date":"2016-12-15 11:19","author_name":"内涵神评论","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20161215/20161215111919_7c7ece4fa0051025e2efd1e68d1d3fd8_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20161215/20161215111919_7c7ece4fa0051025e2efd1e68d1d3fd8_1_mwpl_05500201.jpeg","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20161215/20161215111919_7c7ece4fa0051025e2efd1e68d1d3fd8_1_mwpl_05500201.jpeg","url":"http://mini.eastday.com/mobile/161215111919607.html?qid=juheshuju","uniquekey":"161215111919607","type":"头条","realtype":"军事"},{"title":"女子酒后乱性怀孕产子 用矿泉水瓶做鉴定找到生父","date":"2016-12-15 07:40","author_name":"新民网","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20161215/20161215074048_4bd97abf3520b0e654e704094ac959db_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20161215/20161215074048_4bd97abf3520b0e654e704094ac959db_1_mwpl_05500201.jpeg","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20161215/20161215074048_4bd97abf3520b0e654e704094ac959db_1_mwpl_05500201.jpeg","url":"http://mini.eastday.com/mobile/161215074048885.html?qid=juheshuju","uniquekey":"161215074048885","type":"头条","realtype":"社会"},{"title":"给中央政治局讲课的清华教授详解网络强国战略","date":"2016-12-15 12:14","author_name":"凤凰资讯","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20161215/20161215121431_b5e49d3b329f97ad61c38a51e4911ed3_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20161215/20161215121431_b5e49d3b329f97ad61c38a51e4911ed3_1_mwpl_05500201.jpeg","thumbnail_pic_s03":"http://02.imgmini.eastday.com/mobile/20161215/20161215121431_b5e49d3b329f97ad61c38a51e4911ed3_1_mwpl_05500201.jpeg","url":"http://mini.eastday.com/mobile/161215121431481.html?qid=juheshuju","uniquekey":"161215121431481","type":"头条","realtype":"国内"},{"title":"赵构给儿子送十个处女, 十天后作出一决定, 群臣叹服!","date":"2016-12-15 09:02","author_name":"搞哥读史","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20161215/20161215090215_a02a8649476e630220adebf8ef969570_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20161215/20161215090215_a02a8649476e630220adebf8ef969570_1_mwpl_05500201.jpeg","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20161215/20161215090215_a02a8649476e630220adebf8ef969570_1_mwpl_05500201.jpeg","url":"http://mini.eastday.com/mobile/161215090215188.html?qid=juheshuju","uniquekey":"161215090215188","type":"头条","realtype":"历史"},{"title":"中国\u201c最性感\u201d的民族 男人去了把持不住","date":"2016-12-15 07:07","author_name":"凤凰网","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20161215/20161215070757_66ff6dd691a4fa5f5dfc7afbb8b53def_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://03.imgmini.eastday.com/mobile/20161215/20161215070757_66ff6dd691a4fa5f5dfc7afbb8b53def_1_mwpl_05500201.jpeg","thumbnail_pic_s03":"http://03.imgmini.eastday.com/mobile/20161215/20161215070757_66ff6dd691a4fa5f5dfc7afbb8b53def_1_mwpl_05500201.jpeg","url":"http://mini.eastday.com/mobile/161215070757951.html?qid=juheshuju","uniquekey":"161215070757951","type":"头条","realtype":"科技"},{"title":"男子野外河边发现三具漂浮尸体，打捞上来后让人羡慕不已","date":"2016-12-15 12:27","author_name":"宠物资讯","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20161215/20161215122741_38598542c8ef57ca64a95c93ebd54776_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://06.imgmini.eastday.com/mobile/20161215/20161215122741_38598542c8ef57ca64a95c93ebd54776_1_mwpl_05500201.jpeg","thumbnail_pic_s03":"http://06.imgmini.eastday.com/mobile/20161215/20161215122741_38598542c8ef57ca64a95c93ebd54776_1_mwpl_05500201.jpeg","url":"http://mini.eastday.com/mobile/161215122741630.html?qid=juheshuju","uniquekey":"161215122741630","type":"头条","realtype":"国际"},{"title":"在农村有三种人惹不起还得要巴结呢","date":"2016-12-15 10:15","author_name":"珍茜幸福","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20161215/20161215101525_61180018387a260b56dabad9928e6164_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20161215/20161215101525_61180018387a260b56dabad9928e6164_1_mwpl_05500201.jpeg","thumbnail_pic_s03":"http://02.imgmini.eastday.com/mobile/20161215/20161215101525_61180018387a260b56dabad9928e6164_1_mwpl_05500201.jpeg","url":"http://mini.eastday.com/mobile/161215101525340.html?qid=juheshuju","uniquekey":"161215101525340","type":"头条","realtype":"社会"},{"title":"中国核聚变技术全球第一：美国只能痛苦承认被反超","date":"2016-12-15 11:19","author_name":"西夏铁骑","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20161215/20161215111921_9131955ca57d325e3c3834a6cf4ad5e7_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20161215/20161215111921_9131955ca57d325e3c3834a6cf4ad5e7_1_mwpl_05500201.jpeg","thumbnail_pic_s03":"http://09.imgmini.eastday.com/mobile/20161215/20161215111921_9131955ca57d325e3c3834a6cf4ad5e7_1_mwpl_05500201.jpeg","url":"http://mini.eastday.com/mobile/161215111921598.html?qid=juheshuju","uniquekey":"161215111921598","type":"头条","realtype":"军事"},{"title":"女司机撞死人了竟不知道 夜驾车底伸出一只血手","date":"2016-12-14 14:26","author_name":"狐che","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20161214/20161214142614_ea2ff968273ec26d90f25b36e31a15a4_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20161214/20161214142614_ea2ff968273ec26d90f25b36e31a15a4_1_mwpl_05500201.jpeg","thumbnail_pic_s03":"http://00.imgmini.eastday.com/mobile/20161214/20161214142614_ea2ff968273ec26d90f25b36e31a15a4_1_mwpl_05500201.jpeg","url":"http://mini.eastday.com/mobile/161214142614320.html?qid=juheshuju","uniquekey":"161214142614320","type":"头条","realtype":"汽车"},{"title":"中国已成单身大国，2亿男女没对象近，4成单身女性不想结婚","date":"2016-12-15 11:34","author_name":"优先采纳","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20161215/20161215113458_4695397e0635517efec98955e6ff1fbb_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20161215/20161215113458_4695397e0635517efec98955e6ff1fbb_1_mwpl_05500201.jpeg","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20161215/20161215113458_4695397e0635517efec98955e6ff1fbb_1_mwpl_05500201.jpeg","url":"http://mini.eastday.com/mobile/161215113458659.html?qid=juheshuju","uniquekey":"161215113458659","type":"头条","realtype":"国际"},{"title":"东方图秀：16岁\u201c袭胸狂魔\u201d摸遍女明星 谢娜是她第一个\u201c猎物\u201d","date":"2016-12-14 13:37","author_name":"东方头条","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20161214/20161214133734_24a3c60909533a27d27c6afae4b6b886_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20161214/20161214133734_24a3c60909533a27d27c6afae4b6b886_1_mwpl_05500201.jpg","thumbnail_pic_s03":"http://04.imgmini.eastday.com/mobile/20161214/20161214133734_24a3c60909533a27d27c6afae4b6b886_1_mwpl_05500201.jpg","url":"http://mini.eastday.com/mobile/161214133734717.html?qid=juheshuju","uniquekey":"161214133734717","type":"头条","realtype":"社会"},{"title":"智利经济部长带充气娃娃参加商务峰会","date":"2016-12-15 11:09","author_name":"腾讯网","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20161215/20161215110950_97d62ac5719ac6ab4cf3bd8b6236e82e_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://03.imgmini.eastday.com/mobile/20161215/20161215110950_97d62ac5719ac6ab4cf3bd8b6236e82e_1_mwpl_05500201.jpeg","thumbnail_pic_s03":"http://03.imgmini.eastday.com/mobile/20161215/20161215110950_97d62ac5719ac6ab4cf3bd8b6236e82e_1_mwpl_05500201.jpeg","url":"http://mini.eastday.com/mobile/161215110950037.html?qid=juheshuju","uniquekey":"161215110950037","type":"头条","realtype":"国际"},{"title":"这就是报应！中国突然抡起对美国制裁大棒","date":"2016-12-15 11:55","author_name":"强国军事","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20161215/20161215115558_7e4ee1292566d9d5a2231f4b195d252b_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://03.imgmini.eastday.com/mobile/20161215/20161215115558_7e4ee1292566d9d5a2231f4b195d252b_1_mwpl_05500201.jpeg","thumbnail_pic_s03":"http://03.imgmini.eastday.com/mobile/20161215/20161215115558_7e4ee1292566d9d5a2231f4b195d252b_1_mwpl_05500201.jpeg","url":"http://mini.eastday.com/mobile/161215115558050.html?qid=juheshuju","uniquekey":"161215115558050","type":"头条","realtype":"军事"},{"title":"怒甩48斤肥肉逆袭成女神 现恋上男神玄彬","date":"2016-12-15 10:45","author_name":"腾讯娱乐","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20161215/20161215104525_b5876b14c5e19d052653e97e4cfbf0cc_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://05.imgmini.eastday.com/mobile/20161215/20161215104525_b5876b14c5e19d052653e97e4cfbf0cc_1_mwpl_05500201.jpeg","thumbnail_pic_s03":"http://05.imgmini.eastday.com/mobile/20161215/20161215104525_b5876b14c5e19d052653e97e4cfbf0cc_1_mwpl_05500201.jpeg","url":"http://mini.eastday.com/mobile/161215104525399.html?qid=juheshuju","uniquekey":"161215104525399","type":"头条","realtype":"娱乐"},{"title":"妈妈带十岁男孩进女澡堂 家长心太大让人尴尬","date":"2016-12-14 12:20","author_name":"天津北方网","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20161214/20161214122040_9b20cb412d1462eb5e59d55d8e86fd3d_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20161214/20161214122040_9b20cb412d1462eb5e59d55d8e86fd3d_1_mwpl_05500201.jpeg","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20161214/20161214122040_9b20cb412d1462eb5e59d55d8e86fd3d_1_mwpl_05500201.jpeg","url":"http://mini.eastday.com/mobile/161214122040341.html?qid=juheshuju","uniquekey":"161214122040341","type":"头条","realtype":"国内"},{"title":"专家对这只海豚下了死亡宣言，没想它创造了奇迹！","date":"2016-12-15 10:29","author_name":"有宠","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20161215/20161215_e06364144f216e35088c2aca5c228880_mwpm_03200403.png","thumbnail_pic_s02":"http://01.imgmini.eastday.com/mobile/20161215/20161215_e06364144f216e35088c2aca5c228880_mwpl_05500201.png","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20161215/20161215_e06364144f216e35088c2aca5c228880_mwpl_05500201.png","url":"http://mini.eastday.com/mobile/161215102956532.html?qid=juheshuju","uniquekey":"161215102956532","type":"头条","realtype":"国际"},{"title":"\u201c李莫愁\u201d17岁未婚生子遭抛弃 51岁依旧单身","date":"2016-12-15 08:36","author_name":"凤凰网娱乐","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20161215/20161215083644_8e859d3b44cdb592a773b2c3b970e7ee_2_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20161215/20161215083644_8e859d3b44cdb592a773b2c3b970e7ee_2_mwpl_05500201.jpeg","thumbnail_pic_s03":"http://00.imgmini.eastday.com/mobile/20161215/20161215083644_8e859d3b44cdb592a773b2c3b970e7ee_2_mwpl_05500201.jpeg","url":"http://mini.eastday.com/mobile/161215083644016.html?qid=juheshuju","uniquekey":"161215083644016","type":"头条","realtype":"娱乐"},{"title":"夫妇骗400多人6000多万 住宅豪华一根柱子20万","date":"2016-12-15 04:08","author_name":"华商报","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20161215/20161215040814_12e1ba2e513dd909a1d3332ca2fb5505_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20161215/20161215040814_12e1ba2e513dd909a1d3332ca2fb5505_1_mwpl_05500201.jpeg","thumbnail_pic_s03":"http://00.imgmini.eastday.com/mobile/20161215/20161215040814_12e1ba2e513dd909a1d3332ca2fb5505_1_mwpl_05500201.jpeg","url":"http://mini.eastday.com/mobile/161215040814592.html?qid=juheshuju","uniquekey":"161215040814592","type":"头条","realtype":"社会"},{"title":"韩女团GFRIEND穿毛衣厚外套 下身却光腿","date":"2016-12-15 11:37","author_name":"bntnews","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20161215/20161215113759_e49027f80056c20bb3283818d0b8a31e_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20161215/20161215113759_e49027f80056c20bb3283818d0b8a31e_1_mwpl_05500201.jpeg","thumbnail_pic_s03":"http://00.imgmini.eastday.com/mobile/20161215/20161215113759_e49027f80056c20bb3283818d0b8a31e_1_mwpl_05500201.jpeg","url":"http://mini.eastday.com/mobile/161215113759188.html?qid=juheshuju","uniquekey":"161215113759188","type":"头条","realtype":"娱乐"},{"title":"男子吃出带牙黄焖鸡续:\"老鼠头\"经检测实为鸡肉","date":"2016-12-15 10:24","author_name":"大河报","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20161215/20161215102419_28cacdd8472c5461e6afe6a84651e3e4_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://01.imgmini.eastday.com/mobile/20161215/20161215102419_28cacdd8472c5461e6afe6a84651e3e4_1_mwpl_05500201.jpeg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20161215/20161215102419_28cacdd8472c5461e6afe6a84651e3e4_1_mwpl_05500201.jpeg","url":"http://mini.eastday.com/mobile/161215102419211.html?qid=juheshuju","uniquekey":"161215102419211","type":"头条","realtype":"社会"},{"title":"未来3年过后，走好运一直到老的人","date":"2016-12-15 10:25","author_name":"李师傅情感分析","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20161215/20161215102546_5557f811d68f16dc6b6f283472bdf456_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://06.imgmini.eastday.com/mobile/20161215/20161215102546_5557f811d68f16dc6b6f283472bdf456_1_mwpl_05500201.jpeg","thumbnail_pic_s03":"http://06.imgmini.eastday.com/mobile/20161215/20161215102546_5557f811d68f16dc6b6f283472bdf456_1_mwpl_05500201.jpeg","url":"http://mini.eastday.com/mobile/161215102546804.html?qid=juheshuju","uniquekey":"161215102546804","type":"头条","realtype":"星座"},{"title":"美媒：特朗普长女或入主第一夫人办公室 承担白宫女主人职责","date":"2016-12-15 10:32","author_name":"中国日报网","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20161215/20161215103210_c1fc49d117f6a31d6982ee7f6056a110_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://03.imgmini.eastday.com/mobile/20161215/20161215103210_c1fc49d117f6a31d6982ee7f6056a110_1_mwpl_05500201.jpeg","thumbnail_pic_s03":"http://03.imgmini.eastday.com/mobile/20161215/20161215103210_c1fc49d117f6a31d6982ee7f6056a110_1_mwpl_05500201.jpeg","url":"http://mini.eastday.com/mobile/161215103210902.html?qid=juheshuju","uniquekey":"161215103210902","type":"头条","realtype":"国际"},{"title":"江西省卫计委主任李利任江西省副省长","date":"2016-12-15 11:14","author_name":"\u201c江西日报时政头条\u201d微信公众号","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20161215/20161215111441_620032b7ff2d321cc8eacdc27cf234ce_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://05.imgmini.eastday.com/mobile/20161215/20161215111441_620032b7ff2d321cc8eacdc27cf234ce_1_mwpl_05500201.jpeg","thumbnail_pic_s03":"http://05.imgmini.eastday.com/mobile/20161215/20161215111441_620032b7ff2d321cc8eacdc27cf234ce_1_mwpl_05500201.jpeg","url":"http://mini.eastday.com/mobile/161215111441649.html?qid=juheshuju","uniquekey":"161215111441649","type":"头条","realtype":"国内"},{"title":"5岁孩子回家呕吐高烧流鼻血 看监控才知被老师打","date":"2016-12-15 09:09","author_name":"黑龙江晨报","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20161215/20161215090952_1d8835bb074084d65dd0debe3fd091aa_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://01.imgmini.eastday.com/mobile/20161215/20161215090952_1d8835bb074084d65dd0debe3fd091aa_1_mwpl_05500201.jpeg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20161215/20161215090952_1d8835bb074084d65dd0debe3fd091aa_1_mwpl_05500201.jpeg","url":"http://mini.eastday.com/mobile/161215090952569.html?qid=juheshuju","uniquekey":"161215090952569","type":"头条","realtype":"社会"},{"title":"统计局：11月原煤产量同比降幅明显收窄 价格回落","date":"2016-12-15 11:28","author_name":"中国新闻网","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20161215/20161215112815_61b3b5af10f0c4d7ce9365a8e106ef1c_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20161215/20161215112815_61b3b5af10f0c4d7ce9365a8e106ef1c_1_mwpl_05500201.jpeg","thumbnail_pic_s03":"http://02.imgmini.eastday.com/mobile/20161215/20161215112815_61b3b5af10f0c4d7ce9365a8e106ef1c_1_mwpl_05500201.jpeg","url":"http://mini.eastday.com/mobile/161215112815903.html?qid=juheshuju","uniquekey":"161215112815903","type":"头条","realtype":"国内"}]
         */

        private String stat;
        private List<DataBean> data;

        public static ResultBean objectFromData(String str) {

            return new Gson().fromJson(str, ResultBean.class);
        }



        public static List<ResultBean> arrayResultBeanFromData(String str) {

            Type listType = new TypeToken<ArrayList<ResultBean>>() {
            }.getType();

            return new Gson().fromJson(str, listType);
        }



        public String getStat() {
            return stat;
        }

        public void setStat(String stat) {
            this.stat = stat;
        }

        public List<DataBean> getData() {
            return data;
        }

        public void setData(List<DataBean> data) {
            this.data = data;
        }

        public static class DataBean {
            /**
             * title : 东方八卦：大S复出和老公分房睡，郑爽改行当木工，马思纯劝虹桥一姐找男友
             * date : 2016-12-15 10:54
             * author_name : 东方头条
             * thumbnail_pic_s : http://05.imgmini.eastday.com/mobile/20161215/20161215105441_c6c8e68e976f1637af113759926a3bd1_1_mwpm_03200403.jpg
             * thumbnail_pic_s02 : http://05.imgmini.eastday.com/mobile/20161215/20161215105441_c6c8e68e976f1637af113759926a3bd1_1_mwpl_05500201.jpg
             * thumbnail_pic_s03 : http://05.imgmini.eastday.com/mobile/20161215/20161215105441_c6c8e68e976f1637af113759926a3bd1_1_mwpl_05500201.jpg
             * url : http://mini.eastday.com/mobile/161215105441390.html?qid=juheshuju
             * uniquekey : 161215105441390
             * type : 头条
             * realtype : 娱乐
             */

            private String title;
            private String date;
            private String author_name;
            private String thumbnail_pic_s;
            private String thumbnail_pic_s02;
            private String thumbnail_pic_s03;
            private String url;
            private String uniquekey;
            private String type;
            private String realtype;

            public static DataBean objectFromData(String str) {

                return new Gson().fromJson(str, DataBean.class);
            }



            public static List<DataBean> arrayDataBeanFromData(String str) {

                Type listType = new TypeToken<ArrayList<DataBean>>() {
                }.getType();

                return new Gson().fromJson(str, listType);
            }



            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getAuthor_name() {
                return author_name;
            }

            public void setAuthor_name(String author_name) {
                this.author_name = author_name;
            }

            public String getThumbnail_pic_s() {
                return thumbnail_pic_s;
            }

            public void setThumbnail_pic_s(String thumbnail_pic_s) {
                this.thumbnail_pic_s = thumbnail_pic_s;
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

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getUniquekey() {
                return uniquekey;
            }

            public void setUniquekey(String uniquekey) {
                this.uniquekey = uniquekey;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getRealtype() {
                return realtype;
            }

            public void setRealtype(String realtype) {
                this.realtype = realtype;
            }
        }
    }
}
