package com.liceotrujillo.apiclt.news.infrastructure.output.jpa.mapper;

import com.liceotrujillo.apiclt.news.domain.model.CategoryNews;
import com.liceotrujillo.apiclt.news.infrastructure.output.jpa.entity.CategoryNewsEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface ICategoryNewsEntityMapper {
    CategoryNews toCategory(CategoryNewsEntity categoryNews);
    CategoryNewsEntity toEntity(CategoryNews categoryNews);
    List<CategoryNews> toCategoryList(List<CategoryNewsEntity> categoryNewsEntityList);
}
