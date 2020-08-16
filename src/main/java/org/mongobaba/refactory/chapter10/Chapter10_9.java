package org.mongobaba.refactory.chapter10;

import java.time.Instant;
import java.util.Date;
import java.util.Enumeration;
import java.util.Vector;

/**
 * Introduce Parameter Object
 * 引入参数对象
 */
public class Chapter10_9 {
    static class Entry {
        Entry(double value, Date chargeDate) {
            this._value = value;
            this._chargeDate = chargeDate;
        }

        Date getDate() {
            return _chargeDate;
        }

        double getValue() {
            return _value;
        }

        private Date _chargeDate;
        private double _value;
    }

    static class Account {
        void addEntry(Entry entry) {
            _entries.add(entry);
        }

        double getFlowBetween(Date start, Date end) {
            double result = 0;
            Enumeration<Entry> e = _entries.elements();
            while (e.hasMoreElements()) {
                Entry each = e.nextElement();
                if (each.getDate().equals(start) || each.getDate().equals(end) ||
                        (each.getDate().after(start) && each.getDate().before(end))) {
                    result += each.getValue();
                }
            }
            return result;
        }

        private Vector<Entry> _entries = new Vector<>();
    }

    private static final Date beginDate = Date.from(Instant.parse("2020-04-01T00:00:00.00Z"));
    private static final Date endDate = Date.from(Instant.parse("2020-07-01T00:00:00.00Z"));

    static double getFlow(Account account) {
        return account.getFlowBetween(beginDate, endDate);
    }
}
