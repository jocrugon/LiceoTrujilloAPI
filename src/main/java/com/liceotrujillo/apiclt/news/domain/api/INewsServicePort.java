package com.liceotrujillo.apiclt.news.domain.api;

import com.liceotrujillo.apiclt.news.domain.model.News;

import java.util.List;

public interface INewsServicePort {
    Long saveNews(News news);
    List<News> getAllActiveNews();
    News getNewsById(long id);
    void updateNews(News news);

}
