package org.example.springbootdeveloper.dto;
//dto == 계층끼리 데이터를 교환하기 위해 사용하는 객체 (단순 전달자)
//dao == 데이터 베이스 연결, 조회, 수정 객체

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.example.springbootdeveloper.domain.Article;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class AddArticleRequest {

    private String title;
    private String content;

    public Article toEntity(){
        return Article.builder()
                .title(title)
                .content(content)
                .build();
    }
}
