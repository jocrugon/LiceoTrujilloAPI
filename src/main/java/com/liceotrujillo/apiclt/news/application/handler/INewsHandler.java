package com.liceotrujillo.apiclt.news.application.handler;

import com.liceotrujillo.apiclt.news.application.dto.NewsFullResponse;
import com.liceotrujillo.apiclt.news.application.dto.NewsPreviewResponse;

import java.util.List;

public interface INewsHandler {

    List<NewsPreviewResponse> getAllNewsPreview();
    NewsFullResponse getNewsFullById(Long id);

}
