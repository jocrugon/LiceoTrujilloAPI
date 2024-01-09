package com.liceotrujillo.apiclt.news.application.mapper;

import com.liceotrujillo.apiclt.news.application.dto.CategoryNewsDto;
import com.liceotrujillo.apiclt.news.domain.model.CategoryNews;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedSourcePolicy = ReportingPolicy.IGNORE,
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ICategoryNewsDtoMapper {
    CategoryNewsDto toDto(CategoryNews categoryNews);
}
