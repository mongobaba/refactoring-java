package org.mongobaba.refactory.chapter8;

import java.util.Collection;
import java.util.Iterator;

/**
 * Change Value to Reference
 * 将值对象改为引用对象
 */
public class Chapter8_3 {
    static class Customer {
        private final String _name;

        public Customer(String name) {
            this._name = name;
        }

        public String getName() {
            return _name;
        }
    }

    static class Order {
        private Customer _customer;

        public Order(String customerName) {
            this._customer = new Customer(customerName);
        }

        public String getCustomerName() {
            return _customer.getName();
        }

        public void setCustomer(String customerName) {
            this._customer = new Customer(customerName);
        }
    }

    static int numberOfOrdersFor(Collection<Object> orders, String customer) {
        int result = 0;
        Iterator<Object> iter = orders.iterator();
        while (iter.hasNext()) {
            Order each = (Order) iter.next();
            if (each.getCustomerName().equals(customer)) {
                result++;
            }
        }
        return result;
    }
}
