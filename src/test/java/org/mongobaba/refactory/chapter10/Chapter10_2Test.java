package org.mongobaba.refactory.chapter10;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Chapter10_2Test {
    @Test
    void getTelephoneNumber() {
        String expected = "Telephone: 123456";
        assertEquals(expected, Chapter10_2.getTelephoneNumber(123456));
    }

    // TODO 重构完成后启用该测试进行验证
    @Disabled
    void newTelephoneNumber() {
        String expected = "Telephone: (100)123456";
//        assertEquals(expected, Chapter10_2.getTelephoneNumber(100, 123456));
    }
}