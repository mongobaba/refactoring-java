package org.mongobaba.refactory.chapter8;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
import static org.mongobaba.refactory.chapter8.Chapter8_11.*;

class Chapter8_11Test {
    @Test
    void kentCourses() {
        Person kent = kent();
        assertEquals(3, kent.getCourses().size());
    }

    @Test
    void numberOfAdvancedCourses() {
        Set<Object> s = new HashSet<>();
        s.add(new Course("Smalltalk Programming", false));
        s.add(new Course("Appreciating Single Malts", true));
        Person kent = new Person();
        kent.setCourses(s);
        assertEquals(1, Chapter8_11.numberOfAdvancedCourses(kent));
    }
}