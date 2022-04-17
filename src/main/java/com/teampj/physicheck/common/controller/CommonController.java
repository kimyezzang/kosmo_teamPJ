package com.teampj.physicheck.common.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.teampj.physicheck.common.dto.JoinRequest;
import com.teampj.physicheck.common.service.MemberService;

@Controller
public class CommonController {

	@Autowired
	MemberService memberService;

	private static final Logger logger = LoggerFactory.getLogger(CommonController.class);

	@RequestMapping("main")
	public String main(HttpServletRequest req, Model model) {
		logger.info("[url ==> main]C_con");

		return "common/main";
	}

	@RequestMapping("login")
	public String login(HttpServletRequest req, Model model) {
		logger.info("[url ==> login]C_con");

		return "common/login";
	}

	@RequestMapping("join")
	public String join(HttpServletRequest req, Model model) {
		logger.info("[url ==> join]C_con");

		return "common/join";
	}

	@PostMapping("join-action")
	public String joinAction(JoinRequest request) {
		logger.info("[url ==> joinAction]C_con");

		int success = memberService.save(request);

		if (success > 1) {
			System.out.println("회원가입 성공 : " + success);
		}

		return "common/login";
	}

}
