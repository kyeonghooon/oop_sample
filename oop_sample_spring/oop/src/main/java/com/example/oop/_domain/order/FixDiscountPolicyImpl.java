package com.example.oop._domain.order;

import org.springframework.stereotype.Service;

import com.example.oop._domain.member.Grade;
import com.example.oop._domain.member.Member;

public class FixDiscountPolicyImpl implements DiscountPolicy {

   private int discountFixAmount = 1500;

   @Override
   public int discount(Member member, int price) {
      // VIP 회원만 할인 금액 적용 된다.
      if (member.getGrade() == Grade.VIP){
         return discountFixAmount;
      }
      return 0;
   }

}
