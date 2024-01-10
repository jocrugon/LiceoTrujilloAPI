package com.liceotrujillo.apiclt.news.infrastructure.output.jpa.mapper;

import com.liceotrujillo.apiclt.news.domain.model.TagNews;
import com.liceotrujillo.apiclt.news.infrastructure.output.jpa.entity.TagNewsEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface ITagNewsEntityMapper {
    TagNews toTagNews(TagNewsEntity tagNewsEntity);
    TagNewsEntity toEntity(TagNews tagNews);
    List<TagNews> toTagNewsList(List<TagNewsEntity> tagNewsEntityList);
}
