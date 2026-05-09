package  org.skypro.skyshop.product;

public abstract class Product {
    private final String name;
    private final double price;

    public Product(String name, double price)
    {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public boolean isSpecial() {
        return false;
    }
    @Override
    public abstract String toString();
}