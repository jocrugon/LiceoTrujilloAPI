package com.liceotrujillo.apiclt.news.application.mapper;

import com.liceotrujillo.apiclt.news.application.dto.NewsEditingResponse;
import com.liceotrujillo.apiclt.news.domain.model.CategoryNews;
import com.liceotrujillo.apiclt.news.domain.model.News;
import com.liceotrujillo.apiclt.news.domain.model.TagNews;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedSourcePolicy = ReportingPolicy.IGNORE,
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface INewsEditingResponseMapper {

    @Mappings({
            @Mapping(source = "categoryNews", target = "category"),
            @Mapping(source = "tagNews", target = "tag"),
    })
    NewsEditingResponse toResponse( News news, CategoryNews categoryNews, TagNews tagNews);
}
