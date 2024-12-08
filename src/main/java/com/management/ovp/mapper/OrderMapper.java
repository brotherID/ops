package com.management.ovp.mapper;

import com.management.ovp.dtos.OrderDto;
import com.management.ovp.entities.Order;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = {CustomerMapper.class})
public interface OrderMapper {

    @Mapping(target = "customers", source = "customers")
    OrderDto toOrderDto(Order order);

    @Mapping(target = "customers", source = "customers")
    Order toOrder(OrderDto orderDto);
}
