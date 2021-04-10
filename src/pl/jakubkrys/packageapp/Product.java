package pl.jakubkrys.packageapp;

public class Product {

    private double price;

    public Product(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "price=" + price +
                '}';
    }
}
