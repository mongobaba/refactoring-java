package org.mongobaba.refactory.Chapter11;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mongobaba.refactory.Chapter11.Chapter11_12.*;

class Chapter11_12Test {
    @Test
    void employee() {
        Employee employee = new Employee();
        employee.setName("Kent Beck");
        assertEquals("Kent Beck", employee.getName());
        assertEquals("Emp:Beck", employee.toString());
    }
}