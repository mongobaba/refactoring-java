package org.mongobaba.refactory.chapter8;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mongobaba.refactory.chapter8.Chapter8_7.*;

class Chapter8_7Test {
    private Customer Don;
    private Customer John;
    private Order order1;
    private Order order2;

    @BeforeEach
    void initCustomers() {
        Don = new Customer();
        John = new Customer();
        order1 = new Order("1");
        order2 = new Order("2");
    }

    @Test
    void printAllOrder() {
        order1.setCustomer(Don);
        Don.addOrder(order1);
        order2.setCustomer(Don);
        Don.addOrder(order2);
        assertEquals("1,2", Don.printAllOrder());
    }

    @Test
    void changeCustomer() {
        order1.setCustomer(Don);
        Don.addOrder(order1);
        order1.setCustomer(John);
        assertEquals("", Don.printAllOrder());
    }
}