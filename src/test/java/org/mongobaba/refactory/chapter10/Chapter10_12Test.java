package org.mongobaba.refactory.chapter10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Chapter10_12Test {
    @Test
    void showEngineer() {
        assertEquals("Employee{type=0}", Chapter10_12.showEngineer());
    }

    @Test
    void showMale() {
        assertEquals("Male{}", Chapter10_12.showMale());
    }

    @Test
    void showFemale() {
        assertEquals("Female{}", Chapter10_12.showFemale());
    }
}