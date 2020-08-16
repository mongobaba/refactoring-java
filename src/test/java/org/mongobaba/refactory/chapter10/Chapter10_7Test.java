package org.mongobaba.refactory.chapter10;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mongobaba.refactory.chapter10.Chapter10_7.*;

class Chapter10_7Test {
    private Room room;
    private HeatingPlan plan;

    @BeforeEach
    void initRoom() {
        room = new Room();
        plan = new HeatingPlan();
    }

    @Test
    void withinRange() {
        room.setTempRange(new TempRange(20, 25));
        plan.setRange(new TempRange(10, 30));
        assertTrue(room.withinPlan(plan));
    }

    @Test
    void notWithinRange() {
        room.setTempRange(new TempRange(10, 25));
        plan.setRange(new TempRange(20, 30));
        assertFalse(room.withinPlan(plan));
    }
}