package org.mongobaba.refactory.chapter8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mongobaba.refactory.chapter8.Chapter8_8.*;

class Chapter8_8Test {
    @Test
    void getPriceFor() {
        Customer customer = new Customer();
        Order order = new Order();
        order.setCustomer(customer);
        assertEquals(50.0, customer.getPriceFor(order), 0.001);
    }
}