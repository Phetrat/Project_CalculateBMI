package com.example.a5735512043.obesity;

/**
 * Created by 5735512043 on 2/17/2019.
 */

public class Model {
    String name,image,description,search;

    public Model() {
    }

    public Model(String name, String image, String description, String search) {
        this.name = name;
        this.image = image;
        this.description = description;
        this.search = search;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }
}

