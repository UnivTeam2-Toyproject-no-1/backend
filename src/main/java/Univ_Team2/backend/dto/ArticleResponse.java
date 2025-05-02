package Univ_Team2.backend.dto;

import Univ_Team2.backend.domain.Article;
import lombok.Getter;

@Getter
public class ArticleResponse {

    private final String content;
    private final String nickname;

    public ArticleResponse(Article article) {
        this.content = article.getContent();
        this.nickname = article.getNickname();
    }
}
