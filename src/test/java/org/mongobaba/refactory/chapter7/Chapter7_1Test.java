package org.mongobaba.refactory.chapter7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mongobaba.refactory.chapter7.Chapter7_1.*;

class Chapter7_1Test {
    private Account account;
    private AccountType premiumAccount = new AccountType(true);
    private AccountType notPremiumAccount = new AccountType(false);

    @Test
    void notOverdrawn() {
        account = new Account(null, 0);
        assertEquals(4.5, account.bankCharge(), 0.001);
    }

    @Test
    void premiumShortTime() {
        account = new Account(premiumAccount, 3);
        assertEquals(14.5, account.bankCharge(), 0.001);
    }

    @Test
    void premiumLongTime() {
        account = new Account(premiumAccount, 10);
        assertEquals(17.05, account.bankCharge(), 0.001);
    }

    @Test
    void notPremium() {
        account = new Account(notPremiumAccount, 3);
        assertEquals(9.75, account.bankCharge(), 0.001);
    }
}