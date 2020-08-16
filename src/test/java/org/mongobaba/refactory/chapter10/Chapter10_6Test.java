package org.mongobaba.refactory.chapter10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mongobaba.refactory.chapter10.Chapter10_6.*;

class Chapter10_6Test {
    @Test
    void getHeight() {
        Rectangle rectangle = new Rectangle();
        rectangle.setValue("height", 10);
        assertEquals(10, rectangle.getHeight());
    }

    @Test
    void getWidth() {
        Rectangle rectangle = new Rectangle();
        rectangle.setValue("width", 10);
        assertEquals(10, rectangle.getWidth());
    }

    @Test
    void engineer() {
        Employee employee = EmployeeFactory.create(EmployeeFactory.ENGINEER);
        assertEquals("Engineer{}", employee.toString());
    }

    @Test
    void salesman() {
        Employee employee = EmployeeFactory.create(EmployeeFactory.SALESMAN);
        assertEquals("Salesman{}", employee.toString());
    }

    @Test
    void manager() {
        Employee employee = EmployeeFactory.create(EmployeeFactory.MANAGER);
        assertEquals("Manager{}", employee.toString());
    }
}