package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;

public class ProductBasket {
    private final Product[] products = new Product[5];
    private int count = 0;

    public void addProduct(Product product)
    {
        if (count >= products.length) {
            System.out.println("Невозможно добавить продукт");
            return;
        }
        products[count++] = product;
    }
    public double getTotalCost() {
        double total = 0;
        for (int i = 0; i < count; i++) {
            total += products[i].getPrice();
        }
        return total;
    }
    public void printContents() {
        if (count == 0) {
            System.out.println("В корзине пусто");
            return;
        }
        int specialCount = 0;
        for (int i = 0; i < count ; i++) {
            Product p = products[i];
            System.out.println(p);
            if (p.isSpecial()) {
                specialCount++;
            }
        }
        System.out.println("Итого: " + getTotalCost());
        System.out.println("Специальных товаров: " + specialCount);
    }
    public boolean containsProduct(String name) {
        for (int i = 0; i < count; i++) {
            if (products[i].getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public void clear() {
        for (int i = 0; i < count; i++) {
            products[i] = null;
        }
        count = 0;
    }
}