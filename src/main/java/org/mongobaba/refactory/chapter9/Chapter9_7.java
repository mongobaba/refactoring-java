package org.mongobaba.refactory.chapter9;

/**
 * Introduce Null Object
 * 引入Null对象
 */
public class Chapter9_7 {
    static class Customer {
        private String name;

        public Customer(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    static class Site {
        private Customer _customer;

        void setCustomer(Customer customer) {
            _customer = customer;
        }

        Customer getCustomer() {
            return _customer;
        }

        String displayRecord() {
            Customer customer = getCustomer();
            String customerName;
            if (customer == null) {
                customerName = "occupant";
            } else {
                customerName = customer.getName();
            }
            return String.format("site used by <%s>", customerName);
        }
    }
}
