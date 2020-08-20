package org.mongobaba.refactory.Chapter11;

/**
 * Extract Interface
 * 提炼接口
 */
public class Chapter11_8 {
    static class Employee {
        private int _rate;
        private boolean _hasSpecialSkill;

        public Employee(int rate) {
            this._rate = rate;
        }

        public void setSpecialSkill(boolean arg) {
            this._hasSpecialSkill = arg;
        }

        public int getRate() {
            return _rate;
        }

        public boolean hasSpecialSkill() {
            return _hasSpecialSkill;
        }
    }

    static class TimeSheet {
        double charge(Employee employee, int days) {
            int base = employee.getRate() * days;
            if (employee.hasSpecialSkill()) {
                return base * 1.05;
            } else {
                return base;
            }
        }
    }
}
