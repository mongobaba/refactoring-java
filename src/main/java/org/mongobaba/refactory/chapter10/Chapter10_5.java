package org.mongobaba.refactory.chapter10;

/**
 * Parameterize Method
 * 令函数携带参数
 */
public class Chapter10_5 {
    static class Employee {
        private double salary;

        public Employee(double salary) {
            this.salary = salary;
        }

        public double getSalary() {
            return salary;
        }

        void tenPercentRaise() {
            salary *= 1.1;
        }

        void fivePercentRaise() {
            salary *= 1.05;
        }
    }

    static class Dollars {
        private double amount;

        public Dollars(double amount) {
            this.amount = amount;
        }

        public double getAmount() {
            return amount;
        }
    }

    static class Charge {
        public Dollars baseCharge() {
            double result = Math.min(lastUsage(), 100) * 0.03;
            if (lastUsage() > 100) {
                result += (Math.min(lastUsage(), 200) - 100) * 0.05;
            }
            if (lastUsage() > 200) {
                result += (lastUsage() - 200) * 0.07;
            }
            return new Dollars(result);
        }

        private double lastUsage() {
            return 300.0;
        }
    }
}
