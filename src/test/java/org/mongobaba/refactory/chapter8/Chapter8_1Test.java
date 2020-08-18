package org.mongobaba.refactory.chapter8;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.mongobaba.refactory.chapter8.Chapter8_1.CappedRange;
import static org.mongobaba.refactory.chapter8.Chapter8_1.IntRange;

class Chapter8_1Test {
    private IntRange intRange;
    private CappedRange cappedRange;

    @BeforeEach
    void initRange() {
        intRange = new IntRange(10, 20);
        cappedRange = new CappedRange(10, 20, 30);
    }

    @Test
    void intRangeIncludes() {
        Stream.of(9, 21).forEach(i -> assertFalse(intRange.includes(i)));
        Stream.of(10, 12, 20).forEach(i -> assertTrue(intRange.includes(i)));
    }

    @Test
    void intRangeGrow() {
        intRange.grow(2);
        Stream.of(9, 41).forEach(i -> assertFalse(intRange.includes(i)));
        Stream.of(10, 30, 40).forEach(i -> assertTrue(intRange.includes(i)));
    }

    @Test
    void cappedRangeIncludes() {
        Stream.of(9, 21).forEach(i -> assertFalse(cappedRange.includes(i)));
        Stream.of(10, 12, 20).forEach(i -> assertTrue(cappedRange.includes(i)));
    }

    @Test
    void cappedRangeGrow() {
        cappedRange.grow(2);
        Stream.of(9, 31).forEach(i -> assertFalse(cappedRange.includes(i)));
        Stream.of(10, 20, 30).forEach(i -> assertTrue(cappedRange.includes(i)));
    }

    @Test
    void growDontChangeCap() {
        int cap = cappedRange.getCap();
        cappedRange.grow(2);
        assertEquals(cap, cappedRange.getCap());
    }
}