package com.ardafirdausr.dicoding.maap.programming_language.model;

import java.io.Serializable;

public class ProgrammingLanguage implements Serializable {

    private int id;
    private float shareRate;
    private String name, image, description;

    public ProgrammingLanguage() { }

    public ProgrammingLanguage(int id, float shareRate, String name, String image, String description) {
        this.id = id;
        this.shareRate = shareRate;
        this.name = name;
        this.image = image;
        this.description = description;
    }

    public float getShareRate() {
        return shareRate;
    }

    public void setShareRate(float shareRate) {
        this.shareRate = shareRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
}
