package org.mongobaba.refactory.Chapter6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Chapter6_2Test {
    @Test
    void rating1() {
        Chapter6_2 obj = new Chapter6_2(1);
        assertEquals(1, obj.getRating());
    }

    @Test
    void rating2() {
        Chapter6_2 obj = new Chapter6_2(7);
        assertEquals(2, obj.getRating());
    }
}