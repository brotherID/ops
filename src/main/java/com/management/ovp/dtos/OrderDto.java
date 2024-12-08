package com.management.ovp.dtos;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.management.ovp.entities.Customer;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Collection;

@Setter
@Getter
@RequiredArgsConstructor
public class OrderDto {
    private String  idOrder;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private LocalDate dateOrder;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private LocalDate dateReception;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private LocalDate dateMaxDelivery;
    private Collection<Customer> customers;
}
