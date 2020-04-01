package com.akagami.order.model.dto;

import com.akagami.order.model.Customer;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public interface CustomerDto {
    void insertCustomer(Customer customer);
    Customer getUserById(UUID id);
}
