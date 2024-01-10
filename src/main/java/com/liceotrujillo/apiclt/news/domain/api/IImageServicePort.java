package com.liceotrujillo.apiclt.news.domain.api;

import com.liceotrujillo.apiclt.news.domain.model.ImageNews;

import java.util.List;

public interface IImageServicePort {
    ImageNews saveImage(ImageNews imageNews);
    List<ImageNews> getAllImagesByNewsId(Long id);
    List<ImageNews> getAllCoverImage();
}
