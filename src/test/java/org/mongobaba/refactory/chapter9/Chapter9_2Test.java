package org.mongobaba.refactory.chapter9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mongobaba.refactory.chapter9.Chapter9_2.*;

class Chapter9_2Test {
    @Test
    void logicOrEligible() {
        LogicOr obj = new LogicOr(3, 5, false);
        assertEquals(3.0, obj.disabilityAmount(), 0.001);
    }

    @Test
    void logicOrNotEligible() {
        LogicOr obj = new LogicOr(3, 13, true);
        assertEquals(0.0, obj.disabilityAmount(), 0.001);
    }

    @Test
    void logicAnd() {
        LogicAnd obj = new LogicAnd();
        assertEquals(1.0, obj.calculate(), 0.001);
    }
}