package com.liceotrujillo.apiclt.news.infrastructure.output.jpa.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "news")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class NewsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String author;
    private String body;
    @Column(name = "creation_date")
    private Date creationDate;
    @Column(name = "tag_id")
    private Long tagId;
    private String title;
    private boolean fixed;
    @Column(name = "category_id")
    private Long categoryId;
}
