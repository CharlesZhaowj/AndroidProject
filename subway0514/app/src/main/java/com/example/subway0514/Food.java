package com.example.subway0514;

/**
 * Created by Administrator on 2017/5/22 0022.
 */

public class Food {
    private String name;

    private int imageId;

    public Food(String name,int imageId){
        this.name = name;
        this.imageId = imageId;
    }

    public String getName(){
        return name;
    }

    public int getImageId(){
        return imageId;
    }
}
