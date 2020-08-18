package org.mongobaba.refactory.chapter7;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mongobaba.refactory.chapter7.Chapter7_6.*;

class Chapter7_6Test {
    private Person developer = new Person();
    private Person manager = new Person();

    @BeforeEach
    void init() {
        Department department = new Department(manager);
        developer.setDepartment(department);
        manager.setDepartment(department);
    }

    @Test
    void getManagerOf() {
        assertSame(manager, Chapter7_6.getManagerOf(developer));
    }
}