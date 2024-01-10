package com.liceotrujillo.apiclt.news.infrastructure.output.jpa.repository;

import com.liceotrujillo.apiclt.news.infrastructure.output.jpa.entity.ImageNewsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface IImageNewsRepository extends JpaRepository<ImageNewsEntity,Long> {
    Optional<List<ImageNewsEntity>> findByNewsId(Long id);
    Optional<List<ImageNewsEntity>> findByCoverImageTrue();
}
