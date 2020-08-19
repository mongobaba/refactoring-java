package org.mongobaba.refactory.chapter8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mongobaba.refactory.chapter8.Chapter8_14.*;

class Chapter8_14Test {
    @Test
    void engineer() {
        Employee employee = new Employee(Employee.ENGINEER);
        assertEquals("Employee:Engineer", employee.toString());
    }

    @Test
    void salesman() {
        Employee employee = new Employee(Employee.SALESMAN);
        assertEquals("Employee:Salesman", employee.toString());
    }

    @Test
    void manager() {
        Employee employee = new Employee(Employee.MANAGER);
        assertEquals("Employee:Manager", employee.toString());
    }
}