package org.mongobaba.refactory.chapter9;

import org.junit.jupiter.api.Test;
import org.mongobaba.refactory.SystemOutputChecker;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Chapter9_3Test extends SystemOutputChecker {
    private Chapter9_3 obj;

    @Test
    void specialDeal() {
        obj = new Chapter9_3(true);
        assertEquals(9.5, obj.calculateDeal(10.0), 0.01);
        assertEquals("send", getOutputString());
    }

    @Test
    void notSpecialDeal() {
        obj = new Chapter9_3(false);
        assertEquals(9.8, obj.calculateDeal(10.0), 0.01);
        assertEquals("send", getOutputString());
    }
}