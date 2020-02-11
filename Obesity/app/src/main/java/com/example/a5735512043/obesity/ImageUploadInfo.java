package com.example.a5735512043.obesity;

/**
 * Created by 5735512043 on 2/17/2019.
 */

public class ImageUploadInfo {
    String name;
    String description;
    String image;
    String search;

    public ImageUploadInfo() {
    }

    public ImageUploadInfo(String name, String description, String image, String search) {
        this.name = name;
        this.description = description;
        this.image = image;
        this.search = search;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getImage() {
        return image;
    }

    public String getSearch() {
        return search;
    }
}
