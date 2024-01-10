package com.liceotrujillo.apiclt.news.infrastructure.output.jpa.mapper;

import com.liceotrujillo.apiclt.news.domain.model.News;
import com.liceotrujillo.apiclt.news.infrastructure.output.jpa.entity.NewsEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface INewsEntityMapper {
    News toNews(NewsEntity newsEntity);
    NewsEntity toEntity(News news);
    List<News> toNewsList(List<NewsEntity> newsEntityList);
}
