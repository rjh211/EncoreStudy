package com.example.app1.model;

import java.io.Serializable;

public class Member implements Serializable {
    private String name;
    private String tel;
    private String image;
    private Integer type;
    private Integer imgRes;

    public Member(){}

    public Member(String name, String tel, String image, Integer type, Integer imgRes){
        this.name = name;
        this.tel = tel;
        this.image = image;
        this.type = type;
        this.imgRes = imgRes;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getTel(){
        return this.tel;
    }
    public void setTel(String tel){
        this.tel = tel;
    }
    public String getImage(){
        return this.image;
    }
    public void setImage(String image){
        this.image = image;
    }
    public Integer getType(){return this.type;}
    public void setType(int type){this.type = type;}
    public Integer getImgRes(){return this.imgRes;}
    public void setImgRes(int imgRes){this.imgRes = imgRes;}

    @Override
    public String toString(){
        return this.name + "|" + this.tel + "|" + this.image;
    }
}
