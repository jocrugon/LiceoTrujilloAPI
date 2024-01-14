package com.liceotrujillo.apiclt.news.infrastructure.input.rest;

import com.liceotrujillo.apiclt.news.application.dto.*;
import com.liceotrujillo.apiclt.news.application.handler.INewsEditingHandler;
import com.liceotrujillo.apiclt.news.domain.model.CategoryNews;
import com.liceotrujillo.apiclt.news.domain.model.News;
import com.liceotrujillo.apiclt.news.domain.model.TagNews;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping("/editing")
@RequiredArgsConstructor
public class NewsEditingRestController {
    private final INewsEditingHandler handler;

    @GetMapping("/categories")
    public ResponseEntity<List<CategoryNews>> getAllCategoriesNews(){
        return ResponseEntity.ok(handler.getAllCategoryNews());
    }

    @GetMapping("/tags")
    public ResponseEntity<List<TagNews>> getAllTagNews(){
        return ResponseEntity.ok(handler.getAllTagNews());
    }

    @PostMapping("/news")
    public ResponseEntity<Long> saveNews(@RequestBody NewsEditingRequest news){
        return ResponseEntity.status(HttpStatus.CREATED).body(handler.saveNews(news));
    }

    @GetMapping("/news")
    public ResponseEntity<NewsEditingResponse> getNewsEditingById(Long id){
        return ResponseEntity.ok(handler.getNewsEditingById(id));
    }

    @PutMapping("/news")
    public ResponseEntity<Void> updateNews(News news){
        handler.updateNews(news);
        return ResponseEntity.noContent().build();
    }

    @PostMapping("/image")
    public ResponseEntity<Void> saveImage(@RequestBody ImageNewsRequest imageNewsRequest){//te tiene que regresar el id
        handler.saveImage(imageNewsRequest);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
    @PostMapping("/imageS3")
    public ResponseEntity<String> saveImageS3(@RequestParam MultipartFile imageFile){
        return ResponseEntity.ok(handler.saveImageInS3(imageFile));
    }
    @GetMapping("/image")
    public ResponseEntity<List<ImageNewsDto>> getImagesByNewsId(Long id){
        return ResponseEntity.ok(handler.getImagesByNewsId(id));
    }
}
