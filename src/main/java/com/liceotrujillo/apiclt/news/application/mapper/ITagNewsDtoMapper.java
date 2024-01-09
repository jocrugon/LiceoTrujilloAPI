package com.liceotrujillo.apiclt.news.application.mapper;

import com.liceotrujillo.apiclt.news.application.dto.TagNewsDto;
import com.liceotrujillo.apiclt.news.domain.model.TagNews;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedSourcePolicy = ReportingPolicy.IGNORE,
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ITagNewsDtoMapper {
    TagNewsDto toDto(TagNews tagNews);
}

