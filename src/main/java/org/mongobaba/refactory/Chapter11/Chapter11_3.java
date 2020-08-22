package org.mongobaba.refactory.Chapter11;

/**
 * Pull Up Constructor Body
 * 构造函数本体上移
 */
public class Chapter11_3 {
    static class Employee {
        protected String _name;
        protected int _id;

        public String getName() {
            return _name;
        }

        public int getId() {
            return _id;
        }

        boolean isPrivileged() {
            return false;
        }

        void assignCar() {
            System.out.print("assign car");
        }
    }

    static class Manager extends Employee {
        private int _grade;

        // TODO 将_grade赋值前后的部分都提取到Employee中
        Manager(String name, int id, int grade) {
            _name = name;
            _id  = id;
            _grade = grade;
            if (isPrivileged()) {
                assignCar();
            }
        }

        @Override
        boolean isPrivileged() {
            return _grade > 4;
        }
    }
}
