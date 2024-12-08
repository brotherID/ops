package com.management.ovp.dtos;

import com.management.ovp.entities.Order;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;


@Setter
@Getter
@RequiredArgsConstructor
public class CustomerDto {
    private String idCustomer;
    private String firstNameCustomer;
    private String lastNameCustomer;
    private String addressCustomer;
    private String emailCustomer;
    private String cityCustomer;
    private String idOrder;
}
