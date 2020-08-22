package org.mongobaba.refactory.chapter7;

/**
 * Extract Class
 * 提炼新类
 */
public class Chapter7_3 {
    static class Person {
        private String _name;

        // TODO 将这两个字段提取到单独的类中
        private String _officeAreaCode;
        private String _officeNumber;

        public Person(String name, String officeAreaCode, String officeNumber) {
            this._name = name;
            this._officeAreaCode = officeAreaCode;
            this._officeNumber = officeNumber;
        }

        public String getName() {
            return _name;
        }

        public String getTelephoneNumber() {
            return "(" + _officeAreaCode + ") " + _officeNumber;
        }

        public String getOfficeAreaCode() {
            return _officeAreaCode;
        }

        public void setOfficeAreaCode(String arg) {
            this._officeAreaCode = arg;
        }

        public String getOfficeNumber() {
            return _officeNumber;
        }

        public void setOfficeNumber(String arg) {
            this._officeNumber = arg;
        }
    }
}
