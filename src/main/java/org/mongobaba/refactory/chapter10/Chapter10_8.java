package org.mongobaba.refactory.chapter10;

/**
 * Replace Parameter with Methods
 * 以函数取代参数
 */
public class Chapter10_8 {
    private int _quantity;
    private int _itemPrice;

    public void setQuantity(int _quantity) {
        this._quantity = _quantity;
    }

    public void setItemPrice(int _itemPrice) {
        this._itemPrice = _itemPrice;
    }

    // TODO 简化此方法
    public double getPrice() {
        int basePrice = _quantity * _itemPrice;
        int discountLevel;
        if (_quantity > 100) discountLevel = 2;
        else discountLevel = 1;
        double finalPrice = discountedPrice(basePrice, discountLevel);
        return finalPrice;
    }

    // TODO 去除该方法的全部参数
    private double discountedPrice(int basePrice, int discountLevel) {
        if (discountLevel == 2) return basePrice * 0.1;
        else return basePrice * 0.05 ;
    }
}
