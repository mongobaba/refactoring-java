package org.mongobaba.refactory.chapter9;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mongobaba.refactory.chapter9.Chapter9_9.*;

class Chapter9_9Test {
    private Employee employee;

    @BeforeEach
    void initEmployee() {
        employee = new Employee();
    }

    @Test
    void hasExpenseLimit() {
        employee.setExpenseLimit(20.0);
        assertTrue(employee.withinLimit(10.0));
        assertFalse(employee.withinLimit(25.0));
    }

    @Test
    void hasPrimaryProject() {
        employee.setPrimaryProject(new Project());
        assertTrue(employee.withinLimit(8.0));
        assertFalse(employee.withinLimit(13.0));
    }
}