package org.mongobaba.refactory.chapter7;

/**
 * Inner Class
 * 将类内联化
 */
public class Chapter7_4 {
    static class Person {
        private String _name;
        private TelephoneNumber _officeTelephone = new TelephoneNumber();

        public Person(String name) {
            this._name = name;
        }

        public String getName() {
            return _name;
        }

        public String getTelephoneNumber() {
            return _officeTelephone.getTelephoneNumber();
        }

        public TelephoneNumber getOfficeTelephone() {
            return _officeTelephone;
        }
    }

    // TODO 将该类塞到Person中去
    static class TelephoneNumber {
        private String _areaCode;
        private String _number;

        public String getTelephoneNumber() {
            return "(" + _areaCode + ") " + _number;
        }

        public String getAreaCode() {
            return _areaCode;
        }

        public void setAreaCode(String arg) {
            this._areaCode = arg;
        }

        public String getNumber() {
            return _number;
        }

        public void setNumber(String arg) {
            this._number = arg;
        }
    }

    static String getInfo() {
        Person martin = new Person("Martin");
        martin.getOfficeTelephone().setAreaCode("100");
        martin.getOfficeTelephone().setNumber("123456");
        return martin.getName() + " " + martin.getTelephoneNumber();
    }
}
