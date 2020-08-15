package org.mongobaba.refactory.chapter9;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mongobaba.refactory.chapter9.Chapter9_7.*;

class Chapter9_7Test {
    private Site site;

    @BeforeEach
    void initSite() {
        site = new Site();
    }

    @Test
    void hasCustomer() {
        Customer customer = new Customer("Don");
        site.setCustomer(customer);
        assertEquals("site used by <Don>", site.displayRecord());
    }

    @Test
    void noCustomer() {
        assertEquals("site used by <occupant>", site.displayRecord());
    }
}