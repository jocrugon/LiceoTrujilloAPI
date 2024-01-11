package com.liceotrujillo.apiclt.news.infrastructure.exceptionhandler;

import com.liceotrujillo.apiclt.news.infrastructure.exception.CategoryNewsNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.Collections;
import java.util.Map;

@ControllerAdvice
public class ControllerAdvisor {

    private static final String MESSAGE = "Message";
    @ExceptionHandler(CategoryNewsNotFoundException.class)
    public ResponseEntity<Map<String,String>> handlerCategoryNewsNotFoundException(
            CategoryNewsNotFoundException categoryNewsNotFoundException){
        return ResponseEntity.status(HttpStatus.CONFLICT)
                .body(Collections.singletonMap(MESSAGE,ExceptionResponse.CATEGORYNEWS_NOT_FOUND.getMessage()));
    }
}
