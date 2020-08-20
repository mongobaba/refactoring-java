package org.mongobaba.refactory.Chapter11;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mongobaba.refactory.Chapter11.Chapter11_1.*;

class Chapter11_1Test {
    @Test
    void salesman() {
        Salesman salesman = new Salesman("York");
        assertEquals("York selling", salesman.selling());
    }

    @Test
    void engineer() {
        Engineer engineer = new Engineer("Kent");
        assertEquals("Kent coding", engineer.coding());
    }
}