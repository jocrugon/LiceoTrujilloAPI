package com.liceotrujillo.apiclt.news.domain.model;

public class CategoryNews {
    private long id;
    private String category;
    private String description;

    public CategoryNews(int id, String category, String description) {
        this.id = id;
        this.category = category;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
