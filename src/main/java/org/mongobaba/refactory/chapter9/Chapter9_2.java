package org.mongobaba.refactory.chapter9;

/**
 * Consolidate Conditional Expression
 * 合并条件表达式
 */
public class Chapter9_2 {
    static class LogicOr {
        private int _seniority;
        private int _monthsDisabled;
        private boolean _isPartTime;

        public LogicOr(int seniority, int monthsDisabled, boolean isPartTime) {
            this._seniority = seniority;
            this._monthsDisabled = monthsDisabled;
            this._isPartTime = isPartTime;
        }

        // TODO 合并条件判断
        double disabilityAmount() {
            if (_seniority < 2) return 0;
            if (_monthsDisabled > 12) return 0;
            if (_isPartTime) return 0;
            return 3.0;
        }
    }

    static class LogicAnd {
        private boolean onVacation() {
            return true;
        }

        private int lengthOfService() {
            return 13;
        }

        // TODO 合并条件判断
        double calculate() {
            if (onVacation()) {
                if (lengthOfService() > 10) {
                    return 1;
                }
            }
            return 0.5;
        }
    }
}
