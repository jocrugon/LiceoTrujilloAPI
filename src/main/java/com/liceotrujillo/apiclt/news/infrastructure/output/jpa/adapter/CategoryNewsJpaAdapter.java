package com.liceotrujillo.apiclt.news.infrastructure.output.jpa.adapter;

import com.liceotrujillo.apiclt.news.domain.model.CategoryNews;
import com.liceotrujillo.apiclt.news.domain.spi.ICategoryPersistencePort;
import com.liceotrujillo.apiclt.news.infrastructure.exception.CategoryNewsNotFoundException;
import com.liceotrujillo.apiclt.news.infrastructure.exception.NoDataFoundException;
import com.liceotrujillo.apiclt.news.infrastructure.output.jpa.entity.CategoryNewsEntity;
import com.liceotrujillo.apiclt.news.infrastructure.output.jpa.mapper.ICategoryNewsEntityMapper;
import com.liceotrujillo.apiclt.news.infrastructure.output.jpa.repository.ICategoryNewsRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class CategoryNewsJpaAdapter implements ICategoryPersistencePort {
    private final ICategoryNewsRepository repository;
    private final ICategoryNewsEntityMapper mapper;

    @Override
    public List<CategoryNews> getAllCategories() {
        List<CategoryNewsEntity> categoryNewsEntityList = repository.findAll();
        if(categoryNewsEntityList.isEmpty()){
            throw new NoDataFoundException();
        }
        return mapper.toCategoryList(categoryNewsEntityList);
    }

    @Override
    public CategoryNews getCategoryById(Long id) {
        return mapper.toCategory(repository.findById(id).orElseThrow(CategoryNewsNotFoundException::new));
    }
}
