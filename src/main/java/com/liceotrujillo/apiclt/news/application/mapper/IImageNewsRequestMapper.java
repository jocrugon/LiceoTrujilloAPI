package com.liceotrujillo.apiclt.news.application.mapper;

import com.liceotrujillo.apiclt.news.application.dto.ImageNewsRequest;
import com.liceotrujillo.apiclt.news.domain.model.ImageNews;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedSourcePolicy = ReportingPolicy.IGNORE,
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface IImageNewsRequestMapper {
    ImageNews toImageNews(ImageNewsRequest imageNewsRequest);
}
