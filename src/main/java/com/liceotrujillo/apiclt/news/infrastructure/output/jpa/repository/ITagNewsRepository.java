package com.liceotrujillo.apiclt.news.infrastructure.output.jpa.repository;

import com.liceotrujillo.apiclt.news.infrastructure.output.jpa.entity.TagNewsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITagNewsRepository extends JpaRepository<TagNewsEntity,Long> {
}
