package Univ_Team2.backend.repository;


import Univ_Team2.backend.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GuestBookRepository extends JpaRepository<Article, Long> {
}
