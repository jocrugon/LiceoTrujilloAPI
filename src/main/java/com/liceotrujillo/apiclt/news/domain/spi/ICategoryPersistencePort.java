package com.liceotrujillo.apiclt.news.domain.spi;

import com.liceotrujillo.apiclt.news.domain.model.CategoryNews;

import java.util.List;

public interface ICategoryPersistencePort {
    List<CategoryNews> getAllCategories();
    CategoryNews getCategoryById(Long id);
}
