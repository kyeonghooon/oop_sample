package com.example.oop._domain.member.service;

import org.springframework.stereotype.Service;

import com.example.oop._domain.member.Member;
import com.example.oop._domain.member.repository.MemberRepository;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MemberServiceImpl implements MemberService {

   private MemberRepository memberRepository;

   @Override
   public void signUp(Member member) {
      memberRepository.save(member);
   }

   @Override
   public Member findByIdMember(Long memberId) {
      return memberRepository.findById(memberId);
   }

}
