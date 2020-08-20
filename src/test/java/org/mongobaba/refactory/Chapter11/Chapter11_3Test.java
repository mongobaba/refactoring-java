package org.mongobaba.refactory.Chapter11;

import org.junit.jupiter.api.Test;
import org.mongobaba.refactory.SystemOutputChecker;

import static org.junit.jupiter.api.Assertions.*;
import static org.mongobaba.refactory.Chapter11.Chapter11_3.*;

class Chapter11_3Test extends SystemOutputChecker {
    @Test
    void privileged() {
        Manager manager = new Manager("Kent", 1001, 5);
        assertEquals("Kent", manager.getName());
        assertEquals(1001, manager.getId());
        assertEquals("assign car", getOutputString());
    }

    @Test
    void notPrivileged() {
        new Manager("Kent", 1001, 3);
        assertTrue(getOutputString().isEmpty());
    }
}