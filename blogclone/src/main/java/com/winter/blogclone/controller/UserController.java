package com.winter.blogclone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.winter.blogclone.controller.dto.CommonRespDto;
import com.winter.blogclone.model.User;
import com.winter.blogclone.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;

	@PostMapping("/auth/joinProc")
	public @ResponseBody CommonRespDto<?> joinProc(@RequestBody User user) {
		// key = value 데이터만 받을 수 있기 때문에 @RequestBody를 적어준다.
		// 응답을 데이터로 받기 위해서 @ResponseBody 사용
		int result = userService.회원가입(user);
		return new CommonRespDto<String>(result, "회원가입결과 :" + result);
		// 타입 결정나면 그때 적어주기 위해 String
	}
}
