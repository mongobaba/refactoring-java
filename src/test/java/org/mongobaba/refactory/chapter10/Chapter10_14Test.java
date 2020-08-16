package org.mongobaba.refactory.chapter10;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mongobaba.refactory.SystemOutputChecker;

import static org.junit.jupiter.api.Assertions.*;
import static org.mongobaba.refactory.chapter10.Chapter10_14.*;

class Chapter10_14Test extends SystemOutputChecker {
    private Account account;

    @BeforeEach
    void initAccount() {
        account = new Account(100);
    }

    @Test
    void overdrawn() {
        withdraw(account, 150);
        assertEquals("overdrawn", getOutputString());
    }

    @Test
    void usual() {
        withdraw(account, 50);
        assertEquals("usual thing", getOutputString());
    }
}