package com.winter.app.member;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//annotation 설명 + 기능
@Controller
@RequestMapping("/member/*") //  
public class MemberController {
	
	@RequestMapping(value = "join", method = RequestMethod.POST)
	public void join2() {
		System.out.println("Join Post");
	}
	
	@RequestMapping(value = "join", method = RequestMethod.GET)
	public String join() {
		System.out.println("회원 가입 페이지");
		 
		
		return "member/join";
	}
	
	@RequestMapping("login")
	public String login() {
		return "member/login";
	}
	
	

}
