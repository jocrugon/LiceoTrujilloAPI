package com.liceotrujillo.apiclt.news.domain.usecase;

import com.liceotrujillo.apiclt.news.domain.api.ICategoryServicePort;
import com.liceotrujillo.apiclt.news.domain.model.CategoryNews;
import com.liceotrujillo.apiclt.news.domain.spi.ICategoryPersistencePort;

import java.util.List;

public class CategoryUseCase implements ICategoryServicePort {
    private final ICategoryPersistencePort categoryPersistencePort;
    public CategoryUseCase(ICategoryPersistencePort categoryPersistencePort){
        this.categoryPersistencePort = categoryPersistencePort;
    }
    @Override
    public List<CategoryNews> getAllCategories() {
        return categoryPersistencePort.getAllCategories();
    }

    @Override
    public CategoryNews getCategoryById(Long id) {
        return categoryPersistencePort.getCategoryById(id);
    }
}
