package org.mongobaba.refactory.chapter10;

/**
 * Replace Error Code with Exception
 * 以异常取代错误码
 */
public class Chapter10_14 {
    static class Account {
        private int _balance;

        Account(int balance) {
            this._balance = balance;
        }

        // TODO 分别让此方法在无法透支的时候抛出非受检和受检异常
        int withdraw(int amount) {
            if (amount > _balance) {
                return -1;
            } else {
                _balance -= amount;
                return 0;
            }
        }
    }

    static void withdraw(Account account, int amount) {
        if (account.withdraw(amount) == -1) {
            handleOverdrawn();
        } else {
            doTheUsualThing();
        }
    }

    private static void doTheUsualThing() {
        System.out.print("usual thing");
    }

    private static void handleOverdrawn() {
        System.out.print("overdrawn");
    }
}
