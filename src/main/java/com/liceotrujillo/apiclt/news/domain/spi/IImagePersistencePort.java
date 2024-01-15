package com.liceotrujillo.apiclt.news.domain.spi;

import com.liceotrujillo.apiclt.news.domain.model.ImageNews;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface IImagePersistencePort {
    void saveImage(ImageNews imageNews,MultipartFile imageFile);
    List<ImageNews> getAllImagesByNewsId(Long id);
    List<ImageNews> getAllCoverImage();
}
