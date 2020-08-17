package org.mongobaba.refactory.Chapter6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mongobaba.refactory.Chapter6.Chapter6_8.*;

class Chapter6_8Test {
    @Test
    void gamma() {
        Account account = new Account();
        assertEquals(7660, account.gamma(10, 2, 100));
        assertEquals(14520, account.gamma(10, 2, 200));
    }
}