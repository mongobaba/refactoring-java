package org.mongobaba.refactory.chapter7;

import java.util.Date;

/**
 * Introduce Foreign Method
 * 引入外加函数
 */
public class Chapter7_7 {
    @SuppressWarnings("deprecation")
    static long getNewStartTimestamp(Date previousEnd) {
        Date newStart = new Date(previousEnd.getYear(), previousEnd.getMonth(), previousEnd.getDate() + 1);
        return newStart.getTime();
    }
}
