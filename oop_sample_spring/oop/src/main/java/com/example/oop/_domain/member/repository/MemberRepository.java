package com.example.oop._domain.member.repository;

import com.example.oop._domain.member.Member;

public interface MemberRepository {

   void save(Member member);
   Member findById(Long memberId);

}
