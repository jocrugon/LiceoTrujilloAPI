package com.liceotrujillo.apiclt.news.application.handler;

import com.liceotrujillo.apiclt.news.application.dto.NewsFullResponse;
import com.liceotrujillo.apiclt.news.application.dto.NewsPreviewResponse;
import com.liceotrujillo.apiclt.news.application.mapper.INewsFullResponseMapper;
import com.liceotrujillo.apiclt.news.application.mapper.INewsPreviewResponseMapper;
import com.liceotrujillo.apiclt.news.domain.api.ICategoryServicePort;
import com.liceotrujillo.apiclt.news.domain.api.IImageServicePort;
import com.liceotrujillo.apiclt.news.domain.api.INewsServicePort;
import com.liceotrujillo.apiclt.news.domain.api.ITagServicePort;
import com.liceotrujillo.apiclt.news.domain.model.News;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class NewsHandlerImpl implements INewsHandler{
    private final IImageServicePort imageServicePort;
    private final INewsServicePort newsServicePort;
    private final ICategoryServicePort categoryServicePort;
    private final ITagServicePort tagServicePort;

    private final INewsFullResponseMapper newsFullResponseMapper;
    private final INewsPreviewResponseMapper newsPreviewResponseMapper;

    @Override
    public List<NewsPreviewResponse> getAllNewsPreview() {
        return newsPreviewResponseMapper.toListResponse(
                newsServicePort.getAllActiveNews(),
                categoryServicePort.getAllCategories(),
                tagServicePort.getAllTags(),
                imageServicePort.getAllCoverImage()
        );
    }

    @Override
    public NewsFullResponse getNewsFullById(Long id) {
        News news = newsServicePort.getNewsById(id);
        return newsFullResponseMapper.toResponse(
                news,
                categoryServicePort.getCategoryById(news.getCategoryId()),
                tagServicePort.getTagById(news.getTagId()),
                imageServicePort.getAllImagesByNewsId(news.getId())
        );
    }
}
