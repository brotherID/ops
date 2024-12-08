package com.management.ovp.mapper;

import com.management.ovp.dtos.CustomerDto;
import com.management.ovp.entities.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    @Mapping(source = "order.idOrder", target = "idOrder")
    CustomerDto toCustomerDto(Customer customer);

    @Mapping(source = "idOrder", target = "order.idOrder")
    Customer toCustomer(CustomerDto customerDto);

}
