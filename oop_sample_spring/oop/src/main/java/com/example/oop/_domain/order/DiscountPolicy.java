package com.example.oop._domain.order;

import com.example.oop._domain.member.Member;

public interface DiscountPolicy {
   int discount(Member member, int price);
}
