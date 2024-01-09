package com.liceotrujillo.apiclt.news.domain.spi;

import com.liceotrujillo.apiclt.news.domain.model.TagNews;

import java.util.List;

public interface ITagPersistencePort {
    List<TagNews> getAllTags();
    TagNews getTagById(Long id);
}
