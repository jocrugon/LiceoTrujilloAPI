package com.liceotrujillo.apiclt.news.infrastructure.output.jpa.adapter;

import com.liceotrujillo.apiclt.news.domain.model.TagNews;
import com.liceotrujillo.apiclt.news.domain.spi.ITagPersistencePort;
import com.liceotrujillo.apiclt.news.infrastructure.exception.NoDataFoundException;
import com.liceotrujillo.apiclt.news.infrastructure.exception.TagNewsNotFoundException;
import com.liceotrujillo.apiclt.news.infrastructure.output.jpa.entity.TagNewsEntity;
import com.liceotrujillo.apiclt.news.infrastructure.output.jpa.mapper.ITagNewsEntityMapper;
import com.liceotrujillo.apiclt.news.infrastructure.output.jpa.repository.ITagNewsRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;
@RequiredArgsConstructor
public class TagNewsJpaAdapter implements ITagPersistencePort {

    private final ITagNewsEntityMapper mapper;
    private final ITagNewsRepository repository;

    @Override
    public List<TagNews> getAllTags() {

        List<TagNewsEntity> tagNewsEntityList = repository.findAll();
        if(tagNewsEntityList.isEmpty()){
            throw new NoDataFoundException();
        }
        return mapper.toTagNewsList(tagNewsEntityList);
    }

    @Override
    public TagNews getTagById(Long id) {
        return mapper.toTagNews(repository.findById(id).orElseThrow(TagNewsNotFoundException::new));
    }
}
