package com.liceotrujillo.apiclt.news.infrastructure.input.rest;

import com.liceotrujillo.apiclt.news.application.dto.NewsFullResponse;
import com.liceotrujillo.apiclt.news.application.dto.NewsPreviewResponse;
import com.liceotrujillo.apiclt.news.application.handler.INewsHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/news")
@RequiredArgsConstructor
public class NewsRestController {
    private final INewsHandler newsHandler;

    @GetMapping("/preview")
    public ResponseEntity<List<NewsPreviewResponse>> getAllNewsPreview(){
        return ResponseEntity.ok(newsHandler.getAllNewsPreview());
    }

    @GetMapping("/{id}")
    public ResponseEntity<NewsFullResponse> getNewsFullById(@PathVariable Long id){
        return ResponseEntity.ok(newsHandler.getNewsFullById(id));
    }
}
