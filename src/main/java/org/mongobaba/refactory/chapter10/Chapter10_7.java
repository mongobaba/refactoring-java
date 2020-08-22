package org.mongobaba.refactory.chapter10;

/**
 * Preserve Whole Object
 * 保持对象完整
 */
public class Chapter10_7 {
    static class TempRange {
        private int low;
        private int high;

        public TempRange(int low, int high) {
            this.low = low;
            this.high = high;
        }

        public int getLow() {
            return low;
        }

        public int getHigh() {
            return high;
        }
    }

    static class Room {
        private TempRange tempRange;

        public void setTempRange(TempRange tempRange) {
            this.tempRange = tempRange;
        }

        public TempRange daysTempRange() {
            return tempRange;
        }

        boolean withinPlan(HeatingPlan plan) {
            int low = daysTempRange().getLow();
            int high = daysTempRange().getHigh();
            return plan.withinRange(low, high);
        }
    }

    static class HeatingPlan {
        private TempRange _range;

        public void setRange(TempRange _range) {
            this._range = _range;
        }

        // TODO 更改参数类型为TempRange，去除现有参数
        //      将此方法的本体移入TempRange类型中
        boolean withinRange(int low, int high) {
            return low >= _range.getLow() && high <= _range.getHigh();
        }
    }
}
