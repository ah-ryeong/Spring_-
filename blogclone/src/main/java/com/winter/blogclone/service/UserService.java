package com.winter.blogclone.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.winter.blogclone.model.User;
import com.winter.blogclone.repository.UserRepository;

@Service // IoC
public class UserService {

	@Autowired
	private UserRepository userRepository; // DI
	
	@Transactional
	public int 회원가입(User user) {
		try {
			userRepository.save(user); // save 끝아면 다시 컨트롤러로 돌아간다.
			return 1; // 정상작동시 1
		} catch (Exception e) {
			e.getMessage();
			return -1;
		}
	}
}
