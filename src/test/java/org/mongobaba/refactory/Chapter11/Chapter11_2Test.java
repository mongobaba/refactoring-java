package org.mongobaba.refactory.Chapter11;

import org.junit.jupiter.api.Test;
import org.mongobaba.refactory.DateUtil;
import org.mongobaba.refactory.SystemOutputChecker;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;
import static org.mongobaba.refactory.Chapter11.Chapter11_2.*;

class Chapter11_2Test extends SystemOutputChecker {
    private Date date = DateUtil.at(2020, 8, 1);

    @Test
    void regularCustomer() {
        RegularCustomer customer = new RegularCustomer();
        customer.createBill(date);
        assertEquals("20.0", getOutputString());
    }

    @Test
    void preferredCustomer() {
        PreferredCustomer customer = new PreferredCustomer();
        customer.createBill(date);
        assertEquals("15.0", getOutputString());
    }
}