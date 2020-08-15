package org.mongobaba.refactory.chapter10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Chapter10_3Test {
    @Test
    void getTelephoneNumber() {
        String expected = "Telephone: 123456";
        assertEquals(expected, Chapter10_3.getTelephoneNumber(100, 123456));
    }
}