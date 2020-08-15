package org.mongobaba.refactory.chapter9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mongobaba.refactory.chapter9.Chapter9_5.*;

class Chapter9_5Test {
    private Employee obj;

    @Test
    void dead() {
        obj = new Employee(true, false, false);
        assertEquals(100.0, obj.getPayment(), 0.1);
    }

    @Test
    void separated() {
        obj = new Employee(false, true, false);
        assertEquals(50.0, obj.getPayment(), 0.1);
    }

    @Test
    void retired() {
        obj = new Employee(false, false, true);
        assertEquals(70.0, obj.getPayment(), 0.1);
    }

    @Test
    void normal() {
        obj = new Employee(false, false, false);
        assertEquals(40.0, obj.getPayment(), 0.1);
    }

    @Test
    void capital() {
        Capital capital = new Capital();
        assertEquals(5.0, capital.getAdjustedCapital(), 0.001);
    }
}