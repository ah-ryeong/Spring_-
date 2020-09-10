package com.cos.demo;

import java.util.List;

import javax.sound.midi.Soundbank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cos.demo.model.Member;
import com.cos.demo.repository.MemberRepository;

@Controller
public class IndexController {

	@Autowired
	Test t;

	@GetMapping({ "", "/" })
	public @ResponseBody String index() {
		System.out.println(t.num);
		return "Hello"; // ViewResolver
	}

	// x-www-form-urlencoded => key = value
	@PostMapping("/form")
	public @ResponseBody String form(String username, String password, String email) {
		System.out.println(username);
		System.out.println(password);
		System.out.println(email);
		return "User"; // ViewResolver
	}

	// x-www-form-urlencoded => key = value
	@PostMapping("/form/model")
	public @ResponseBody String user(User user) {
		System.out.println(user.getUsername());
		System.out.println(user.getPassword());
		System.out.println(user.getEmail());
		return "User"; // ViewResolver
	}

	// x-www-form-urlencoded => key = value
	@GetMapping("/form/model")
	public @ResponseBody String formModelGet(User user) {
		System.out.println(user.getUsername());
		System.out.println(user.getPassword());
		System.out.println(user.getEmail());
		return "User"; // ViewResolver
	}

	// json => {"key" : 값}
	@PostMapping("/json/model")
	public @ResponseBody User jsonModel(@RequestBody User user) {
		System.out.println(user.getUsername());
		System.out.println(user.getPassword());
		System.out.println(user.getEmail());
		return user; // ViewResolver 작동금지 -> Jackson 작동
	}
	
	@GetMapping("/index")
	public String home() {
		return "index";
	}
	@Autowired
	private MemberRepository memberRepository;
	
	@GetMapping("/member/{id}")
	public @ResponseBody Member findById(@PathVariable int id) {
		Member member = memberRepository.findById(id);
		return member;
	}

	@GetMapping("/member")
	public @ResponseBody List<Member> findAll() {
		List<Member> members = memberRepository.findAll();
		return members;
	}
}
