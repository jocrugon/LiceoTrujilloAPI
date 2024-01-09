package com.liceotrujillo.apiclt.news.application.mapper;

import com.liceotrujillo.apiclt.news.application.dto.NewsFullResponse;
import com.liceotrujillo.apiclt.news.application.dto.NewsPreviewResponse;
import com.liceotrujillo.apiclt.news.domain.model.CategoryNews;
import com.liceotrujillo.apiclt.news.domain.model.Image;
import com.liceotrujillo.apiclt.news.domain.model.News;
import com.liceotrujillo.apiclt.news.domain.model.TagNews;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring",
        unmappedSourcePolicy = ReportingPolicy.IGNORE,
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface INewsFullResponseMapper {
    IImageDtoMapper INSTANCE_IMAGE = Mappers.getMapper(IImageDtoMapper.class);
    ICategoryNewsDtoMapper INSTANCE_CATEGORY = Mappers.getMapper(ICategoryNewsDtoMapper.class);
    ITagNewsDtoMapper INSTANCE_TAG = Mappers.getMapper(ITagNewsDtoMapper.class);

    default NewsFullResponse toResponse(News news, CategoryNews category, TagNews tagNews, List<Image> imageList){
        NewsFullResponse newsFullResponse = new NewsFullResponse();
        newsFullResponse.setTitle(news.getTitle());
        newsFullResponse.setAuthor(news.getAuthor());
        newsFullResponse.setFixed(news.isFixed());
        newsFullResponse.setBody(news.getBody());
        newsFullResponse.setCreationDate(news.getCreationDate());
        newsFullResponse.setCategory(INSTANCE_CATEGORY.toDto(category));
        newsFullResponse.setTag(INSTANCE_TAG.toDto(tagNews));
        newsFullResponse.setImages(INSTANCE_IMAGE.toListDto(imageList));
        return newsFullResponse;
    }

}
