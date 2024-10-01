package com.example.oop._domain.order.service;

import org.springframework.stereotype.Service;

import com.example.oop._domain.member.Member;
import com.example.oop._domain.member.repository.MemberRepository;
import com.example.oop._domain.order.DiscountPolicy;
import com.example.oop._domain.order.Order;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

   private final MemberRepository memberRepository;
   private final DiscountPolicy discountPolicy;

   @Override
   public Order createOrder(Long memberId, String itemName, int itemPrice) {
      Member member = memberRepository.findById(memberId);
      int discountPrice = discountPolicy.discount(member, itemPrice);
      return new Order(memberId, itemName, itemPrice, discountPrice);
   }

}
