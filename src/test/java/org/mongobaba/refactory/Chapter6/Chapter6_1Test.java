package org.mongobaba.refactory.Chapter6;

import org.junit.jupiter.api.Test;
import org.mongobaba.refactory.SystemOutputChecker;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mongobaba.refactory.Chapter6.Chapter6_1.*;

class Chapter6_1Test extends SystemOutputChecker {
    @Test
    void noLocalVariable() {
        Bill obj = new Bill("Tim");
        obj.addOrder(new Order(8.0));
        obj.addOrder(new Order(5.2));
        obj.printOwing(10.0);
        String expected =
                "*************************\r\n" +
                "***** Customer Owes *****\r\n" +
                "*************************\r\n" +
                "name: Tim\r\n" +
                "amount: 25.2\r\n";
        assertEquals(expected, getOutputString());
    }
}