package com.management.ovp.service;

import com.management.ovp.dtos.OrderDto;
import com.management.ovp.entities.Order;
import com.management.ovp.mapper.OrderMapper;
import com.management.ovp.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class OrderServiceImpl implements  OrderService{

    private final OrderMapper orderMapper;

    private final OrderRepository orderRepository;

    @Override
    public OrderDto addOrder(OrderDto orderDto) {
        Order order  = orderRepository.save(orderMapper.toOrder(orderDto));
        return orderMapper.toOrderDto(order);
    }

    @Override
    public Optional<OrderDto> getOrderById(String idOrder) {
        return orderRepository.findById(idOrder).map(orderMapper::toOrderDto);
    }
}
