package org.mongobaba.refactory.chapter10;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mongobaba.refactory.chapter10.Chapter10_13.*;

class Chapter10_13Test {
    private Site site;

    @BeforeEach
    void initSite() {
        site = new Site();
        site.addReading(new Reading("Refactoring"));
    }

    @Test
    void getName() {
        assertEquals("Refactoring", getSiteLastReadingName(site));
    }
}