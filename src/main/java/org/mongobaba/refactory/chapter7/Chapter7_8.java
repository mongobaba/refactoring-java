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

    // TODO 分别使用子类化和包装类技术，将nextDay方法转移到新的类型中
    @SuppressWarnings("deprecation")
    static Date getNextDay(Date day) {
        return new Date(day.getYear(), day.getMonth(), day.getDate() + 1);
    }
}
