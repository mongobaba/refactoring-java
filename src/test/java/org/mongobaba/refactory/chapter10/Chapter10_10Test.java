package org.mongobaba.refactory.chapter10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mongobaba.refactory.chapter10.Chapter10_10.*;

class Chapter10_10Test {
    @Test
    void account() {
        Account account = new Account("10");
        assertEquals("Account{id='10'}", account.toString());
    }

    @Test
    void zzAccount() {
        ZZAccount account = new ZZAccount("10");
        assertEquals("ZZAccount{id='ZZ10'}", account.toString());
    }

    @Test
    void interestAccount() {
        InterestAccount account = new InterestAccount("100", 10.0);
        String expected = "InterestAccount{id='100', interestRate=10.0}";
        assertEquals(expected, account.toString());
    }
}