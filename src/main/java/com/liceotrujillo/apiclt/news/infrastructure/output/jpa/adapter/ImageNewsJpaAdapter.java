package com.liceotrujillo.apiclt.news.infrastructure.output.jpa.adapter;

import com.liceotrujillo.apiclt.news.domain.model.ImageNews;
import com.liceotrujillo.apiclt.news.domain.spi.IImagePersistencePort;
import com.liceotrujillo.apiclt.news.infrastructure.exception.NoDataFoundException;
import com.liceotrujillo.apiclt.news.infrastructure.output.jpa.entity.ImageNewsEntity;
import com.liceotrujillo.apiclt.news.infrastructure.output.jpa.mapper.IImageNewsEntityMapper;
import com.liceotrujillo.apiclt.news.infrastructure.output.jpa.repository.IImageNewsRepository;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;
@RequiredArgsConstructor
public class ImageNewsJpaAdapter implements IImagePersistencePort {

    private final IImageNewsEntityMapper mapper;
    private final IImageNewsRepository repository;

    @Override
    public ImageNews saveImage(ImageNews imageNews) {
        return mapper.toImageNews(repository.save(mapper.toEntity(imageNews)));
    }

    @Override
    public List<ImageNews> getAllImagesByNewsId(Long id) {
        return mapper.toImageNewsList(repository.findByNewsId(id).orElseThrow(NoDataFoundException::new));
    }

    @Override
    public List<ImageNews> getAllCoverImage() {
        List<ImageNewsEntity> newsEntityList = repository.findByCoverImageTrue().orElse(new ArrayList<>());

        return mapper.toImageNewsList(newsEntityList);
    }
}
