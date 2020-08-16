package org.mongobaba.refactory.chapter7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mongobaba.refactory.chapter7.Chapter7_2.*;

class Chapter7_2Test {
    @Test
    void interest() {
        Account account = new Account(0.05);
        assertEquals(50.0, account.interestForAmountDays(1000.0, 365), 0.001);
    }
}