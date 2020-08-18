package org.mongobaba.refactory.chapter8;

import java.util.Collection;
import java.util.Iterator;

/**
 * Replace Data Value with Object
 * 以对象取代数据值
 */
public class Chapter8_2 {
    static class Order {
        private String _customer;

        public Order(String customer) {
            _customer = customer;
        }

        public String getCustomer() {
            return _customer;
        }

        public void setCustomer(String arg) {
            this._customer = arg;
        }
    }

    static int numberOfOrdersFor(Collection<Object> orders, String customer) {
        int result = 0;
        Iterator<Object> iter = orders.iterator();
        while (iter.hasNext()) {
            Order each = (Order) iter.next();
            if (each.getCustomer().equals(customer)) {
                result++;
            }
        }
        return result;
    }
}
