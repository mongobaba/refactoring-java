package org.mongobaba.refactory.chapter8;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Change Unidirectional Association to Bidirectional
 * 将单向关联改为双向关联
 */
public class Chapter8_7 {
    // TODO 在Order和Customer之间建立双向关联，使得调用
    //      setCustomer和addOrder的任意一个皆可建立双方之间的联系

    static class Order {
        public Order(String id) {
            this._id = id;
        }

        public String getId() {
            return _id;
        }

        public Customer getCustomer() {
            return _customer;
        }

        public void setCustomer(Customer arg) {
            this._customer = arg;
        }

        private String _id;
        private Customer _customer;
    }

    static class Customer {
        private Set<Order> _orders = new LinkedHashSet<>();

        void addOrder(Order order) {
            _orders.add(order);
        }

        String printAllOrder() {
            StringBuilder sb = new StringBuilder();
            for (Order order : _orders) {
                if (order.getCustomer() == this) {
                    sb.append(order.getId()).append(',');
                }
            }
            if (sb.length() > 0) {
                sb.setLength(sb.length() - 1); // remove last ‘,’
            }
            return sb.toString();
        }
    }
}
