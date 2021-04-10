package pl.jakubkrys.packageapp;

public class Shoes extends Product {

    private String brand;
    private int size;

    public Shoes(double price, String brand, int size) {
        super(price);
        this.brand = brand;
        this.size = size;
    }

    @Override
    public String toString() {
        return super.toString() + "Shoes{" +
                "brand='" + brand + '\'' +
                ", size=" + size +
                '}';
    }
}
