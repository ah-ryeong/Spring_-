package com.winter.reactapi;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class PostRepository {
	// DB에서 가져온거라고 가정
	public static List<Post> findAll() {
		List<Post> posts = new ArrayList<Post>();
		for (int i = 1; i < 11; i++) {
			Post p = new Post(i, "제목"+i, "내용"+i);
			posts.add(p);
		}
		return posts;
	}
}
