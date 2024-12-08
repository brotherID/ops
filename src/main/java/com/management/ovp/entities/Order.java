package com.management.ovp.entities;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.Collection;

@Setter
@Getter
@RequiredArgsConstructor
@Document(collection = "orders")
public class Order {
    @Id
    private String  idOrder;
    private LocalDate  dateOrder;
    private LocalDate dateReception;
    private LocalDate dateMaxDelivery;
//    @OneToMany(mappedBy = "order",fetch = FetchType.LAZY)
   // @JsonManagedReference
    private Collection<Customer> customers;
}
