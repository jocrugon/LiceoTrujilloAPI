package com.liceotrujillo.apiclt.news.domain.api;

import com.liceotrujillo.apiclt.news.domain.model.ImageNews;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface IImageServicePort {
    void saveImage(ImageNews imageNews,MultipartFile imageFile);
   /*
    void deleteImage(Long id);
    */
    List<ImageNews> getAllImagesByNewsId(Long id);
    List<ImageNews> getAllCoverImage();
}
