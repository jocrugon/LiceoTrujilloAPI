package com.liceotrujillo.apiclt.news.application.handler;

import com.liceotrujillo.apiclt.news.application.dto.ImageNewsDto;
import com.liceotrujillo.apiclt.news.application.dto.ImageNewsRequest;
import com.liceotrujillo.apiclt.news.application.dto.NewsEditingRequest;
import com.liceotrujillo.apiclt.news.application.dto.NewsEditingResponse;
import com.liceotrujillo.apiclt.news.application.mapper.*;
import com.liceotrujillo.apiclt.news.domain.api.ICategoryServicePort;
import com.liceotrujillo.apiclt.news.domain.api.IImageServicePort;
import com.liceotrujillo.apiclt.news.domain.api.INewsServicePort;
import com.liceotrujillo.apiclt.news.domain.api.ITagServicePort;
import com.liceotrujillo.apiclt.news.domain.model.CategoryNews;
import com.liceotrujillo.apiclt.news.domain.model.News;
import com.liceotrujillo.apiclt.news.domain.model.TagNews;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
@Service
@RequiredArgsConstructor
@Transactional
public class NewsEditingHandlerImpl implements INewsEditingHandler{
    private final ICategoryServicePort categoryServicePort;
    private final ITagServicePort tagServicePort;
    private final INewsServicePort newsServicePort;
    private final IImageServicePort imageServicePort;
    private final INewsEditingRequestMapper newsEditingRequestMapper;
    private final INewsEditingResponseMapper newsEditingResponseMapper;
    private final IImageNewsRequestMapper imageNewsRequestMapper;
    private final IImageNewsDtoMapper imageNewsDtoMapper;
    @Override
    public List<CategoryNews> getAllCategoryNews() {
        return categoryServicePort.getAllCategories();
    }

    @Override
    public List<TagNews> getAllTagNews() {
        return tagServicePort.getAllTags();
    }

    @Override
    public Long saveNews(NewsEditingRequest news) {
        return newsServicePort.saveNews(newsEditingRequestMapper.toNews(news));
    }

    @Override
    public NewsEditingResponse getNewsEditingById(Long id) {
        News news = newsServicePort.getNewsById(id);
        CategoryNews categoryNews = categoryServicePort.getCategoryById(news.getCategoryId());
        TagNews tagNews = tagServicePort.getTagById(news.getTagId());
        return newsEditingResponseMapper.toResponse(news,categoryNews,tagNews);
    }

    @Override
    public void updateNews(News news) {
        newsServicePort.updateNews(news);
    }

    @Override
    public void saveImage(ImageNewsRequest imageNewsRequest) {
        imageServicePort.saveImage(imageNewsRequestMapper.toImageNews(imageNewsRequest),imageNewsRequest.getImageFile());
    }

    @Override
    public List<ImageNewsDto> getImagesByNewsId(Long id) {
        return imageNewsDtoMapper.toListDto(imageServicePort.getAllImagesByNewsId(id));
    }
}
