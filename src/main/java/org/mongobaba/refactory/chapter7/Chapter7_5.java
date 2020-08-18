package org.mongobaba.refactory.chapter7;

/**
 * Hide Delegate
 * 隐藏委托关系
 */
public class Chapter7_5 {
    static class Department {
        private Person _manager;

        public Department(Person manager) {
            this._manager = manager;
        }

        public Person getManager() {
            return _manager;
        }
    }

    static class Person {
        private Department _department;
        private String _name;

        public Person(String name) {
            this._name = name;
        }

        public Department getDepartment() {
            return _department;
        }

        public void setDepartment(Department arg) {
            this._department = arg;
        }

        public String getName() {
            return _name;
        }
    }

    static Person getManagerOf(Person person) {
        return person.getDepartment().getManager();
    }
}
