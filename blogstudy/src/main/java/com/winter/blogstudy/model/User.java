package com.winter.blogstudy.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
// ORM : Java(다른언어) Object -> 테이블로 매핑해주는 기술
@Entity // User 클래스가 실행되면 MySQL에 테이블이 자동으로 생성된다.
public class User {
	  
	@Id // Primary Key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // 프로젝트에서 연결된 DB의 넘버링 전략을 따라간다.
	private int id; // 시퀀스, auto_increment
	
	@Column(nullable = false, length = 30) // nullable : null 이 될 수 X
	private String username; // id
	
	@Column(nullable = false, length = 100) // 패스워드 길이를 넉넉히 주는 이유 : 비밀번호를 해쉬로 바꿔서 넣을거임
	private String password;
	
	@Column(nullable = false, length = 50)
	private String email;
	
	@ColumnDefault("'user")
	private String role; // Enum을 쓰는 것이 좋다 -> Enum을 쓰면 어떤 데이터의 도메인을 만들어줄 수 있다.
	// 권한을 줄 때 타입이 스트링이라 마음대로 쓸 수 있지만 Enum은 정해진 값만 넣을 수 있도록 정할 수 있음.
	// ex.성별 -> 도메인 (남, 녀)
	
	@CreationTimestamp // 시간이 자동으로 입력된다.
	private Timestamp createDate;
}
