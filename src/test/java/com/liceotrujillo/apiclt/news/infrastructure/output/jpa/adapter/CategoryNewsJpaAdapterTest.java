package com.liceotrujillo.apiclt.news.infrastructure.output.jpa.adapter;

import com.liceotrujillo.apiclt.news.domain.model.CategoryNews;
import com.liceotrujillo.apiclt.news.domain.model.TagNews;
import com.liceotrujillo.apiclt.news.infrastructure.output.jpa.entity.CategoryNewsEntity;
import com.liceotrujillo.apiclt.news.infrastructure.output.jpa.entity.TagNewsEntity;
import com.liceotrujillo.apiclt.news.infrastructure.output.jpa.mapper.ICategoryNewsEntityMapper;
import com.liceotrujillo.apiclt.news.infrastructure.output.jpa.repository.ICategoryNewsRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class CategoryNewsJpaAdapterTest {
    @Mock
    private ICategoryNewsRepository repository;
    @Mock
    private ICategoryNewsEntityMapper mapper;
    @InjectMocks
    private CategoryNewsJpaAdapter categoryNewsJpaAdapter;

    @Test
    public void testGetCategoryNewsListByMockito(){
        List<CategoryNewsEntity> CategoryNewsEntityList = Arrays.asList(
                new CategoryNewsEntity(1L,"category1","description1"),
                new CategoryNewsEntity(2L,"category2","description2"));
        List<CategoryNews> CategoryNewsList = Arrays.asList(
                new CategoryNews(1L,"category1","description1"),
                new CategoryNews(2L,"category2","description2"));

        when(repository.findAll()).thenReturn(CategoryNewsEntityList);
        when(mapper.toCategoryList(CategoryNewsEntityList)).thenReturn(CategoryNewsList);

        final List<CategoryNews> result = categoryNewsJpaAdapter.getAllCategories();
        verify(repository, times(1)).findAll();
        verify(mapper, times(1)).toCategoryList(CategoryNewsEntityList);

        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    public void testGetCategoryNewsByMockito(){
        List<CategoryNewsEntity> CategoryNewsEntityList = Arrays.asList(
                new CategoryNewsEntity(1L,"category1","description1"),
                new CategoryNewsEntity(2L,"category2","description2"));
        List<CategoryNews> CategoryNewsList = Arrays.asList(
                new CategoryNews(1L,"category1","description1"),
                new CategoryNews(2L,"category2","description2"));

        when(repository.findAll()).thenReturn(CategoryNewsEntityList);
        when(mapper.toCategoryList(CategoryNewsEntityList)).thenReturn(CategoryNewsList);

        final List<CategoryNews> result = categoryNewsJpaAdapter.getAllCategories();
        verify(repository, times(1)).findAll();
        verify(mapper, times(1)).toCategoryList(CategoryNewsEntityList);

        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

}