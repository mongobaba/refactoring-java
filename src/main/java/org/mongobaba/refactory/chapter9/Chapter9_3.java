package org.mongobaba.refactory.chapter9;

import java.io.Console;

/**
 * Consolidate Duplicate Conditional Fragments
 * 合并重复的条件片段
 */
public class Chapter9_3 {
    private boolean isSpecial;

    public Chapter9_3(boolean isSpecial) {
        this.isSpecial = isSpecial;
    }

    double calculateDeal(double price) {
        double total;
        if (isSpecialDeal()) {
            total = price * 0.95;
            send();
        } else {
            total = price * 0.98;
            send();
        }
        return total;
    }

    private void send() {
        System.out.print("send");
    }

    private boolean isSpecialDeal() {
        return isSpecial;
    }
}
