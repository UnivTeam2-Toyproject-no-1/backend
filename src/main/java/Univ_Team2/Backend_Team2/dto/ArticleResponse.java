package Univ_Team2.Backend_Team2.dto;

import Univ_Team2.Backend_Team2.domain.Article;
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
