package com.liceotrujillo.apiclt.news.domain.spi;

import com.liceotrujillo.apiclt.news.domain.model.News;

import java.util.List;

public interface INewsPersistencePort {
    void saveNews(News news);
    List<News> getAllNews();
    News getNewsById(long id);
    void updateNews(News news);
    void deleteNewsById(long id);
}
