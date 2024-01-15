package com.liceotrujillo.apiclt.news.application.handler;

import com.liceotrujillo.apiclt.news.application.dto.*;
import com.liceotrujillo.apiclt.news.domain.model.CategoryNews;
import com.liceotrujillo.apiclt.news.domain.model.News;
import com.liceotrujillo.apiclt.news.domain.model.TagNews;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface INewsEditingHandler {
    List<CategoryNews> getAllCategoryNews();
    List<TagNews> getAllTagNews();
    Long saveNews(NewsEditingRequest news);
    NewsEditingResponse getNewsEditingById(Long id);
    void updateNews(News news);
    void saveImage(ImageNewsRequest imageNewsRequest);
    List<ImageNewsDto> getImagesByNewsId(Long id);
}
