package com.liceotrujillo.apiclt.news.domain.model;

import java.util.Date;

public class News {
    private long id;
    private String author;
    private String body;
    private Date creationDate;
    private int tagId;
    private String title;
    private boolean fixed;

    public News(long id, String author, String body, Date creationDate, int tagId, String title, boolean fixed) {
        this.id = id;
        this.author = author;
        this.body = body;
        this.creationDate = creationDate;
        this.tagId = tagId;
        this.title = title;
        this.fixed = fixed;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public int getTagId() {
        return tagId;
    }

    public void setTagId(int tagId) {
        this.tagId = tagId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isFixed() {
        return fixed;
    }

    public void setFixed(boolean fixed) {
        this.fixed = fixed;
    }
}
