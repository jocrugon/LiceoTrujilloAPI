package com.liceotrujillo.apiclt.news.application.mapper;

import com.liceotrujillo.apiclt.news.application.dto.NewsPreviewResponse;
import com.liceotrujillo.apiclt.news.domain.model.CategoryNews;
import com.liceotrujillo.apiclt.news.domain.model.ImageNews;
import com.liceotrujillo.apiclt.news.domain.model.News;
import com.liceotrujillo.apiclt.news.domain.model.TagNews;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",
        unmappedSourcePolicy = ReportingPolicy.IGNORE,
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface INewsPreviewResponseMapper {

    default List<NewsPreviewResponse> toListResponse(List<News> newsList, List<CategoryNews> categoryList, List<TagNews> tagNewsList, List<ImageNews> imageNewsList){
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
                    ImageNews imageCover = imageNewsList.stream().filter(image->
                                    image.getNewsId().equals(news.getId()))
                            .findFirst().orElse(null);

                    newsPreviewResponse.setUrlCoverImage(imageCover!=null?imageCover.getUrl():null);
                    return newsPreviewResponse;
                }).toList();
    }
}
