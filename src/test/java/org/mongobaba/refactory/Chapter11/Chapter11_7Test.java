package org.mongobaba.refactory.Chapter11;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mongobaba.refactory.Chapter11.Chapter11_7.*;

class Chapter11_7Test {
    private Employee Don = new Employee("Don", "E100", 1000);
    private Employee Kent = new Employee("Kent", "E101", 1200);

    @Test
    void employee() {
        assertEquals(1000, Don.getAnnualCost());
    }

    @Test
    void department() {
        Department department = new Department("Software");
        department.addStaff(Don);
        department.addStaff(Kent);
        assertEquals(2200, department.getTotalAnnualCost());
    }
}