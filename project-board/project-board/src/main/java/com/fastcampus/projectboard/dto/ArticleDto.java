package com.fastcampus.projectboard.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

public record ArticleDto(
        LocalDateTime createdAt,
        String createdBy,
        String title,
        String content,
        String hashtag

) implements Serializable {

    public static ArticleDto of(LocalDateTime createdAt, String createdBy,String title, String content, String hashtag) {
        return new ArticleDto(createdAt, createdBy ,title, content, hashtag);

    }
}
