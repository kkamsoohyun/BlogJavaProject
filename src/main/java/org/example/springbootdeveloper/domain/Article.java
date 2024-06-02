package org.example.springbootdeveloper.domain;

//1. 엔티티 생성
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity //엔티티 생성을 알리는 애너테이션
@Getter //별도 코드 없이 게터 생성 완료
@NoArgsConstructor(access = AccessLevel.PROTECTED) //접근 제어자가 protected 인 기본 생성자 자동 생성
public class Article {
    @Id // id 를 기본키로
    @GeneratedValue(strategy = GenerationType.IDENTITY) //기본키를 자동으로 1씩 증가시킨다.

    @Column(name ="id", updatable = false)
    private Long id;

    @Column(name="title", nullable = false)
    private String title;

    @Column(name="content", nullable= false)
    private String content;

    @Builder //빌더 패턴으로 객체 생성 , 롬복에서 지원, 약간 보기 쉽게 객체 생성 가능
    public Article(String title, String content){
        this.title = title;
        this.content = content;
    }

}
