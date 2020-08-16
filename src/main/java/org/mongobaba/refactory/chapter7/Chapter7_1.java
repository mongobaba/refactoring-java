package org.mongobaba.refactory.chapter7;

/**
 * Move Method
 * 搬移函数
 */
public class Chapter7_1 {
    static class AccountType {
        private boolean premium;

        public AccountType(boolean premium) {
            this.premium = premium;
        }

        public boolean isPremium() {
            return premium;
        }
    }

    static class Account {
        private AccountType _type;
        private int _daysOverdrawn;

        public Account(AccountType type, int daysOverdrawn) {
            this._type = type;
            this._daysOverdrawn = daysOverdrawn;
        }

        public int getDaysOverdrawn() {
            return _daysOverdrawn;
        }

        double overdraftCharge() {
            if (_type.isPremium()) {
                double result = 10;
                if (_daysOverdrawn > 7) {
                    result += (_daysOverdrawn - 7) * 0.85;
                }
                return result;
            } else {
                return _daysOverdrawn * 1.75;
            }
        }

        double bankCharge() {
            double result = 4.5;
            if (_daysOverdrawn > 0) {
                result += overdraftCharge();
            }
            return result;
        }

        double overdraftCharge2() {
            if (_type.isPremium()) {
                double result = 10;
                if (getDaysOverdrawn() > 7) {
                    result += (getDaysOverdrawn() - 7) * 0.85;
                }
                return result;
            } else {
                return getDaysOverdrawn() * 1.75;
            }
        }

        double bankCharge2() {
            double result = 4.5;
            if (getDaysOverdrawn() > 0) {
                result += overdraftCharge2();
            }
            return result;
        }
    }
}
