package com.example.listviewdemo.model;

import android.widget.TextView;

public class Technology {
    private int img;
    private String name,sub,describe;

    public Technology(int img, String name, String sub,String describe){
        this.img =img;
        this.name = name;
        this.sub = sub;
        this.describe = describe;
    }

    public  int getImg(){
        return img;
    }

    public void setImg(int img){
        this.img =img;
    }



}
