package org.mongobaba.refactory.chapter7;

import org.junit.jupiter.api.Test;
import org.mongobaba.refactory.DateUtil;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class Chapter7_7Test {
    @Test
    void printNextDate() {
        Date date = DateUtil.at(2020, 8, 1);
        assertEquals(1596297600000L, Chapter7_7.getNewStartTimestamp(date));
    }
}