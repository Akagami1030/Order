package com.akagami.order.model.dto;

import com.akagami.order.model.Customer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class CustomerDataAccess implements CustomerDto {
    private List<Customer> db = new ArrayList<>();

    @Override
    public void insertCustomer(Customer customer) {
        db.add(customer);
    }

    @Override
    public Customer getUserById(UUID id) {
        return db.stream().filter(customer -> customer.getIdCustomer().equals(id)).findFirst().orElse(null);
    }

    @Override
    public List<Customer> getAllCustomer() {
        return db;
    }

}
