package org.mongobaba.refactory.chapter8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Chapter8_16Test {
    @Test
    void male() {
        Chapter8_16.Male male = new Chapter8_16.Male();
        assertTrue(male.isMale());
        assertEquals('M', male.getCode());
    }

    @Test
    void female() {
        Chapter8_16.Female female = new Chapter8_16.Female();
        assertFalse(female.isMale());
        assertEquals('F', female.getCode());
    }
}