package org.mongobaba.refactory.chapter8;

/**
 * Replace Type Code with Subclasses
 * 以子类取代类型码
 */
public class Chapter8_14 {
    static class Employee {
        private int _type;
        static final int ENGINEER = 0;
        static final int SALESMAN = 1;
        static final int MANAGER = 2;

        Employee(int type) {
            _type = type;
        }

        @Override
        public String toString() {
            switch (_type) {
                case ENGINEER:
                    return "Employee:Engineer";
                case SALESMAN:
                    return "Employee:Salesman";
                case MANAGER:
                    return "Employee:Manager";
                default:
                    throw new RuntimeException("invalid type");
            }
        }
    }
}
