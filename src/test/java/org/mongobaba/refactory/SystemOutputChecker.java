package org.mongobaba.refactory;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class SystemOutputChecker {
    private ByteArrayOutputStream stream;
    private PrintStream backup;

    @BeforeEach
    public void setup() {
        backup = System.out;
        stream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(stream));
    }

    @AfterEach
    public void teardown() {
        System.setOut(backup);
    }

    protected String getOutputString() {
        return stream.toString();
    }
}