package org.mongobaba.refactory.chapter8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Chapter8_10Test {
    @Test
    void name() {
        Chapter8_10 obj = new Chapter8_10();
        obj._name = "Tim";
        assertEquals("Tim", obj._name);
    }
}