package com.liceotrujillo.apiclt.news.application.dto;

import java.util.Date;

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
