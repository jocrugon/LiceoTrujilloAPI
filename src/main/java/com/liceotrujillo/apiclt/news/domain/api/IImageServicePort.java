package com.liceotrujillo.apiclt.news.domain.api;

import com.liceotrujillo.apiclt.news.domain.model.Image;

import java.util.List;

public interface IImageServicePort {
    Image saveImage(Image image);
    List<Image> getAllImages();
    List<Image> getAllImagesByNewsId(Long id);
    Image getImageById(long id);
    void deleteImageById(long id);
}
