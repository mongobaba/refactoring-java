package org.mongobaba.refactory.Chapter11;

import java.util.Vector;

/**
 * Replace Inheritance with Delegation
 * 以委托取代继承
 */
public class Chapter11_11 {
    static class MyStack<T> extends Vector<T> {
        public void push(T element) {
            insertElementAt(element, 0);
        }

        public T pop() {
            T result = firstElement();
            removeElementAt(0);
            return result;
        }
    }
}
