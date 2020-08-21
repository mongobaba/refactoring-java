package org.mongobaba.refactory.Chapter11;

import org.junit.jupiter.api.Test;
import org.mongobaba.refactory.Chapter11.Chapter11_11.MyStack;

import static org.junit.jupiter.api.Assertions.*;

class Chapter11_11Test {
    @Test
    void myStack() {
        MyStack<Integer> stack = new Chapter11_11.MyStack<>();
        assertTrue(stack.isEmpty());
        assertEquals(0, stack.size());
        stack.push(1);
        stack.push(2);
        assertEquals(2, stack.size());
        assertFalse(stack.isEmpty());
        assertEquals(2, stack.pop());
        assertEquals(1, stack.pop());
    }
}