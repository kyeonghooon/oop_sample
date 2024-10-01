package com.example.oop._domain.member.repository;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import com.example.oop._domain.member.Member;

@Repository
@Profile("prod")
public class DBMemberRepositoryImpl implements MemberRepository {

   @Override
   public void save(Member member) {
   }

   @Override
   public Member findById(Long memberId) {
      return null;
   }

}
