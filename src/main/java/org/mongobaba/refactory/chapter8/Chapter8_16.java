package org.mongobaba.refactory.chapter8;

/**
 * Replace Subclass with Fields
 * 以字段取代子类
 */
public class Chapter8_16 {
    // TODO 删除子类Male和Female
    static abstract class Person {
        abstract boolean isMale();
        abstract char getCode();
    }

    static class Male extends Person {
        @Override
        boolean isMale() {
            return true;
        }

        @Override
        char getCode() {
            return 'M';
        }
    }

    static class Female extends Person {
        @Override
        boolean isMale() {
            return false;
        }

        @Override
        char getCode() {
            return 'F';
        }
    }
}
