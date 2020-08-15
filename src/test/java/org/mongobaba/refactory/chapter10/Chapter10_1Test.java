package org.mongobaba.refactory.chapter10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mongobaba.refactory.chapter10.Chapter10_1.*;

class Chapter10_1Test {
    @Test
    void displayPersonInfo() {
        Person person = new Person("John", 100, 123456);
        String expected = "Name: John\nTelephone: (100)123456";
        assertEquals(expected, Chapter10_1.displayPersonInfo(person));
    }
}