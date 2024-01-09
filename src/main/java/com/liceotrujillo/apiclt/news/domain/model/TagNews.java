package com.liceotrujillo.apiclt.news.domain.model;

public class TagNews {
    private Long id;
    private String tag;
    private String description;

    public TagNews(Long id, String tag, String description) {
        this.id = id;
        this.tag = tag;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
