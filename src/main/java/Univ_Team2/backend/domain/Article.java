package Univ_Team2.backend.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDate;
import java.time.LocalDateTime;

@EntityListeners(AuditingEntityListener.class)
@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED) // 접근 제어자가 protected 인 기본 생성자를 생성
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // id 값을 자동 갱신 및 할당
    @Column(name = "id", updatable = false)
    private Long id; // 객체의 변수 지정

    @Column(name = "content", updatable = false, nullable = false)
    private String content;

    @Column(name = "nickname", updatable = false)
    private String nickname;

    @CreatedDate // 엔티티가 생성될 때 생성시간 저장
    @Column(name="created_at")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate createdAt;

    @Builder // 빌더 패턴으로 객체 생성
    public Article(String content, String nickname) {
        this.content = content;
        this.nickname = nickname;
    }
}
