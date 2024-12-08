package com.management.ovp.entities;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Setter
@Getter
@RequiredArgsConstructor
@Document(collection = "customers")
public class Customer {
    @Id
    private String idCustomer;
    private String firstNameCustomer;
    private String lastNameCustomer;
    private String addressCustomer;
    private String emailCustomer;
    private String cityCustomer;
    //@ManyToOne(fetch = FetchType.LAZY)
    //@JsonBackReference
    @DBRef
    private Order order;
}
