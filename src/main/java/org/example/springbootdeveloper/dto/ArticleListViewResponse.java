package org.example.springbootdeveloper.dto;

import lombok.Getter;
import org.example.springbootdeveloper.domain.Article;

//뷰에 데이터를 전달할 객체생성
@Getter
public class ArticleListViewResponse {

    private final Long id;
    private final String title;
    private final String content;

    public ArticleListViewResponse(Article article){
        this.id = article.getId();
        this.title = article.getTitle();
        this.content = article.getContent();
    }

}
