package com.liceotrujillo.apiclt.news.domain.api;

import com.liceotrujillo.apiclt.news.domain.model.ImageNews;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface IImageServicePort {
    void saveImage(ImageNews imageNews);
    String saveImageInS3(MultipartFile imageFile);
   /* ImageNews getImageById(Long id);
    void updateImage(Long id);
    void deleteImage(Long id);

    */
    List<ImageNews> getAllImagesByNewsId(Long id);
    List<ImageNews> getAllCoverImage();
}
