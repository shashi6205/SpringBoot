package com.company;

import org.springframework.stereotype.Component;

@Component
public class Ads {

    private int adId;
    private String adName;

    public int getAdId() {
        return adId;
    }

    public void setAdId(int adId) {
        this.adId = adId;
    }

    public String getAdName() {
        return adName;
    }

    public void setAdName(String adName) {
        this.adName = adName;
    }

    public void adDisplay() {
        System.out.println("Ads displayed Successfully.");
    }
}
