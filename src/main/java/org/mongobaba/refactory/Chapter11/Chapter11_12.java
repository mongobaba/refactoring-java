package org.mongobaba.refactory.Chapter11;

/**
 * Replace Delegation with Inheritance
 * 以继承取代委托
 */
public class Chapter11_12 {
    static class Person {
        private String _name;

        public String getName() {
            return _name;
        }

        public void setName(String arg) {
            this._name = arg;
        }

        public String getLastName() {
            return _name.substring(_name.lastIndexOf(' ') + 1);
        }
    }

    // TODO 让Employee直接继承Person
    static class Employee {
        private Person _person = new Person();

        public String getName() {
            return _person.getName();
        }

        public void setName(String arg) {
            _person.setName(arg);
        }

        @Override
        public String toString() {
            return "Emp:" + _person.getLastName();
        }
    }
}
