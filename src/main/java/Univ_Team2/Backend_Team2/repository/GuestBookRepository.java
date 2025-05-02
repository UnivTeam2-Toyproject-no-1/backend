package Univ_Team2.Backend_Team2.repository;


import Univ_Team2.Backend_Team2.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GuestBookRepository extends JpaRepository<Article, Long> {
}
