package org.mongobaba.refactory.Chapter6;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Extract Method
 * 提炼函数
 */
public class Chapter6_1 {
    static class Order {
        private double amount;

        public Order(double amount) {
            this.amount = amount;
        }

        public double getAmount() {
            return amount;
        }
    }

    static class Bill {
        private Vector<Object> _orders = new Vector<>();
        private String _name;

        Bill(String name) {
            _name = name;
        }

        void addOrder(Order order) {
            _orders.add(order);
        }

        // TODO 拆分这个方法
        void printOwing(double previousAmount) {
            Enumeration<Object> e = _orders.elements();
            double outstanding = previousAmount * 1.2;

            // print banner
            System.out.println("*************************");
            System.out.println("***** Customer Owes *****");
            System.out.println("*************************");

            // calculate outstanding
            while (e.hasMoreElements()) {
                Order each = (Order) e.nextElement();
                outstanding += each.getAmount();
            }

            // print details
            System.out.println("name: " + _name);
            System.out.println("amount: " + outstanding);
        }
    }
}
