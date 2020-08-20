package org.mongobaba.refactory.Chapter11;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mongobaba.refactory.Chapter11.Chapter11_6.*;

class Chapter11_6Test {
    @Test
    void isLabor() {
        JobItem jobItem = new JobItem(5, 10, true, new Employee(6));
        assertEquals(60, jobItem.getTotalPrice());
    }

    @Test
    void notLabor() {
        JobItem jobItem = new JobItem(5, 10, false, new Employee(6));
        assertEquals(50, jobItem.getTotalPrice());
    }
}