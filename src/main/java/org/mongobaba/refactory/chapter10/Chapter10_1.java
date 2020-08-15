package org.mongobaba.refactory.chapter10;

/**
 * Rename Method
 * 函数改名
 */
public class Chapter10_1 {
    static class Person {
        private String _name;
        private int _officeAreaCode;
        private int _officeNumber;

        public Person(String name, int officeAreaCode, int officeNumber) {
            this._name = name;
            this._officeAreaCode = officeAreaCode;
            this._officeNumber = officeNumber;
        }

        public String getName() {
            return _name;
        }

        public String getTelephoneNumber() {
            return "(" + _officeAreaCode + ")" + _officeNumber;
        }
    }

    static String displayPersonInfo(Person person) {
        return "Name: " + person.getName() + "\nTelephone: " + person.getTelephoneNumber();
    }
}
