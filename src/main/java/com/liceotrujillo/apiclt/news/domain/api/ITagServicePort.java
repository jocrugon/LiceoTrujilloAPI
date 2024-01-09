package com.liceotrujillo.apiclt.news.domain.api;

import com.liceotrujillo.apiclt.news.domain.model.TagNews;

import java.util.List;

public interface ITagServicePort {
    List<TagNews> getAllTags();
    TagNews getTagById(Long id);
}
