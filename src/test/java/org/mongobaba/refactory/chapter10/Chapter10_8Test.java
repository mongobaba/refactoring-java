package org.mongobaba.refactory.chapter10;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Chapter10_8Test {
    private Chapter10_8 obj;

    @BeforeEach
    void initObj() {
        obj = new Chapter10_8();
        obj.setItemPrice(1);
    }

    @Test
    void discountLevel1() {
        obj.setQuantity(50);
        assertEquals(2.5, obj.getPrice(), 0.001);
    }

    @Test
    void discountLevel2() {
        obj.setQuantity(120);
        assertEquals(12.0, obj.getPrice(), 0.001);
    }
}