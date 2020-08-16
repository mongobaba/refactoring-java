package org.mongobaba.refactory.chapter10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mongobaba.refactory.chapter10.Chapter10_15.*;

class Chapter10_15Test {
    @Test
    void pool() {
        ResourcePool pool = new ResourcePool();
        Resource resource = pool.getResource();
        assertEquals("Resource{}", resource.toString());
    }
}