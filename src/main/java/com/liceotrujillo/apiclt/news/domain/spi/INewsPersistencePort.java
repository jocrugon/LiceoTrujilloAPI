package com.liceotrujillo.apiclt.news.domain.spi;

import com.liceotrujillo.apiclt.news.domain.model.News;

import java.util.List;

public interface INewsPersistencePort {
    Long saveNews(News news);
    List<News> getAllActiveNews();
    News getNewsById(long id);
    void updateNews(News news);
}
