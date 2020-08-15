package org.mongobaba.refactory.chapter9;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class Chapter9_1Test {
    private Chapter9_1 obj;
    private static final Date summerDate = Date.from(Instant.parse("2020-07-01T00:00:00.00Z"));
    private static final Date winterDate = Date.from(Instant.parse("2020-11-01T00:00:00.00Z"));

    @BeforeEach
    void setup() {
        obj = new Chapter9_1();
    }

    @Test
    void summerCharge() {
        assertEquals(1.5, obj.calculateCharge(summerDate, 10.0), 0.001);
    }

    @Test
    void winterCharge() {
        assertEquals(1.3, obj.calculateCharge(winterDate, 10.0), 0.001);
    }
}