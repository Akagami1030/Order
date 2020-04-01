package com.akagami.order.service;

import com.akagami.order.model.Customer;
import com.akagami.order.model.dto.CustomerDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerService {
    private final CustomerDto customerDto;

    @Autowired
    public CustomerService( CustomerDto customerDto) {
        this.customerDto = customerDto;
    }

    public void addCustomer(Customer customer){
        customerDto.insertCustomer(customer);
    }

    public Customer getUserById(UUID id){
       return customerDto.getUserById(id);
    }
}
