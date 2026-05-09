package org.skypro.skyshop.product;

public class FixPriceProduct extends org.skypro.skyshop.product.Product {
    public static final double FIX_PRICE = 10;

    public FixPriceProduct(String name) {
        super(name, FIX_PRICE);
    }

    @Override
    public boolean isSpecial() {
        return true;
    }

    @Override
    public String toString() {
        return getName() + " : Фиксированная цена " + FIX_PRICE;
    }
}
