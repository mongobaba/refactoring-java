package org.mongobaba.refactory.chapter10;

import java.util.ArrayDeque;
import java.util.EmptyStackException;
import java.util.Stack;

/**
 * Replace Exception with Test
 * 以测试取代异常
 */
public class Chapter10_15 {
    static class Resource {
        @Override
        public String toString() {
            return "Resource{}";
        }
    }

    static class ResourcePool {
        private Stack<Object> _available = new Stack<>();
        private Stack<Object> _allocated = new Stack<>();

        Resource getResource() {
            Resource result;
            try {
                result = (Resource) _available.pop();
                _allocated.push(result);
                return result;
            } catch (EmptyStackException e) {
                result = new Resource();
                _allocated.push(result);
                return result;
            }
        }
    }
}
