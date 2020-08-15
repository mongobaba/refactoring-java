package org.mongobaba.refactory.chapter10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mongobaba.refactory.chapter10.Chapter10_5.*;

class Chapter10_5Test {
    @Test
    void salaryRaise() {
        Employee employee = new Employee(10.0);
        employee.tenPercentRaise();
        assertEquals(11.0, employee.getSalary(), 0.01);
        employee.fivePercentRaise();
        assertEquals(11.55, employee.getSalary(), 0.01);
    }

    @Test
    void baseCharge() {
        Charge charge = new Charge();
        Dollars dollars = charge.baseCharge();
        assertEquals(15.0, dollars.getAmount(), 0.01);
    }
}