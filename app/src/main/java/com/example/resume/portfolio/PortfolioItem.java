package com.example.resume.portfolio;

import java.io.Serializable;

public class PortfolioItem implements Serializable {

    private int image;
    private String title,desciption;

    public PortfolioItem() {
    }
    public PortfolioItem(int image) {
        this.image = image;
    }

    public PortfolioItem(int image, String title) {
        this.image = image;
        this.title = title;
    }

    public PortfolioItem(int image, String title, String desciption) {
        this.image = image;
        this.title = title;
        this.desciption = desciption;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesciption() {
        return desciption;
    }

    public void setDesciption(String desciption) {
        this.desciption = desciption;
    }
}
