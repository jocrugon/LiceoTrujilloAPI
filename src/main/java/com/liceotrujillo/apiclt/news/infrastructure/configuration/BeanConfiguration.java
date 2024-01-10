package com.liceotrujillo.apiclt.news.infrastructure.configuration;

import com.liceotrujillo.apiclt.news.domain.api.ICategoryServicePort;
import com.liceotrujillo.apiclt.news.domain.api.IImageServicePort;
import com.liceotrujillo.apiclt.news.domain.api.INewsServicePort;
import com.liceotrujillo.apiclt.news.domain.api.ITagServicePort;
import com.liceotrujillo.apiclt.news.domain.spi.ICategoryPersistencePort;
import com.liceotrujillo.apiclt.news.domain.spi.IImagePersistencePort;
import com.liceotrujillo.apiclt.news.domain.spi.INewsPersistencePort;
import com.liceotrujillo.apiclt.news.domain.spi.ITagPersistencePort;
import com.liceotrujillo.apiclt.news.domain.usecase.CategoryUseCase;
import com.liceotrujillo.apiclt.news.domain.usecase.ImageUseCase;
import com.liceotrujillo.apiclt.news.domain.usecase.NewsUseCase;
import com.liceotrujillo.apiclt.news.domain.usecase.TagUseCase;
import com.liceotrujillo.apiclt.news.infrastructure.output.jpa.adapter.CategoryNewsJpaAdapter;
import com.liceotrujillo.apiclt.news.infrastructure.output.jpa.adapter.ImageNewsJpaAdapter;
import com.liceotrujillo.apiclt.news.infrastructure.output.jpa.adapter.NewsJpaAdapter;
import com.liceotrujillo.apiclt.news.infrastructure.output.jpa.adapter.TagNewsJpaAdapter;
import com.liceotrujillo.apiclt.news.infrastructure.output.jpa.mapper.ICategoryNewsEntityMapper;
import com.liceotrujillo.apiclt.news.infrastructure.output.jpa.mapper.IImageNewsEntityMapper;
import com.liceotrujillo.apiclt.news.infrastructure.output.jpa.mapper.INewsEntityMapper;
import com.liceotrujillo.apiclt.news.infrastructure.output.jpa.mapper.ITagNewsEntityMapper;
import com.liceotrujillo.apiclt.news.infrastructure.output.jpa.repository.ICategoryNewsRepository;
import com.liceotrujillo.apiclt.news.infrastructure.output.jpa.repository.IImageNewsRepository;
import com.liceotrujillo.apiclt.news.infrastructure.output.jpa.repository.INewsRepository;
import com.liceotrujillo.apiclt.news.infrastructure.output.jpa.repository.ITagNewsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class BeanConfiguration {
    private final ICategoryNewsRepository categoryNewsRepository;
    private final ICategoryNewsEntityMapper categoryNewsEntityMapper;
    private final IImageNewsEntityMapper imageNewsEntityMapper;
    private final IImageNewsRepository imageNewsRepository;
    private final INewsEntityMapper newsEntityMapper;
    private final INewsRepository newsRepository;
    private final ITagNewsEntityMapper tagNewsEntityMapper;
    private final ITagNewsRepository tagNewsRepository;

    @Bean
    public ICategoryPersistencePort categoryPersistencePort(){
        return new CategoryNewsJpaAdapter(categoryNewsRepository,categoryNewsEntityMapper);
    }
    @Bean
    public ICategoryServicePort categoryServicePort(){
        return new CategoryUseCase(categoryPersistencePort());
    }

    @Bean
    public ITagPersistencePort tagPersistencePort(){
        return new TagNewsJpaAdapter(tagNewsEntityMapper,tagNewsRepository);
    }
    @Bean
    public ITagServicePort tagServicePort(){
        return new TagUseCase(tagPersistencePort());
    }

    @Bean
    public IImagePersistencePort imagePersistencePort(){
        return new ImageNewsJpaAdapter(imageNewsEntityMapper,imageNewsRepository);
    }
    @Bean
    public IImageServicePort imageServicePort(){
        return new ImageUseCase(imagePersistencePort());
    }

    @Bean
    public INewsPersistencePort newsPersistencePort(){
        return new NewsJpaAdapter(newsEntityMapper,newsRepository);
    }
    @Bean
    public INewsServicePort newsServicePort(){
        return new NewsUseCase(newsPersistencePort());
    }
}
