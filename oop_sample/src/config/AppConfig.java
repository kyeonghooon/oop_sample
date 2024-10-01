package config;

import member.repository.MemberRepository;
import member.repository.MemoryMemberRepositoryImpl;
import member.service.MemberService;
import member.service.MemberServiceImpl;
import order.DiscountPolicy;
import order.FixDiscountPolicyImpl;
import order.PercentDiscountPolicyImpl;
import order.service.OrderService;
import order.service.OrderServiceImpl;

public class AppConfig {

   public MemberRepository getMemberRepository() {
      return MemoryMemberRepositoryImpl.getInstance();
   }

   public MemberService getMemberService() {
      return new MemberServiceImpl(getMemberRepository());
   }

   public DiscountPolicy getDiscountPolicy() {
      // 할인 정책 --> 고정 할인
      // 변경 --> 정률 할인으로 바꾸면 된다.
      // return new FixDiscountPolicyImpl();
      return new PercentDiscountPolicyImpl();
   }

   public OrderService getOrderService() {
      return new OrderServiceImpl(getMemberRepository(), getDiscountPolicy());
   }

}
