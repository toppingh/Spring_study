package com.spring.board.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Data // jsp, @getter / @setter , @tostring 등을 합친 것
public class Board { // 데이베이스의 테이블 이름 = Board
	@Id // pk
	@GeneratedValue(strategy = GenerationType.IDENTITY) // DB를 생성할때 auto increment를 했었는데 아이디를 만들지 않아도 알아서 db가 자동으로 생성
	// strategy가 전략을 의미. identity->mysql에 사용하는 
	private Integer id;
	private String title;
	private String content;
	private String filename;
	private String filepath;
	
	// 추가
	@CreationTimestamp
	@Column(name = "createDate", nullable = false)
	private LocalDateTime createDate;
	
	@UpdateTimestamp
	@Column(name = "modifyDate", nullable = false)
	private LocalDateTime modifyDate;
	
}