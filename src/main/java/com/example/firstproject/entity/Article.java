package com.example.firstproject.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity //DB가 해당 객체를 인식 가능!
@AllArgsConstructor
@ToString


public class Article {

    @Id //주민등록번호처럼고유한 대표값을 지정!
    @GeneratedValue //1,2,3 처럼 id자동생성 어노테이션
    private Long id;
    @Column
    private String title;
    @Column
    private String content;



}
