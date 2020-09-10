package com.winter.blogclone.model;

import java.security.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Post {
	private int id;
	private String title;
	private String longtext;
	private int userId;
	private Timestamp createDate;
}
