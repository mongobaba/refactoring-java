package org.mongobaba.refactory.chapter9;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mongobaba.refactory.SystemOutputChecker;

import static org.junit.jupiter.api.Assertions.*;

class Chapter9_4Test extends SystemOutputChecker {
    private static final String[] AlertPeople = new String[]{"Lacey", "Don", "Gail"};
    private static final String[] NoAlertPeople = new String[]{"Lacey", "Dan", "Gail"};
    private Chapter9_4 obj;

    @BeforeEach
    void initObj() {
        obj = new Chapter9_4();
    }

    @Test
    void checkSecurityAlert() {
        obj.checkSecurity(AlertPeople);
        assertEquals("alert", getOutputString());
    }

    @Test
    void checkSecurityNoAlert() {
        obj.checkSecurity(NoAlertPeople);
        assertEquals("", getOutputString());
    }

    @Test
    void checkSecurityAndUseAlert() {
        obj.checkSecurityAndUse(AlertPeople);
        assertEquals("alert", getOutputString());
    }

    @Test
    void checkSecurityAndUseNoAlert() {
        obj.checkSecurityAndUse(NoAlertPeople);
        assertEquals("", getOutputString());
    }
}