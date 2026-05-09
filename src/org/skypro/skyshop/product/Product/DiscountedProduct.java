package org.skypro.skyshop.product;

public class DiscountedProduct extends org.skypro.skyshop.product.Product {
    private final int discountPercent; //cкидка в процентах

    public DiscountedProduct(String name, double price, int discountPercent) {
        super(name, price);
        this.discountPercent = discountPercent;
    }
    @Override
    public boolean isSpecial () {
        return true;
    }
    @Override
    public String toString() {
        return getName() + ": " + getPrice() + " (скидка " + discountPercent + "%)";
    }
}