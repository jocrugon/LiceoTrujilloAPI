package com.liceotrujillo.apiclt.news.application.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;
@Getter
@Setter
public class NewsFullResponse {
    private CategoryNewsDto category;
    private TagNewsDto tag;
    private String title;
    private String author;
    private boolean isFixed;
    private String body;
    private Date creationDate;
    private List<ImageNewsDto> images;
}
