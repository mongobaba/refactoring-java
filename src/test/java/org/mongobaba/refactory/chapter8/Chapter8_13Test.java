package org.mongobaba.refactory.chapter8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mongobaba.refactory.chapter8.Chapter8_13.*;

class Chapter8_13Test {
    // TODO 此项重构需要改动以下对象创建部分的代码
    private Person o = new Person(Person.O);
    private Person a = new Person(Person.A);
    private Person b = new Person(Person.B);
    private Person ab = new Person(Person.AB);

    @Test
    void equals() {
        assertEquals(o.getBloodGroup(), o.getBloodGroup());
        assertEquals(a.getBloodGroup(), a.getBloodGroup());
        assertEquals(b.getBloodGroup(), b.getBloodGroup());
        assertEquals(ab.getBloodGroup(), ab.getBloodGroup());
    }

    @Test
    void notEquals() {
        assertNotEquals(o.getBloodGroup(), a.getBloodGroup());
        assertNotEquals(o.getBloodGroup(), b.getBloodGroup());
        assertNotEquals(o.getBloodGroup(), ab.getBloodGroup());
        assertNotEquals(a.getBloodGroup(), b.getBloodGroup());
        assertNotEquals(a.getBloodGroup(), ab.getBloodGroup());
        assertNotEquals(b.getBloodGroup(), ab.getBloodGroup());
    }
}