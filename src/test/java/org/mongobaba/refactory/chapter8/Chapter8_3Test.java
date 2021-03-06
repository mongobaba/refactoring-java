package org.mongobaba.refactory.chapter8;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mongobaba.refactory.chapter8.Chapter8_3.Order;

class Chapter8_3Test {
    @Test
    void numberOfOrdersFor() {
        ArrayList<Object> collection = new ArrayList<>();
        collection.add(new Order("Don"));
        collection.add(new Order("John"));
        collection.add(new Order("Don"));
        assertEquals(2, Chapter8_3.numberOfOrdersFor(collection, "Don"));
    }
}