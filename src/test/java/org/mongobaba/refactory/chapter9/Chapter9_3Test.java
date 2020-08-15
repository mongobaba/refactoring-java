package org.mongobaba.refactory.chapter9;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Chapter9_3Test {
    private Chapter9_3 obj;
    private ByteArrayOutputStream stream;
    private PrintStream backup;

    @BeforeEach
    void setup() {
        backup = System.out;
        stream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(stream));
    }

    @AfterEach
    void teardown() {
        System.setOut(backup);
    }

    @Test
    void specialDeal() {
        obj = new Chapter9_3(true);
        assertEquals(9.5, obj.calculateDeal(10.0), 0.01);
        assertEquals("send", stream.toString());
    }

    @Test
    void notSpecialDeal() {
        obj = new Chapter9_3(false);
        assertEquals(9.8, obj.calculateDeal(10.0), 0.01);
        assertEquals("send", stream.toString());
    }
}