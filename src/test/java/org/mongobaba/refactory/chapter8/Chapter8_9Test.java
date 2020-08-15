package org.mongobaba.refactory.chapter8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Chapter8_9Test {
    @Test
    void potentialEnergy() {
        Chapter8_9 obj = new Chapter8_9();
        assertEquals(29.43, obj.potentialEnergy(1.0, 3.0), 0.001);
    }
}