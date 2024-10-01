package com.example.oop._domain.member.repository;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.example.oop._domain.member.Grade;
import com.example.oop._domain.member.Member;

public class MemoryMemberRepositoryImpl implements MemberRepository {

   private Map<Long, Member> memberStore = new HashMap<>();

   public MemoryMemberRepositoryImpl() {
      initData();
   }//

   // 초기 샘플 데이터
   private void initData() {
      memberStore.put(1L, new Member(1L, "홍길동", Grade.VIP));
      memberStore.put(2L, new Member(2L, "이몽룡", Grade.VIP));
      memberStore.put(3L, new Member(3L, "성춘향", Grade.VIP));
   }

   @Override
   public void save(Member member) {
      memberStore.put(member.getId(), member);
   }

   @Override
   public Member findById(Long memberId) {
      return memberStore.get(memberId);
   }

}
