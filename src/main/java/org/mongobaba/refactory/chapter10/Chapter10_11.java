package org.mongobaba.refactory.chapter10;

/**
 * Hide Method
 * 隐藏函数
 */
public class Chapter10_11 {
    public int publicMethod() {
        return privateMethod();
    }

    public int privateMethod() {
        return -1;
    }
}
