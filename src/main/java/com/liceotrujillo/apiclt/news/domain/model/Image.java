package com.liceotrujillo.apiclt.news.domain.model;

import java.util.Date;

public class Image {
    private long id;
    private String description;
    private String keyword;
    private Date uploadDate;
    private String url;

    public Image(int id, String description, String keyword, Date uploadDate, String url) {
        this.id = id;
        this.description = description;
        this.keyword = keyword;
        this.uploadDate = uploadDate;
        this.url = url;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public Date getUploadDate() {
        return uploadDate;
    }

    public void setUploadDate(Date uploadDate) {
        this.uploadDate = uploadDate;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
