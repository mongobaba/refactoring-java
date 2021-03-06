package org.mongobaba.refactory.chapter7;

/**
 * Remove Middle Man
 * 移除中间人
 */
public class Chapter7_6 {
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

        public Person getManager() {
            return _department.getManager();
        }

        public void setDepartment(Department department) {
            this._department = department;
        }
    }

    // TODO 移除Person中的委托，直接让调用端使用Department类和相关方法
    static Person getManagerOf(Person person) {
        return person.getManager();
    }
}
