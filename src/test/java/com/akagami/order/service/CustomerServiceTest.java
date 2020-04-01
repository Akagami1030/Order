package com.akagami.order.service;

import com.akagami.order.model.Customer;
import com.akagami.order.model.dto.CustomerDataAccess;
import com.akagami.order.model.dto.CustomerDto;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class CustomerServiceTest {
    CustomerDataAccess customerDataAccess;
    CustomerService customerService;
    Customer customer;

    @BeforeEach
    void setup(){
        customerDataAccess = new CustomerDataAccess();
        customerService = new CustomerService(customerDataAccess);
        customer = new Customer("Omar","Lamrabet","omar@vdab.be",null, "0487451232");
    }

    @Test
    void testIfWeCanAddACustomerAndGetIt(){
        customerService.addCustomer(customer);
        Customer actualCustomer = customerService.getUserById(customer.getIdCustomer());
        assertThat(customer.getIdCustomer()).isEqualTo(actualCustomer.getIdCustomer());
    }

}