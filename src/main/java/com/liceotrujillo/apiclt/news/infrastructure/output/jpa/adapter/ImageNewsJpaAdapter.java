package com.liceotrujillo.apiclt.news.infrastructure.output.jpa.adapter;

import com.liceotrujillo.apiclt.news.domain.model.ImageNews;
import com.liceotrujillo.apiclt.news.domain.spi.IImagePersistencePort;
import com.liceotrujillo.apiclt.news.infrastructure.exception.NoDataFoundException;
import com.liceotrujillo.apiclt.news.infrastructure.output.jpa.entity.ImageNewsEntity;
import com.liceotrujillo.apiclt.news.infrastructure.output.jpa.mapper.IImageNewsEntityMapper;
import com.liceotrujillo.apiclt.news.infrastructure.output.jpa.repository.IImageNewsRepository;
import com.liceotrujillo.apiclt.news.infrastructure.output.s3.AwsS3Service;
import lombok.RequiredArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.List;
@RequiredArgsConstructor
public class ImageNewsJpaAdapter implements IImagePersistencePort {

    private final IImageNewsEntityMapper mapper;
    private final IImageNewsRepository repository;
    private final AwsS3Service awsS3Service;

    @Override
    public void saveImage(ImageNews imageNews) {
        repository.save(mapper.toEntity(imageNews));
    }

    @Override
    public String saveImageInS3(MultipartFile imageFile) {
        String imageKey = awsS3Service.putObject(imageFile);
        return awsS3Service.getUrlImage(imageKey);
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
