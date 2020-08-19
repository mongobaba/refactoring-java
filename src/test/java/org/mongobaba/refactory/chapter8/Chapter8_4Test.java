package org.mongobaba.refactory.chapter8;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mongobaba.refactory.chapter8.Chapter8_4.*;

class Chapter8_4Test {
    @Disabled
    @Test
    void currencyEquals() {
        Currency c1 = new Currency("USD");
        Currency c2 = new Currency("USD");
        assertEquals(c1, c2);
        assertEquals(c1.hashCode(), c2.hashCode());
    }
}