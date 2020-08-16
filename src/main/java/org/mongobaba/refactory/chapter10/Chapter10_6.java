package org.mongobaba.refactory.chapter10;

/**
 * Replace Parameter with Explicit Methods
 * 以明确函数取代参数
 */
public class Chapter10_6 {
    static class Rectangle {
        static class Assert {
            static void shouldNeverReachHere() {
                throw new RuntimeException("Assert: should never reach here");
            }
        }

        private int _height;
        private int _width;

        void setValue(String name, int value) {
            if (name.equals("height")) {
                _height = value;
                return;
            }
            if (name.equals("width")) {
                _width = value;
                return;
            }
            Assert.shouldNeverReachHere();
        }

        public int getHeight() {
            return _height;
        }

        public int getWidth() {
            return _width;
        }
    }

    static class Employee {}

    static class Engineer extends Employee {
        @Override
        public String toString() {
            return "Engineer{}";
        }
    }

    static class Salesman extends Employee {
        @Override
        public String toString() {
            return "Salesman{}";
        }
    }

    static class Manager extends Employee {
        @Override
        public String toString() {
            return "Manager{}";
        }
    }

    static class EmployeeFactory {
        static final int ENGINEER = 0;
        static final int SALESMAN = 1;
        static final int MANAGER = 2;

        static Employee create(int type) {
            switch (type) {
                case ENGINEER:
                    return new Engineer();
                case SALESMAN:
                    return new Salesman();
                case MANAGER:
                    return new Manager();
                default:
                    throw new IllegalArgumentException("Incorrect type code value");
            }
        }
    }
}
