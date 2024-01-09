package com.liceotrujillo.apiclt.news.application.mapper;

import com.liceotrujillo.apiclt.news.application.dto.NewsPreviewResponse;
import com.liceotrujillo.apiclt.news.domain.model.CategoryNews;
import com.liceotrujillo.apiclt.news.domain.model.Image;
import com.liceotrujillo.apiclt.news.domain.model.News;
import com.liceotrujillo.apiclt.news.domain.model.TagNews;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",
        unmappedSourcePolicy = ReportingPolicy.IGNORE,
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface INewsPreviewResponseMapper {

    default List<NewsPreviewResponse> toListResponse(List<News> newsList, List<CategoryNews> categoryList, List<TagNews> tagNewsList, List<Image> imageList){
        return newsList.stream()
                .map(news->{
                    NewsPreviewResponse newsPreviewResponse = new NewsPreviewResponse();
                    newsPreviewResponse.setTitle(news.getTitle());
                    newsPreviewResponse.setAuthor(news.getAuthor());
                    newsPreviewResponse.setFixed(news.isFixed());
                    newsPreviewResponse.setCategory(
                            categoryList.stream().filter(category ->
                                    category.getId().equals(news.getCategoryId()))
                                    .findFirst().orElse(null).getCategory()
                    );
                    newsPreviewResponse.setTag(
                            tagNewsList.stream().filter(tag ->
                                    tag.getId().equals(news.getTagId()))
                                    .findFirst().orElse(null).getTag()
                    );
                    newsPreviewResponse.setUrlCoverImage(
                            imageList.stream().filter( image->
                                    image.getNewsId().equals(news.getId()))
                                    .filter(Image::isCoverImage)
                                    .findFirst().orElse(null).getUrl()
                    );
                    return newsPreviewResponse;
                }).toList();
    }
}
