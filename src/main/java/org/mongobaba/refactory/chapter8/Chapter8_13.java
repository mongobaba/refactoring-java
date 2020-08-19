package org.mongobaba.refactory.chapter8;

/**
 * Replace Type Code with Class
 * 以类取代类型码
 */
public class Chapter8_13 {
    static class Person {
        public static final int O = 0;
        public static final int A = 1;
        public static final int B = 2;
        public static final int AB = 3;

        private int _bloodGroup;

        public Person(int bloodGroup) {
            this._bloodGroup = bloodGroup;
        }

        public int getBloodGroup() {
            return _bloodGroup;
        }

        public void setBloodGroup(int arg) {
            this._bloodGroup = arg;
        }
    }
}
