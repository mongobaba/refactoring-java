package org.mongobaba.refactory.Chapter6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Chapter6_9Test {
    @Test
    void foundPerson() {
        assertEquals("Kent", Chapter6_9.foundPerson(new String[]{ "Dale", "Kent" }));
    }

    @Test
    void notFound() {
        assertEquals("", Chapter6_9.foundPerson(new String[]{ "Dale", "Kali" }));
    }
}