package com.liceotrujillo.apiclt.news.application.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
public class NewsEditingRequest {
    private String author;
    private String body;
    private Date creationDate;
    private Long tagId;
    private String title;
    private boolean fixed;
    private Long categoryId;
    private boolean active;
}
