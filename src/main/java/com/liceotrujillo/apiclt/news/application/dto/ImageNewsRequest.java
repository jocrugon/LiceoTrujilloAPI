package com.liceotrujillo.apiclt.news.application.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
public class ImageNewsRequest {
    private String description;
    private Date uploadDate;
    private String url;
    private Long newsId;
    private boolean coverImage;
}
