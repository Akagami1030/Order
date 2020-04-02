package com.akagami.order.model.dto;

import com.akagami.order.model.Customer;

import com.akagami.order.model.dto.dataaccess.CustomerDataAccess;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class CustomerDataAccessTest {
    CustomerDataAccess customerDataAccess;
    Customer customer;

    @BeforeEach
    void setup(){
        customerDataAccess = new CustomerDataAccess();
        customer = new Customer("Omar","Lamrabet","omar@vdab.be",null, "0487451232");
    }
    @Test
    public void testIfCustomerIsInsertedInDb(){
        customerDataAccess.insertCustomer(customer);
        Customer actualCustomer = customerDataAccess.getUserById(customer.getIdCustomer());
        assertThat(actualCustomer.getIdCustomer()).isEqualTo(customer.getIdCustomer());

    }

}