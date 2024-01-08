package com.liceotrujillo.apiclt.news.application.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NewsPreviewResponse {
    private long id;
    private String category;
    private String tag;
    private String urlCoverImage;
    private String title;
    private String author;
    private boolean fixed;
}
