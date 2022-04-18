package com.teampj.physicheck.common.service;
import org.springframework.security.core.userdetails.UserDetailsService;

import com.teampj.physicheck.common.dto.JoinRequest;
import org.springframework.ui.Model;

import javax.servlet.http.HttpServletRequest;

public interface MemberService extends UserDetailsService {
    public boolean save(JoinRequest request);

    public void confirmIdAction(HttpServletRequest req, Model model);
}