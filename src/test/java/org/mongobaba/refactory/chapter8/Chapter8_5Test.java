package org.mongobaba.refactory.chapter8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Chapter8_5Test {
    @Test
    void showRecord() {
        assertEquals("Liverpool wins 15", Chapter8_5.showRecord());
    }
}