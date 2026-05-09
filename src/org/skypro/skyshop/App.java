package org.skypro.skyshop;
import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.DiscountedProduct;
import org.skypro.skyshop.product.FixPriceProduct;
import org.skypro.skyshop.product.SimpleProduct;
import org.skypro.skyshop.product.Product;


public class App {
    public static void main(String[] args)
    {
        SimpleProduct apple = new SimpleProduct("Яблоко", 50);
        SimpleProduct banana = new SimpleProduct("Банан", 70);
        DiscountedProduct orange = new DiscountedProduct("Апельсин", 90, 15);
        DiscountedProduct milk = new DiscountedProduct("Молоко", 120, 10);
        FixPriceProduct bread = new FixPriceProduct("Хлеб");
        SimpleProduct cheese = new SimpleProduct("Сыр", 200);
        FixPriceProduct soup = new FixPriceProduct("Мыло");

        ProductBasket basket = new ProductBasket();

        System.out.println("\nДобавляем продукты в корзину:");
        basket.addProduct(apple);
        basket.addProduct(banana);
        basket.addProduct(orange);
        basket.addProduct(milk);
        basket.addProduct(bread);

        System.out.println("\nПытаемся добавить продукт в заполненную корзину:");
        basket.addProduct(soup);

        System.out.println("\nСодержимое корзины:");
        basket.printContents();

        System.out.println("\nОбщая стоимость корзины:");
        basket.getTotalCost();

        String searchName1 = "Яблоко";
        System.out.println("Есть ли " + searchName1 + " в корзине? " +
                basket.containsProduct(searchName1));

        String searchName2 = "Сыр";
        System.out.println("Есть ли " + searchName2 + " в корзине? " +
                basket.containsProduct(searchName2));

        System.out.println("\nОчищаем корзину ");
        basket.clear();

        System.out.println("Содержимое корзины после очистки: ");
        basket.printContents();

        System.out.println("Общая стоимость пустой корзины: " +
                basket.getTotalCost());

        System.out.println("Есть ли яблоко в пустой корзине? " +
                basket.containsProduct("Яблоко"));
    }
}