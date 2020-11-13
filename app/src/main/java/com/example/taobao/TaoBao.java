package com.example.taobao;

public class TaoBao
{
    private String name;
    private int imageId;

    public TaoBao(String taobaoName, int taobaoImage){
        this.name = taobaoName;
        this.imageId = taobaoImage;
    }

    public String getName(){
        return name;
    }

    public int getImageId() {
        return imageId;
    }
}
