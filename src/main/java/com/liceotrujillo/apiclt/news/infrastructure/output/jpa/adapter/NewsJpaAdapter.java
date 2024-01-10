package com.liceotrujillo.apiclt.news.infrastructure.output.jpa.adapter;

import com.liceotrujillo.apiclt.news.domain.model.News;
import com.liceotrujillo.apiclt.news.domain.spi.INewsPersistencePort;
import com.liceotrujillo.apiclt.news.infrastructure.exception.NewsNotFoundException;
import com.liceotrujillo.apiclt.news.infrastructure.exception.NoDataFoundException;
import com.liceotrujillo.apiclt.news.infrastructure.output.jpa.mapper.INewsEntityMapper;
import com.liceotrujillo.apiclt.news.infrastructure.output.jpa.repository.INewsRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;
@RequiredArgsConstructor
public class NewsJpaAdapter implements INewsPersistencePort {

    private final INewsEntityMapper mapper;
    private final INewsRepository repository;

    @Override
    public Long saveNews(News news) {
        return repository.save(mapper.toEntity(news)).getId();
    }

    @Override
    public List<News> getAllActiveNews() {
        return mapper.toNewsList(repository.findAllByActiveTrue().orElseThrow(NoDataFoundException::new));
    }

    @Override
    public News getNewsById(long id) {
        return mapper.toNews(repository.findById(id).orElseThrow(NewsNotFoundException::new));
    }

    @Override
    public void updateNews(News news) {
        repository.save(mapper.toEntity(news));
    }
}
