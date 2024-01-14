package com.liceotrujillo.apiclt.news.domain.usecase;

import com.liceotrujillo.apiclt.news.domain.api.IImageServicePort;
import com.liceotrujillo.apiclt.news.domain.model.ImageNews;
import com.liceotrujillo.apiclt.news.domain.spi.IImagePersistencePort;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public class ImageUseCase implements IImageServicePort {
    private final IImagePersistencePort persistencePort;
    public ImageUseCase(IImagePersistencePort persistencePort){
        this.persistencePort = persistencePort;
    }

    @Override
    public void saveImage(ImageNews imageNews) {
        persistencePort.saveImage(imageNews);
    }

    @Override
    public String saveImageInS3(MultipartFile imageFile) {
        return persistencePort.saveImageInS3(imageFile);
    }

    @Override
    public List<ImageNews> getAllImagesByNewsId(Long id) {
        return persistencePort.getAllImagesByNewsId(id);
    }

    @Override
    public List<ImageNews> getAllCoverImage() {
        return persistencePort.getAllCoverImage();
    }
}
