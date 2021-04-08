package pl.jakubkrys.packageapp;

public class Shoes {

    private String brand;
    private int size;

    public Shoes(String brand, int size) {
        this.brand = brand;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Shoes{" +
                "brand='" + brand + '\'' +
                ", size=" + size +
                '}';
    }
}
