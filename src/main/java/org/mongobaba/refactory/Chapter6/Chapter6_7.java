package org.mongobaba.refactory.Chapter6;

/**
 * Remove Assignments to Parameters
 * 移除对参数的赋值
 */
public class Chapter6_7 {
    static int discount(int inputVal, int quantity, int yearToDate) {
        if (inputVal > 50) inputVal -= 2;
        if (quantity > 100) inputVal -= 1;
        if (yearToDate > 10000) inputVal -= 4;
        return inputVal;
    }
}
