package com.liceotrujillo.apiclt.news.domain.usecase;

import com.liceotrujillo.apiclt.news.domain.api.IImageServicePort;
import com.liceotrujillo.apiclt.news.domain.model.Image;
import com.liceotrujillo.apiclt.news.domain.spi.IImagePersistencePort;

import java.util.List;

public class ImageUseCase implements IImageServicePort {
    private final IImagePersistencePort imagePersistencePort;
    public ImageUseCase(IImagePersistencePort imagePersistencePort){
        this.imagePersistencePort = imagePersistencePort;
    }
    @Override
    public Image saveImage(Image image) {
        return imagePersistencePort.saveImage(image);
    }

    @Override
    public List<Image> getAllImages() {
        return imagePersistencePort.getAllImages();
    }

    @Override
    public List<Image> getAllImagesByNewsId(Long id) {
        return imagePersistencePort.getAllImagesByNewsId(id);
    }

    @Override
    public Image getImageById(long id) {
        return imagePersistencePort.getImageById(id);
    }

    @Override
    public void deleteImageById(long id) {
        imagePersistencePort.deleteImageById(id);
    }
}
