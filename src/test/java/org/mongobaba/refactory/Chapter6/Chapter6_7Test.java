package org.mongobaba.refactory.Chapter6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mongobaba.refactory.Chapter6.Chapter6_7.discount;

class Chapter6_7Test {
    @Test
    void noDiscount() {
        assertEquals(10, discount(10, 10, 10));
    }

    @Test
    void inputValDiscount() {
        assertEquals(58, discount(60, 10, 10));
    }

    @Test
    void quantityDiscount() {
        assertEquals(9, discount(10, 150, 10));
    }

    @Test
    void yearToDateDiscount() {
        assertEquals(6, discount(10, 10, 11000));
    }
}