package com.example.oop.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.oop._domain.member.repository.MemberRepository;
import com.example.oop._domain.member.repository.MemoryMemberRepositoryImpl;
import com.example.oop._domain.member.service.MemberService;
import com.example.oop._domain.member.service.MemberServiceImpl;
import com.example.oop._domain.order.DiscountPolicy;
import com.example.oop._domain.order.FixDiscountPolicyImpl;
import com.example.oop._domain.order.service.OrderService;
import com.example.oop._domain.order.service.OrderServiceImpl;

// @Configuration
public class AppConfig {

   @Bean
   public MemberRepository memberRepository() {
      return new MemoryMemberRepositoryImpl();
   }

   @Bean
   public MemberService memberService() {
      return new MemberServiceImpl(memberRepository());
   }

   @Bean
   public DiscountPolicy discountPolicy() {
      // 할인 정책 설정 (정률 할인 사용)
      // return new PercentDiscountPolicyImpl();
      // 변경하려면 여기서 다른 구현체로 변경
      return new FixDiscountPolicyImpl();
   }

   @Bean
   public OrderService orderService() {
      return new OrderServiceImpl(memberRepository(), discountPolicy());
   }
}
