package org.mongobaba.refactory.Chapter11;

import java.util.Vector;

/**
 * Replace Inheritance with Delegation
 * 以委托取代继承
 */
public class Chapter11_11 {
    // TODO MyStack以委托方式使用Vector，并提供完整的Stack接口
    //      push/pop/size/isEmpty
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
