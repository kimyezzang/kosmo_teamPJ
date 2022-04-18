package com.teampj.physicheck.Service;

import com.teampj.physicheck.common.dto.MemberResponse;
import com.teampj.physicheck.common.entity.Member;
import com.teampj.physicheck.common.repository.MemberRepository;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Optional;


// 로그인 성공 시 작동
public class UserLoginSuccessHandler implements AuthenticationSuccessHandler {

	MemberRepository memberRepository;

	public UserLoginSuccessHandler(MemberRepository memberRepository) {
		this.memberRepository = memberRepository;
	}

	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
			Authentication authentication) throws IOException, ServletException {
		System.out.println("<<< UserLoginSuccessHandler - onAuthenticationSuccess 진입 >>>");
		String id = authentication.getName();
		Optional<Member> memberEntityWrapper = memberRepository.findByAbleTrueAndId(id);
		Member memberEntity = memberEntityWrapper.orElse(null);

		MemberResponse memberResponse = new MemberResponse();
		memberResponse.setMemberNo(memberEntity.getMemberNo());
		memberResponse.setId(memberEntity.getId());
		memberResponse.setName(memberEntity.getName());
		memberResponse.setAuthority(memberEntity.getAuthority());
		memberResponse.setExamination(memberEntity.getExamination());

		request.getSession().setAttribute("memberInfo", memberResponse);	// 세션추가

		int grade = 0;
		if("ROLE_MEMBER".equals(memberEntity.getAuthority())) {
			grade = 1;
			RequestDispatcher dispatcher = request.getRequestDispatcher("/main");
			dispatcher.forward(request, response);
		} else {
			grade = 0;
			RequestDispatcher dispatcher = request.getRequestDispatcher("/orderList");
			dispatcher.forward(request, response);
		}
	}

}
