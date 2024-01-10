package com.liceotrujillo.apiclt.news.infrastructure.output.jpa.repository;

import com.liceotrujillo.apiclt.news.infrastructure.output.jpa.entity.NewsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface INewsRepository extends JpaRepository<NewsEntity,Long> {
    Optional<List<NewsEntity>> findAllByActiveTrue();
}
