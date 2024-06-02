package org.example.springbootdeveloper.repository;
//2.리포지터리 만들기
import org.example.springbootdeveloper.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> {
}
