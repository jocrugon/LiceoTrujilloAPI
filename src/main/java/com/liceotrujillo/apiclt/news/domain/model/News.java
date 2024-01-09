package com.liceotrujillo.apiclt.news.domain.model;

import java.util.Date;

public class News {
    private Long id;
    private String author;
    private String body;
    private Date creationDate;
    private Long tagId;
    private String title;
    private boolean fixed;
    private Long categoryId;

    public News(Long id, String author, String body, Date creationDate, Long tagId, String title, boolean fixed, Long categoryId) {
        this.id = id;
        this.author = author;
        this.body = body;
        this.creationDate = creationDate;
        this.tagId = tagId;
        this.title = title;
        this.fixed = fixed;
        this.categoryId = categoryId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public Long getTagId() {
        return tagId;
    }

    public void setTagId(Long tagId) {
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

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }
}
