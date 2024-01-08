package com.liceotrujillo.apiclt.news.domain.api;

import com.liceotrujillo.apiclt.news.domain.model.News;

import java.util.List;

public interface INewsServicePort {
    void saveNews(News news);
    List<News> getAllNews();
    News getNewsById(long id);
    void updateNews(News news);
    void deleteNewsById(long id);
}
