package org.mongobaba.refactory.chapter9;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mongobaba.refactory.DateUtil;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Chapter9_1Test {
    private Chapter9_1 obj;
    private static final Date summerDate = DateUtil.at(2020, 7, 1);
    private static final Date winterDate = DateUtil.at(2020, 11, 1);

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