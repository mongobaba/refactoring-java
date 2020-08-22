package org.mongobaba.refactory.Chapter6;

/**
 * Replace Method with Method Object
 * 以函数对象取代函数
 */
public class Chapter6_8 {
    static class Account {
        // TODO 重构该方法
        int gamma(int inputVal1, int quantity, int yearToDate) {
            int importantValue1 = (inputVal1 * quantity) + delta();
            int importantValue2 = (inputVal1 * yearToDate) + 100;
            if ((yearToDate - importantValue1) > 100) {
                importantValue2 -= 20;
            }
            int importantValue3 = importantValue2 * 7;
            // and so on
            return importantValue3 - 2 * importantValue1;
        }

        private int delta() {
            return 0;
        }
    }
}
