package org.mongobaba.refactory.chapter10;

/**
 * Remove Setting Method
 * 移除设值函数
 */
public class Chapter10_10 {
    static class Account {
        private String _id;

        public Account(String id) {
            setId(id);
        }

        public void setId(String arg) {
            _id = arg;
        }

        @Override
        public String toString() {
            return "Account{" +
                    "id='" + _id + '\'' +
                    '}';
        }
    }

    static class ZZAccount {
        private String _id;

        public ZZAccount(String id) {
            setId(id);
        }

        public void setId(String arg) {
            this._id = "ZZ" + arg;
        }

        @Override
        public String toString() {
            return "ZZAccount{" +
                    "id='" + _id + '\'' +
                    '}';
        }
    }

    static class AccountBase {
        private String _id;

        public AccountBase() {}

        public void setId(String arg) {
            _id = arg;
        }

        public String getId() {
            return _id;
        }
    }

    static class InterestAccount extends AccountBase {
        private double _interestRate;

        InterestAccount(String id, double interestRate) {
            setId(id);
            this._interestRate = interestRate;
        }

        @Override
        public String toString() {
            return "InterestAccount{" +
                    "id='" + getId() + '\'' +
                    ", interestRate=" + _interestRate +
                    '}';
        }
    }
}
