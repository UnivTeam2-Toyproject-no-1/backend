package Univ_Team2.Backend_Team2.controller;

import Univ_Team2.Backend_Team2.dto.ArticleResponse;
import Univ_Team2.Backend_Team2.service.GuestBookService;
import Univ_Team2.Backend_Team2.domain.Article;
import Univ_Team2.Backend_Team2.dto.AddArticleRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class GuestBookController {

    private final GuestBookService guestBookService;

    @PostMapping("/articles")
    public ResponseEntity<Article> addArticle(@RequestBody AddArticleRequest request) {
        Article savedArticle = guestBookService.save(request);
        
        // 요청한 자원이 성공적으로 생성되었으며, 저장된 글 정보를 응답 객체에 담아 전송!
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(savedArticle);
    }

    @GetMapping("/articles") // 해당 엔드포인트로 GET 요청이 오면 아래 메서드 실행
    public ResponseEntity<List<ArticleResponse>> findAllArticles() {
        List<ArticleResponse> articles = guestBookService.findAll()
                .stream()
                .map(ArticleResponse::new) // ArticleRespone 객체 생성
                .toList(); // 리스트로 반환

        return ResponseEntity.ok() // HTTP 상태코드 ok 반환
                .body(articles); // 응답 body에 DB에 저장된 데이터를 담아 반환
    }

    @DeleteMapping("/articles/{id}")
    public ResponseEntity<Void> deleteArticle(@PathVariable long id) {
        guestBookService.delete(id);

        return ResponseEntity.ok()
                .build();
    }
}
