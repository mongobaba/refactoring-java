package org.mongobaba.refactory.chapter10;

/**
 * Replace Constructor with Factory Method
 * 以工厂函数取代构造函数
 */
public class Chapter10_12 {
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
            return "Employee{" +
                    "type=" + _type +
                    '}';
        }
    }

    static String showEngineer() {
        Employee employee = new Employee(Employee.ENGINEER);
        return employee.toString();
    }

    static class Person {}

    static class Male extends Person {
        @Override
        public String toString() {
            return "Male{}";
        }
    }

    static class Female extends Person {
        @Override
        public String toString() {
            return "Female{}";
        }
    }

    static String showMale() {
        return new Male().toString();
    }

    static String showFemale() {
        return new Female().toString();
    }
}
