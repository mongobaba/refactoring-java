package org.mongobaba.refactory.chapter9;

/**
 * Replace Nested Conditional with Guard Clauses
 * 以卫语句取代嵌套条件表达式
 */
public class Chapter9_5 {
    static class Employee {
        private boolean _isDead;
        private boolean _isSeparated;
        private boolean _isRetired;

        public Employee(boolean isDead, boolean isSeparated, boolean isRetired) {
            this._isDead = isDead;
            this._isSeparated = isSeparated;
            this._isRetired = isRetired;
        }

        // TODO 简化此方法
        double getPayment() {
            double result;
            if (_isDead) result = deadAmount();
            else {
                if (_isSeparated) result = separatedAmount();
                else {
                    if (_isRetired) result = retiredAmount();
                    else result = normalPayment();
                }
            }
            return result;
        }

        private double normalPayment() {
            return 40.0;
        }

        private double retiredAmount() {
            return 70.0;
        }

        private double separatedAmount() {
            return 50.0;
        }

        private double deadAmount() {
            return 100.0;
        }
    }

    static class Capital {
        private double _capital = 1.0;
        private double _initRate = 0.1;
        private double _duration = 20.0;
        private double _income = 10000.0;
        private static final double ADJ_FACTOR = 0.01;

        // TODO 通过反转条件使用本重构手法
        public double getAdjustedCapital() {
            double result = 0.0;
            if (_capital > 0.0) {
                if (_initRate > 0.0 && _duration > 0.0) {
                    result = (_income /_duration) * ADJ_FACTOR;
                }
            }
            return result;
        }
    }
}
