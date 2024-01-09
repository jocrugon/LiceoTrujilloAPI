package com.liceotrujillo.apiclt.news.application.mapper;

import com.liceotrujillo.apiclt.news.application.dto.ImageDto;
import com.liceotrujillo.apiclt.news.domain.model.Image;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

import java.util.List;


@Mapper(componentModel = "spring",
        unmappedSourcePolicy = ReportingPolicy.IGNORE,
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface IImageDtoMapper {
    @Mapping(source="coverImage",target="isCoverImage")
    List<ImageDto> toListDto(List<Image> imageList);
}



