package com.example.oop._domain.order;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Order {

   private Long memberId;
   private String itemName;
   private int itemPrice;
   private int discountPrice;

   // 상품 금액으로 할인된 가격을 출력하는 기능
   public int calculateDiscount() {
      return itemPrice - discountPrice;
   }

}
