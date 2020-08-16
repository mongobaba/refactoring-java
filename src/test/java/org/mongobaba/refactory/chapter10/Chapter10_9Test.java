package org.mongobaba.refactory.chapter10;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;
import static org.mongobaba.refactory.chapter10.Chapter10_9.*;

class Chapter10_9Test {
    private Account account;

    @BeforeEach
    void initAccount() {
        account = new Account();
        account.addEntry(new Entry(2.0, Date.from(Instant.parse("2020-03-01T00:00:00Z"))));
        account.addEntry(new Entry(13.0, Date.from(Instant.parse("2020-04-01T00:00:00Z"))));
        account.addEntry(new Entry(8.5, Date.from(Instant.parse("2020-06-01T00:00:00Z"))));
        account.addEntry(new Entry(7.0, Date.from(Instant.parse("2020-07-01T00:00:00Z"))));
        account.addEntry(new Entry(22.0, Date.from(Instant.parse("2020-08-01T00:00:00Z"))));
    }

    @Test
    void flow() {
        assertEquals(28.5, getFlow(account), 0.01);
    }
}