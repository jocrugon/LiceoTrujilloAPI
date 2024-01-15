package com.liceotrujillo.apiclt.news.application.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;
@Getter
@Setter
public class ImageNewsRequest {
    private String description;
    private Date uploadDate;
    private MultipartFile imageFile;
    private Long newsId;
    private boolean coverImage;
}
