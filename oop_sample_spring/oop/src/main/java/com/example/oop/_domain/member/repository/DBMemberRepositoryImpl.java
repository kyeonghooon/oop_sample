package com.example.oop._domain.member.repository;

import org.springframework.stereotype.Repository;

import com.example.oop._domain.member.Member;

public class DBMemberRepositoryImpl implements MemberRepository {

   @Override
   public void save(Member member) {
   }

   @Override
   public Member findById(Long memberId) {
      return null;
   }

}
