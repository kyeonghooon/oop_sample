package order.service;

import order.Order;

public interface OrderService {

   Order createOrder(Long memberId, String itemName, int itemPrice);
   
}
