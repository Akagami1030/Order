package com.akagami.order.model;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {
    Customer customer;

    @BeforeEach
            void setUp(){
         customer = new Customer("Omar","Lamrabet","omar@vdab.be",null, "0487451232");
    }


    @Test
    public void confirmUser(){
        assertThat(customer.getFirstName()).isEqualTo("Omar");
    }

}