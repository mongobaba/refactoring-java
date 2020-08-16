package org.mongobaba.refactory.chapter10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Chapter10_11Test {
    @Test
    void publicMethod() {
        assertEquals(-1, new Chapter10_11().publicMethod());
    }
}