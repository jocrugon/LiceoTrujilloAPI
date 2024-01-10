package com.liceotrujillo.apiclt.news.domain.model;

import java.util.Date;

public class ImageNews {
    private Long id;
    private String description;
    private Date uploadDate;
    private String url;
    private Long newsId;
    private boolean coverImage;

    public ImageNews(Long id, String description, Date uploadDate, String url, Long newsId, boolean coverImage) {
        this.id = id;
        this.description = description;
        this.uploadDate = uploadDate;
        this.url = url;
        this.newsId = newsId;
        this.coverImage = coverImage;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public Long getNewsId() {
        return newsId;
    }

    public void setNewsId(Long newsId) {
        this.newsId = newsId;
    }

    public boolean isCoverImage() {
        return coverImage;
    }

    public void setCoverImage(boolean coverImage) {
        this.coverImage = coverImage;
    }
}
