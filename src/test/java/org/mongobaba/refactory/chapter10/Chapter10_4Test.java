package org.mongobaba.refactory.chapter10;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mongobaba.refactory.SystemOutputChecker;

import static org.junit.jupiter.api.Assertions.*;

class Chapter10_4Test extends SystemOutputChecker {
    private static final String[] AlertPeople = new String[]{"Lacey", "Don", "Gail"};
    private static final String[] NoAlertPeople = new String[]{"Lacey", "Dan", "Gail"};
    private Chapter10_4 obj;

    @BeforeEach
    void initObj() {
        obj = new Chapter10_4();
    }

    @Test
    void findSomeone() {
        obj.checkSecurity(AlertPeople);
        assertEquals("alert", getOutputString());
    }

    @Test
    void findNone() {
        obj.checkSecurity(NoAlertPeople);
        assertEquals("", getOutputString());
    }
}