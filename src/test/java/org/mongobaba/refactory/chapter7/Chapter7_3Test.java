package org.mongobaba.refactory.chapter7;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mongobaba.refactory.chapter7.Chapter7_3.*;

class Chapter7_3Test {
    private Person person;

    @BeforeEach
    void initPerson() {
        person = new Person("John", "100", "123456");
    }

    @Test
    void telephoneNumber() {
        assertEquals("(100) 123456", person.getTelephoneNumber());
    }

    @Test
    void officeAreaCode() {
        assertEquals("100", person.getOfficeAreaCode());
        person.setOfficeAreaCode("200");
        assertEquals("200", person.getOfficeAreaCode());
    }

    @Test
    void officeNumber() {
        assertEquals("123456", person.getOfficeNumber());
        person.setOfficeNumber("654321");
        assertEquals("654321", person.getOfficeNumber());
    }
}