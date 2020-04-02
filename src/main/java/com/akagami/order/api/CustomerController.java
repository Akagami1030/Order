package com.akagami.order.api;

import com.akagami.order.model.Customer;
import com.akagami.order.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
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
        return customerService.getCustomerById(customer.getIdCustomer());
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(produces = "application/json", path = "/{id}")
    @PreAuthorize("hasAuthority('Admin')")
    public Customer getUserById(@PathVariable UUID id) {
        return customerService.getCustomerById(id);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(produces = "application/json")
    @PreAuthorize("hasAuthority('Admin')")
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }
}
