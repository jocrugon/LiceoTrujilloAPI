package com.liceotrujillo.apiclt.news.domain.model;

public class TagNews {
    private long id;
    private String tag;
    private String description;

    public TagNews(long id, String tag, String description) {
        this.id = id;
        this.tag = tag;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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
