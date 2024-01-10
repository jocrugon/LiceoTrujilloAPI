package com.liceotrujillo.apiclt.news.infrastructure.output.jpa.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
@Entity
@Table(name = "image_news")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ImageNewsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    @Column(name = "upload_date")
    private Date uploadDate;
    private String url;
    @Column(name = "news_id")
    private Long newsId;
    @Column(name = "cover_image")
    private boolean coverImage;
}
