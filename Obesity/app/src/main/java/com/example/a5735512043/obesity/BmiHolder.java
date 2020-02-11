package com.example.a5735512043.obesity;

/**
 * Created by 5735512043 on 2/19/2019.
 */

public class BmiHolder {
    String height;
    String weight;
    Double height1;
    Double weight1;

    public BmiHolder() {
    }

    public BmiHolder(String height, String weight) {
        this.height = height;
        this.weight = weight;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }
}
