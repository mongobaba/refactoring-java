package org.mongobaba.refactory.chapter9;

/**
 * Replace Conditional with Polymorphism
 * 以多态取代条件表达式
 */
public class Chapter9_6 {
    // TODO 基于EmployeeType建立继承体系
    enum EmployeeType {
        ENGINEER,
        SALESMAN,
        MANAGER
    }

    static class Employee {
        EmployeeType _type;
        private int _monthlySalary = 100;
        private int _commission = 20;
        private int _bonus = 30;

        public Employee(EmployeeType type) {
            this._type = type;
        }

        EmployeeType getType() {
            return _type;
        }

        // TODO 将此方法转移到EmployeeType继承体系中
        int getPayment() {
            switch (getType()) {
                case ENGINEER:
                    return _monthlySalary;
                case SALESMAN:
                    return _monthlySalary + _commission;
                case MANAGER:
                    return _monthlySalary + _bonus;
                default:
                    throw new RuntimeException("Incorrect Employee");
            }
        }
    }
}
