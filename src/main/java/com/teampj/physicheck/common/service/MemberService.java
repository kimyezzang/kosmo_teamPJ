package com.teampj.physicheck.common.service;
import org.springframework.security.core.userdetails.UserDetailsService;

import com.teampj.physicheck.common.dto.JoinRequest;

public interface MemberService extends UserDetailsService {
    public Integer save(JoinRequest request);
}