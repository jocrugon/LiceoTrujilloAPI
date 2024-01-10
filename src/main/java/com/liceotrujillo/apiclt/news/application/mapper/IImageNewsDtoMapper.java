package com.liceotrujillo.apiclt.news.application.mapper;

import com.liceotrujillo.apiclt.news.application.dto.ImageNewsDto;
import com.liceotrujillo.apiclt.news.domain.model.ImageNews;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

import java.util.List;


@Mapper(componentModel = "spring",
        unmappedSourcePolicy = ReportingPolicy.IGNORE,
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface IImageNewsDtoMapper {
    @Mapping(source="coverImage",target="isCoverImage")
    List<ImageNewsDto> toListDto(List<ImageNews> imageNewsList);
}



