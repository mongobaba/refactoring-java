package org.mongobaba.refactory.Chapter11;

import java.util.Date;

/**
 * Pull Up Method
 * 函数上移
 */
public class Chapter11_2 {
    static class Customer {
        protected Date lastBillDate;

        void addBill(Date date, double amount) {
            System.out.print(amount);
        }
    }

    static class RegularCustomer extends Customer {
        void createBill(Date date) {
            double charge = chargeFor(lastBillDate, date);
            addBill(date, charge);
        }

        double chargeFor(Date start, Date end) {
            return 20.0;
        }
    }

    static class PreferredCustomer extends Customer {
        void createBill(Date date) {
            double charge = chargeFor(lastBillDate, date);
            addBill(date, charge);
        }

        double chargeFor(Date start, Date end) {
            return 15.0;
        }
    }
}
