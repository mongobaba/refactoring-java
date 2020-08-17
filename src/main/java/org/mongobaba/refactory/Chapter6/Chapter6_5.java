package org.mongobaba.refactory.Chapter6;

/**
 * Introduce Explaining Variable
 * 引入解释性变量
 */
public class Chapter6_5 {
    private int _quantity;
    private double _itemPrice;

    public Chapter6_5(int quantity, double itemPrice) {
        this._quantity = quantity;
        this._itemPrice = itemPrice;
    }

    double price() {
        // price is base price - quantity discount + shipping
        return _quantity * _itemPrice -
                Math.max(0, _quantity - 500) * _itemPrice * 0.05 +
                Math.min(_quantity * _itemPrice * 0.1, 100.0);
    }
}
