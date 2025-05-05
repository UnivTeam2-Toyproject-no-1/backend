package Univ_Team2.backend.dto;

import Univ_Team2.backend.domain.Article;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@NoArgsConstructor //기본 생성자 추가
@AllArgsConstructor // 모든 필드 값을 매개변수로 받는 생성자 추가
@Getter
public class AddArticleRequest {

    private String nickname;
    private String content;

    //DTO 를 엔티티로 만들어주는 메서드
    public Article toEntity() {
        return Article.builder()
                .nickname(nickname)
                .content(content)
                .build();
    }
}
