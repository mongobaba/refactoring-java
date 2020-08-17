package org.mongobaba.refactory.Chapter6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Chapter6_5Test {
    @Test
    void price() {
        Chapter6_5 obj = new Chapter6_5(700, 20);
        assertEquals(13900.0, obj.price(), 0.001);
    }

    @Test
    void noDiscount() {
        Chapter6_5 obj = new Chapter6_5(300, 20);
        assertEquals(6100.0, obj.price(), 0.001);
    }

    @Test
    void shippingLessThan100() {
        Chapter6_5 obj = new Chapter6_5(300, 1);
        assertEquals(330.0, obj.price(), 0.001);
    }
}