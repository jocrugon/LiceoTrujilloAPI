package com.liceotrujillo.apiclt.news.infrastructure.output.jpa.adapter;

import com.liceotrujillo.apiclt.news.domain.model.TagNews;
import com.liceotrujillo.apiclt.news.infrastructure.output.jpa.entity.TagNewsEntity;
import com.liceotrujillo.apiclt.news.infrastructure.output.jpa.mapper.ITagNewsEntityMapper;
import com.liceotrujillo.apiclt.news.infrastructure.output.jpa.repository.ITagNewsRepository;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;


import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class TagNewsJpaAdapterTest {
    @Mock
    private ITagNewsEntityMapper mapper;
    @Mock
    private ITagNewsRepository repository;
    @InjectMocks
    private TagNewsJpaAdapter tagNewsJpaAdapter;

    @Test
    public void testGetTagNewsListByMockito(){
        List<TagNewsEntity> tagNewsEntityList = Arrays.asList(
                new TagNewsEntity(1L,"tag1","description1"),
                new TagNewsEntity(2L,"tag2","description2"));
        when(repository.findAll()).thenReturn(tagNewsEntityList);

        when(mapper.toTagNewsList(tagNewsEntityList)).thenReturn(Arrays.asList(
                new TagNews(1L,"tag1","description1"),
                new TagNews(2L,"tag2","description2")));

        final List<TagNews> result = tagNewsJpaAdapter.getAllTags();
        verify(repository, times(1)).findAll();
        verify(mapper, times(1)).toTagNewsList(tagNewsEntityList);

        assertNotNull(result);
        assertFalse(result.isEmpty());

    }

}