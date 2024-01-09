package com.liceotrujillo.apiclt.news.domain.model;

public class CategoryNews {
    private Long id;
    private String category;
    private String description;

    public CategoryNews(Long id, String category, String description) {
        this.id = id;
        this.category = category;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
