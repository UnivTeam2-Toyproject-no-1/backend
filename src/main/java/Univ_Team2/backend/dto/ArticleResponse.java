package Univ_Team2.backend.dto;

import Univ_Team2.backend.domain.Article;
import lombok.Getter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
public class ArticleResponse {
    private final Long id;
    private final String content;
    private final String nickname;
    private final LocalDate createdAt;

    public ArticleResponse(Article article) {
        this.id = article.getId();
        this.content = article.getContent();
        this.nickname = article.getNickname();
        this.createdAt = article.getCreatedAt();
    }
}
