package com.management.ovp.api;

import com.management.ovp.entities.Customer;
import com.management.ovp.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ListenerController {

    @Autowired
    private CustomerRepository customerRepository;



    @PostMapping(value = "/customer")
    public ResponseEntity<?> addCustomer(@RequestBody Customer customer) {

        try {
            return ResponseEntity.ok(customerRepository.save(customer));
        } catch (RuntimeException e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }


    @GetMapping(value = "/customer/{idCustomer}")
    public ResponseEntity<?> getCustomer(@PathVariable String idCustomer){

        try {
            Customer customer = customerRepository.findById(idCustomer).get();
            return ResponseEntity.ok(customer);
        } catch (RuntimeException e){
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }

    }



}
