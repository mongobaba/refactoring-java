package org.mongobaba.refactory.chapter7;

import java.util.Date;

/**
 * Introduce Local Extension
 * 引入本地扩展
 */
public class Chapter7_8 {
    static long getNewStartTimestamp(long previousEnd) {
        Date date = new Date(previousEnd);
        return getNextDay(date).getTime();
    }

    @SuppressWarnings("deprecation")
    static Date getNextDay(Date day) {
        return new Date(day.getYear(), day.getMonth(), day.getDate() + 1);
    }
}
