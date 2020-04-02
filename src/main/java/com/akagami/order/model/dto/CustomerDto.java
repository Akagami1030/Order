package com.akagami.order.model.dto;

import com.akagami.order.model.Customer;

import java.util.List;
import java.util.UUID;

public interface CustomerDto {
    void insertCustomer(Customer customer);
    Customer getUserById(UUID id);
    List<Customer> getAllCustomer();
}
