package org.mongobaba.refactory.Chapter6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Chapter6_4Test {
    @Test
    void moreThan1000() {
        Chapter6_4 obj = new Chapter6_4(100, 20);
        assertEquals(1900.0, obj.getPrice(), 0.001);
    }

    @Test
    void lessThan1000() {
        Chapter6_4 obj = new Chapter6_4(40, 20);
        assertEquals(784.0, obj.getPrice(), 0.001);
    }
}