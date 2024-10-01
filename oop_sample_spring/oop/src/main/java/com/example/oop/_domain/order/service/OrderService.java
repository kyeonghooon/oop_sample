package com.example.oop._domain.order.service;

import com.example.oop._domain.order.Order;

public interface OrderService {

   Order createOrder(Long memberId, String itemName, int itemPrice);
   
}
