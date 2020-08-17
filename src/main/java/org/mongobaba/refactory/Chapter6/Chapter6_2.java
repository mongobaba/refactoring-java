package org.mongobaba.refactory.Chapter6;

/**
 * Inline Method
 * 内联函数
 */
public class Chapter6_2 {
    private int _numberOfLateDeliveries;

    Chapter6_2(int numberOfLateDeliveries) {
        this._numberOfLateDeliveries = numberOfLateDeliveries;
    }

    int getRating() {
        return moreThanFiveLateDeliveries() ? 2 : 1;
    }

    boolean moreThanFiveLateDeliveries() {
        return _numberOfLateDeliveries > 5;
    }
}
