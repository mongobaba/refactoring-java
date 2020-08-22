package org.mongobaba.refactory.Chapter6;

/**
 * Replace Temp with Query
 * 以查询取代临时变量
 */
public class Chapter6_4 {
    private int _quantity;
    private int _itemPrice;

    public Chapter6_4(int quantity, int itemPrice) {
        this._quantity = quantity;
        this._itemPrice = itemPrice;
    }

    // TODO 拆分此方法
    double getPrice() {
        int basePrice = _quantity * _itemPrice;
        double discountFactor;
        if (basePrice > 1000) {
            discountFactor = 0.95;
        } else {
            discountFactor = 0.98;
        }
        return basePrice * discountFactor;
    }
}
