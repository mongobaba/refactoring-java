package org.mongobaba.refactory.chapter8;

import java.util.HashSet;
import java.util.Set;

/**
 * Change Bidirectional Association to Unidirectional
 * 将双向关联改为单向关联
 */
public class Chapter8_8 {
    // TODO 删除Order中的customer字段
    static class Order {
        public Customer getCustomer() {
            return _customer;
        }

        public void setCustomer(Customer arg) {
            if (_customer != null) {
                _customer.friendOrders().remove(this);
            }
            _customer = arg;
            if (_customer != null) {
                _customer.friendOrders().add(this);
            }
        }

        double getDiscountedPrice() {
            return getGrossPrice() * (1 - _customer.getDiscount());
        }

        private double getGrossPrice() {
            return 100.0;
        }

        private Customer _customer;
    }

    static class Customer {
        private Set<Order> _orders = new HashSet<>();

        void addOrder(Order order) {
            order.setCustomer(this);
        }

        Set<Order> friendOrders() {
            return _orders;
        }

        public double getDiscount() {
            return 0.5;
        }

        double getPriceFor(Order order) {
            return order.getDiscountedPrice();
        }
    }
}
