package org.mongobaba.refactory.chapter10;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mongobaba.refactory.DateUtil;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mongobaba.refactory.chapter10.Chapter10_9.*;

class Chapter10_9Test {
    private Account account;

    @BeforeEach
    void initAccount() {
        account = new Account();
        account.addEntry(new Entry(2.0, DateUtil.at(2020, 3, 1)));
        account.addEntry(new Entry(13.0, DateUtil.at(2020, 4, 1)));
        account.addEntry(new Entry(8.5, DateUtil.at(2020, 6, 1)));
        account.addEntry(new Entry(7.0, DateUtil.at(2020, 7, 1)));
        account.addEntry(new Entry(22.0, DateUtil.at(2020, 8, 1)));
    }

    @Test
    void flow() {
        assertEquals(28.5, getFlow(account), 0.01);
    }
}