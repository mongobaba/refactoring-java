package org.mongobaba.refactory.chapter9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mongobaba.refactory.chapter9.Chapter9_6.*;

class Chapter9_6Test {
    private Employee employee;

    @Test
    void engineer() {
        employee = new Employee(EmployeeType.ENGINEER);
        assertEquals(100, employee.getPayment());
    }

    @Test
    void salesman() {
        employee = new Employee(EmployeeType.SALESMAN);
        assertEquals(120, employee.getPayment());
    }

    @Test
    void manager() {
        employee = new Employee(EmployeeType.MANAGER);
        assertEquals(130, employee.getPayment());
    }
}