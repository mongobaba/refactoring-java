package org.mongobaba.refactory.chapter8;

/**
 * Replace Type Code with State/Strategy
 * 以State/Strategy取代类型码
 */
public class Chapter8_15 {
    // TODO 为不同职业建立不同的薪资计算策略类
    static class Employee {
        private int _type;
        static final int ENGINEER = 0;
        static final int SALESMAN = 1;
        static final int MANAGER = 2;

        private int _monthlySalary = 30;
        private int _commission = 20;
        private int _bonus = 40;

        Employee(int type) {
            _type = type;
        }

        public int getType() {
            return _type;
        }

        public void setType(int arg) {
            this._type = arg;
        }

        public int payment() {
            switch (_type) {
                case ENGINEER:
                    return _monthlySalary;
                case SALESMAN:
                    return _monthlySalary + _commission;
                case MANAGER:
                    return _monthlySalary + _bonus;
                default:
                    throw new RuntimeException("Incorrect Employee");
            }
        }
    }
}
