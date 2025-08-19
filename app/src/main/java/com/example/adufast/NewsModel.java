package com.example.adufast;

public class NewsModel {
    private String title;
    private String description;
    private String sourceDate;
    private int imageResId;

    public NewsModel(String title, String description, String sourceDate, int imageResId) {
        this.title = title;
        this.description = description;
        this.sourceDate = sourceDate;
        this.imageResId = imageResId;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getSourceDate() {
        return sourceDate;
    }

    public int getImageResId() {
        return imageResId;
    }
}