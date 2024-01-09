package com.liceotrujillo.apiclt.news.domain.usecase;

import com.liceotrujillo.apiclt.news.domain.api.ITagServicePort;
import com.liceotrujillo.apiclt.news.domain.model.TagNews;
import com.liceotrujillo.apiclt.news.domain.spi.ITagPersistencePort;

import java.util.List;

public class TagUseCase implements ITagServicePort {
    private final ITagPersistencePort tagPersistencePort;
    public TagUseCase(ITagPersistencePort tagPersistencePort){
        this.tagPersistencePort = tagPersistencePort;
    }
    @Override
    public List<TagNews> getAllTags() {
        return tagPersistencePort.getAllTags();
    }

    @Override
    public TagNews getTagById(Long id) {
        return tagPersistencePort.getTagById(id);
    }
}
