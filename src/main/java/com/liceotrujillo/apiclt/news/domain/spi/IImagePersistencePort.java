package com.liceotrujillo.apiclt.news.domain.spi;

import com.liceotrujillo.apiclt.news.domain.model.ImageNews;

import java.util.List;

public interface IImagePersistencePort {
    ImageNews saveImage(ImageNews imageNews);
    List<ImageNews> getAllImagesByNewsId(Long id);
    List<ImageNews> getAllCoverImage();
}
