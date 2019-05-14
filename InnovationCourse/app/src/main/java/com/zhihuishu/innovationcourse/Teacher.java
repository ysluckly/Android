package com.zhihuishu.innovationcourse;

import java.util.ArrayList;
import java.util.List;

public class Teacher {

    private String name;
    private  int imageId;
    private  String desc;

    //构造函数
    public Teacher(String name, int imageId, String desc) {
        this.name = name;
        this.imageId = imageId;
        this.desc = desc;
    }

    // 返回一个Teacher的列表
    public static List<Teacher> getAllTeachers() {
        List<Teacher> teachers = new ArrayList<Teacher>();
        teachers.add(new Teacher("甄子丹", R.drawable.zzj, "甄子丹，1963年7月27日出生于广东省广州市，中国香港影视男演员、导演、港片打星、武术指导。"));
        teachers.add(new Teacher("周星驰", R.drawable.zjl, "周星驰，1962年6月22日生于香港，祖籍浙江宁波，中国香港演员、导演、编剧、制作人、商人，毕业于无线电视艺员训练班。"));
        teachers.add(new Teacher("腾格尔", R.drawable.tge, "腾格尔，1960年生于内蒙古鄂托克旗。中国国家一级演员。中国音乐家协会会员。集歌唱、影视和作曲的三栖艺术家。"));
        teachers.add(new Teacher("赵雷", R.drawable.zl, "赵雷，2018年8月1日 - 自从参加《歌手》这个节目后,赵雷连同他的《成都》一起被所有人熟知,之后的他变得非常忙碌,开始了各地的巡演"));
        teachers.add(new Teacher("@Hunter", R.drawable.yt, "羊驼，为偶蹄目、骆驼科的动物,体重一般在55至65公斤之间,长度1.2至2.2米。外形有点像绵羊。欧美国家已经有家庭把羊驼当做宠物在花园里饲养。"));
        teachers.add(new Teacher("物联网", R.drawable.eee, "物联网，（英语：Internet of Things，缩写IoT）是互联网、传统电信网等信息承载体，让所有能行使独立功能的普通物体实现互联互通的网络。"));

        return teachers;
    }

    // 以下都是访问内部属性的getter和setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public  String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
