package com.example.oop._domain.order.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.oop._domain.member.Grade;
import com.example.oop._domain.member.Member;
import com.example.oop._domain.member.service.MemberService;
import com.example.oop._domain.order.Order;
import com.example.oop._domain.order.service.OrderService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class TestController {

   private final OrderService orderService;
   private final MemberService memberService;

   @GetMapping("/test2")
   public String test() {
      System.out.println("ssss");
      Member member = new Member(200L, "홍길동", Grade.VIP);
      memberService.signUp(member);
      Order order = orderService.createOrder(member.getId(), "아이폰16", 3_000);
      return order.toString();
   }

}
