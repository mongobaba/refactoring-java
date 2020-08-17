package org.mongobaba.refactory.Chapter6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Chapter6_6Test {
    private Chapter6_6 obj;

    @BeforeEach
    void initObj() {
        obj = new Chapter6_6(10.0, 20.0, 1.0, 5);
    }

    @Test
    void timeGreaterThanDelay() {
        assertEquals(285.0, obj.getDistanceTravelled(7), 0.001);
    }

    @Test
    void timeLessThanDelay() {
        assertEquals(45.0, obj.getDistanceTravelled(3), 0.001);
    }
}