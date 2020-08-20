package org.mongobaba.refactory.Chapter11;

/**
 * Pull Up Field
 * 字段上移
 */
public class Chapter11_1 {
    static class Employee {
    }

    static class Salesman extends Employee {
        private String _name;

        public Salesman(String name) {
            _name = name;
        }

        public String selling() {
            return _name + " selling";
        }
    }

    static class Engineer extends Employee {
        private String _name;

        public Engineer(String name) {
            _name = name;
        }

        public String coding() {
            return _name + " coding";
        }
    }
}
