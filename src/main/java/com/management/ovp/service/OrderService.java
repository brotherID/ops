package com.management.ovp.service;

import com.management.ovp.dtos.OrderDto;

import java.util.Optional;

public interface OrderService {
    OrderDto addOrder(OrderDto orderDto);
    Optional<OrderDto> getOrderById(String idOrder);
}
