package com.liceotrujillo.apiclt.news.infrastructure.output.jpa.mapper;

import com.liceotrujillo.apiclt.news.domain.model.ImageNews;
import com.liceotrujillo.apiclt.news.infrastructure.output.jpa.entity.ImageNewsEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface IImageNewsEntityMapper {
    List<ImageNews> toImageNewsList(List<ImageNewsEntity> imageNewsEntity);
    ImageNewsEntity toEntity(ImageNews imageNews);

    ImageNews toImageNews(ImageNewsEntity imageNewsEntity);
}
