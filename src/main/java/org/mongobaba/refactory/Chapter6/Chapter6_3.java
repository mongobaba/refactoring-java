package org.mongobaba.refactory.Chapter6;

/**
 * Inline Temp
 * 内联临时变量
 */
public class Chapter6_3 {
    static class Order {
        private double _basePrice;

        public Order(double basePrice) {
            this._basePrice = basePrice;
        }

        public double basePrice() {
            return _basePrice;
        }
    }

    static boolean tooExpensive(Order order) {
        double basePrice = order.basePrice();
        return basePrice > 1000;
    }
}
