package com.liceotrujillo.apiclt.news.infrastructure.output.jpa.repository;

import com.liceotrujillo.apiclt.news.infrastructure.output.jpa.entity.CategoryNewsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICategoryNewsRepository extends JpaRepository<CategoryNewsEntity,Long> {
}
