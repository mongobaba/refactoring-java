package org.mongobaba.refactory;

import java.time.Instant;
import java.util.Date;

public final class DateUtil {
    private DateUtil() {}

    public static Date at(int year, int month, int day) {
        String text = String.format("%04d-%02d-%02dT00:00:00.00Z", year, month, day);
        return Date.from(Instant.parse(text));
    }
}
