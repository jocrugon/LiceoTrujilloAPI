package com.liceotrujillo.apiclt.news.application.dto;

import com.liceotrujillo.apiclt.news.domain.model.TagNews;

import java.util.Date;
import java.util.List;

public class NewsFullResponse {
    private CategoryNewsDTO category;
    private TagNewsDTO tag;
    private String title;
    private String author;
    private boolean isFixed;
    private String body;
    private Date creationDate;
    private List<ImageDTO> images;

}
