package org.mongobaba.refactory.chapter7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Chapter7_8Test {
    @Test
    void getNewStartTimestamp() {
        assertEquals(1596384000000L, Chapter7_8.getNewStartTimestamp(1596297600000L));
    }
}