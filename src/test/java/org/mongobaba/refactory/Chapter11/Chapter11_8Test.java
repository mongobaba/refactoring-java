package org.mongobaba.refactory.Chapter11;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mongobaba.refactory.Chapter11.Chapter11_8.Employee;
import static org.mongobaba.refactory.Chapter11.Chapter11_8.TimeSheet;

class Chapter11_8Test {
    private TimeSheet timeSheet = new TimeSheet();
    private Employee employee = new Employee(100);

    @Test
    void hasSpecialSkill() {
        employee.setSpecialSkill(true);
        assertEquals(2100.0, timeSheet.charge(employee, 20), 0.001);
    }

    @Test
    void hasNoSpecialSkill() {
        employee.setSpecialSkill(false);
        assertEquals(2000.0, timeSheet.charge(employee, 20), 0.001);
    }
}