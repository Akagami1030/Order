package com.akagami.order.api;

import com.akagami.order.model.Customer;
import com.akagami.order.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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
    @ResponseStatus(HttpStatus.CREATED)
    public Customer createCustomerAndSaveCustomer(@RequestBody Customer customer) {
        customerService.addCustomer(customer);
        return customerService.getUserById(customer.getIdCustomer());
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(produces = "application/json", path = "/{id}")
    public Customer getUserById(@PathVariable UUID id) {
        return customerService.getUserById(id);
    }
}
