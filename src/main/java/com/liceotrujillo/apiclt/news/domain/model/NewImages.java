package com.liceotrujillo.apiclt.news.domain.model;

public class NewImages {
    private long id;
    private long imageId;
    private long newId;
    private boolean coverImage;

    public NewImages(long id, long imageId, long newId, boolean coverImage) {
        this.id = id;
        this.imageId = imageId;
        this.newId = newId;
        this.coverImage = coverImage;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getImageId() {
        return imageId;
    }

    public void setImageId(long imageId) {
        this.imageId = imageId;
    }

    public long getNewId() {
        return newId;
    }

    public void setNewId(long newId) {
        this.newId = newId;
    }

    public boolean isCoverImage() {
        return coverImage;
    }

    public void setCoverImage(boolean coverImage) {
        this.coverImage = coverImage;
    }
}
