package order.service;

import lombok.RequiredArgsConstructor;
import member.Member;
import member.repository.MemberRepository;
import order.DiscountPolicy;
import order.Order;

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
