package org.mongobaba.refactory.chapter8;

/**
 * Self Encapsulate Field
 * 自封装字段
 */
public class Chapter8_1 {
    static class IntRange {
        private int _low, _high;

        boolean includes(int arg) {
            return arg >= _low && arg <= _high;
        }

        void grow(int factor) {
            _high = _high * factor;
        }

        IntRange(int low, int high) {
            _low = low;
            _high = high;
        }
    }

    static class CappedRange extends IntRange {
        CappedRange(int low, int high, int cap) {
            super(low, high);
            _cap = cap;
        }

        int getCap() {
            return _cap;
        }

        // try to remove this method
        boolean includes(int arg) {
            return super.includes(arg) && arg <= _cap;
        }

        private int _cap;
    }
}
