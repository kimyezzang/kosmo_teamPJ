package com.teampj.physicheck.common.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.teampj.physicheck.common.dto.JoinRequest;
import com.teampj.physicheck.common.entity.Member;
import com.teampj.physicheck.common.repository.MemberRepository;

@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    private MemberRepository memberRepository;

    @Override
    public UserDetails loadUserByUsername(String id) throws UsernameNotFoundException {
        Optional<Member> memberEntityWrapper = memberRepository.findByAbleTrueAndId(id);
        Member memberEntity = memberEntityWrapper.orElse(null);

        List<GrantedAuthority> authorities = new ArrayList<>();

        authorities.add(new SimpleGrantedAuthority("ROLE_MEMBER"));

        return new User(memberEntity.getId(), memberEntity.getPassword(), authorities);
    }

    @Transactional
    @Override
    public Integer save(JoinRequest request) {
        Member member = new Member();
        BeanUtils.copyProperties(request, member);

        String email = request.getEmail1() + '@' + request.getEmail2();

        member.setEmail(email);
        member.setAuthority("ROLE_MEMBER");

        // 비밀번호 암호화
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        member.setPassword(passwordEncoder.encode(member.getPassword()));

        return memberRepository.save(member).getMemberNo();
    }
}