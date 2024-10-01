package com.example.oop._domain.member.service;

import com.example.oop._domain.member.Member;

public interface MemberService {

   void signUp(Member member);

   Member findByIdMember(Long memberId);
}
