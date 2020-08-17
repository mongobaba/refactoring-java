package org.mongobaba.refactory.Chapter6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mongobaba.refactory.Chapter6.Chapter6_3.*;

class Chapter6_3Test {
    @Test
    void tooExpensive() {
        assertFalse(Chapter6_3.tooExpensive(new Order(500.0)));
        assertTrue(Chapter6_3.tooExpensive(new Order(1500.0)));
    }
}