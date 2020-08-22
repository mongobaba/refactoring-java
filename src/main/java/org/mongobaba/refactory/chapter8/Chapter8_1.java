package org.mongobaba.refactory.chapter8;

/**
 * Self Encapsulate Field
 * 自封装字段
 */
public class Chapter8_1 {
    static class IntRange {
        // TODO 包装以下两个字段
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

        // TODO 在完成上面的包装后，去除这一个重写操作
        boolean includes(int arg) {
            return super.includes(arg) && arg <= _cap;
        }

        private int _cap;
    }
}
