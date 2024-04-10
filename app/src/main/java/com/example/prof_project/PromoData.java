package com.example.prof_project;

import androidx.annotation.DrawableRes;

public class PromoData {
    @DrawableRes
    public  Integer imageId;
    String title;
    String description;


    static PromoData[] values = new PromoData[]{
            new PromoData(R.drawable.img_first_screen, "Quick Delivery At Your Doorstep","Enjoy quick pick-up and delivery to your destination"),
            new PromoData(R.drawable.img_second_screen, "Flexible Payment","Different modes of payment either before and after delivery without stress")
    };

    public PromoData(int img, String title, String desc) {
        this.imageId = img;
        this.title = title;
        this.description = desc;
    }
}


