package Univ_Team2.Backend_Team2.service;

import Univ_Team2.Backend_Team2.domain.Article;
import Univ_Team2.Backend_Team2.dto.AddArticleRequest;
import Univ_Team2.Backend_Team2.repository.GuestBookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor // final 혹은 @NotNull 이 붙은 필드의 생성자 추가
@Service // 빈으로 서블릿 컨테이너에 등록
public class GuestBookService {
    private final GuestBookRepository guestBookRepository;

    // AddArticleRequest 클래스에 저장된 값들을 데이터베이스에 저장
    public Article save(AddArticleRequest request){
        return guestBookRepository.save(request.toEntity());
    }

    //JPA 지원 메서드인 findAll()을 호출해 article 테이블에 저장되어 있는 모든 데이터를 조회
    public List<Article> findAll() {
        return guestBookRepository.findAll();
    }

    public void delete(long id) {
        guestBookRepository.deleteById(id);
    }
}
