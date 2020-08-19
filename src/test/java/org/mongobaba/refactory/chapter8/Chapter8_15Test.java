package org.mongobaba.refactory.chapter8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mongobaba.refactory.chapter8.Chapter8_15.*;

class Chapter8_15Test {
    @Test
    void engineer() {
        Employee employee = new Employee(Employee.ENGINEER);
        assertEquals(30, employee.payment());
    }

    @Test
    void salesman() {
        Employee employee = new Employee(Employee.SALESMAN);
        assertEquals(50, employee.payment());
    }

    @Test
    void manager() {
        Employee employee = new Employee(Employee.MANAGER);
        assertEquals(70, employee.payment());
    }

    @Test
    void changeType() {
        Employee employee = new Employee(Employee.ENGINEER);
        employee.setType(Employee.MANAGER);
        assertEquals(70, employee.payment());
    }
}