package com.example.oop._domain.order;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.example.oop._domain.member.Grade;
import com.example.oop._domain.member.Member;

/**
 * @Primary로 설정된 DiscountPolicy 구현체.
 * PercentDiscountPolicyImpl이 기본적으로 주입됩니다.
 * 
 * 만약 다른 할인 정책을 사용하고 싶다면, @Qualifier("fixDiscountPolicyImpl")를 사용하세요.
 */
@Service
@Primary
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
