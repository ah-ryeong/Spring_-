package com.winter.reactapi;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {
	
	@Autowired
	private PostRepository repo;
	
	@GetMapping("/post")
	public List<Post> getPosts() {
		return repo.findAll();
	}
}
