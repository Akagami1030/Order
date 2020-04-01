package com.akagami.order.api;

import com.akagami.order.model.Customer;
import com.akagami.order.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping(path = "/customers")
public class CustomerController {
    private CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping(consumes = "application/json", produces = "application/json")
    public Customer createCustomerAndSaveCustomer(@RequestBody Customer customer) {
        customerService.addCustomer(customer);
        return customer;
    }

    @GetMapping(produces = "application/json", path = "/{id}")
    public Customer getUserById(@PathVariable UUID id) {
        return customerService.getUserById(id);
    }
}
