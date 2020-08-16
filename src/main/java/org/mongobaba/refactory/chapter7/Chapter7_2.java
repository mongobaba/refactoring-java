package org.mongobaba.refactory.chapter7;

/**
 * Move Field
 * 搬移字段
 */
public class Chapter7_2 {
    static class AccountType {}

    static class Account {
        private AccountType _type = new AccountType();
        private double _interestRate;

        Account(double interestRate) {
            this._interestRate = interestRate;
        }

        double interestForAmountDays(double amount, int days) {
            return _interestRate * amount * days / 365;
        }
    }
}
