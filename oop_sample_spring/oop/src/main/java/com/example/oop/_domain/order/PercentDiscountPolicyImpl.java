package com.example.oop._domain.order;

import org.springframework.stereotype.Service;

import com.example.oop._domain.member.Grade;
import com.example.oop._domain.member.Member;

public class PercentDiscountPolicyImpl implements DiscountPolicy {

   private double discountPercent = 10.0;

   @Override
   public int discount(Member member, int price) {
      if (member.getGrade() == Grade.VIP) {
         return (int) (price * (discountPercent / 100));
      }
      return 0;
   }

}
