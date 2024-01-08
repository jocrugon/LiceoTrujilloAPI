package com.liceotrujillo.apiclt.news.domain.usecase;

import com.liceotrujillo.apiclt.news.domain.api.INewsServicePort;
import com.liceotrujillo.apiclt.news.domain.model.News;
import com.liceotrujillo.apiclt.news.domain.spi.INewsPersistencePort;

import java.util.List;

public class NewsUseCase implements INewsServicePort {
    private final INewsPersistencePort newsPersistencePort;

    public NewsUseCase(INewsPersistencePort newsPersistencePort){
        this.newsPersistencePort = newsPersistencePort;
    }
    @Override
    public void saveNews(News news) {
        newsPersistencePort.saveNews(news);
    }

    @Override
    public List<News> getAllNews() {
        return newsPersistencePort.getAllNews();
    }

    @Override
    public News getNewsById(long id) {
        return newsPersistencePort.getNewsById(id);
    }

    @Override
    public void updateNews(News news) {
        newsPersistencePort.updateNews(news);
    }

    @Override
    public void deleteNewsById(long id) {
        newsPersistencePort.deleteNewsById(id);
    }
}
