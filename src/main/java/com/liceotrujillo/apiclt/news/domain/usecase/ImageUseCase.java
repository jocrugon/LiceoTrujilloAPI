package com.liceotrujillo.apiclt.news.domain.usecase;

import com.liceotrujillo.apiclt.news.domain.api.IImageServicePort;
import com.liceotrujillo.apiclt.news.domain.model.ImageNews;
import com.liceotrujillo.apiclt.news.domain.spi.IImagePersistencePort;

import java.util.List;

public class ImageUseCase implements IImageServicePort {
    private final IImagePersistencePort persistencePort;
    public ImageUseCase(IImagePersistencePort persistencePort){
        this.persistencePort = persistencePort;
    }

    @Override
    public ImageNews saveImage(ImageNews imageNews) {
        return persistencePort.saveImage(imageNews);
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
