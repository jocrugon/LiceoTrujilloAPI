package com.liceotrujillo.apiclt.news.domain.api;

import com.liceotrujillo.apiclt.news.domain.model.CategoryNews;

import java.util.List;

public interface ICategoryServicePort {
    List<CategoryNews> getAllCategories();
    CategoryNews getCategoryById(Long id);
}
