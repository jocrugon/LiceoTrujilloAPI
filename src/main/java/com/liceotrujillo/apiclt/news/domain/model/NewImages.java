package com.liceotrujillo.apiclt.news.domain.model;

public class NewImages {
    private long id;
    private long imageId;
    private long newId;

    public NewImages(long id, long imageId, long newId) {
        this.id = id;
        this.imageId = imageId;
        this.newId = newId;
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
}
