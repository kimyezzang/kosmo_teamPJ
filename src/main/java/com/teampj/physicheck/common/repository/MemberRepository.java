package com.teampj.physicheck.common.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.teampj.physicheck.common.entity.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member, String> {
	public Optional<Member> findByAbleTrueAndId(String id);
}
