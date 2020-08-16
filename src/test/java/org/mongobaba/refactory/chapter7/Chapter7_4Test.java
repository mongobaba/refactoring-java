package org.mongobaba.refactory.chapter7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Chapter7_4Test {
    @Test
    void getInfo() {
        assertEquals("Martin (100) 123456", Chapter7_4.getInfo());
    }
}