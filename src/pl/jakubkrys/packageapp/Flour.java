package pl.jakubkrys.packageapp;

public class Flour {

    private String name;
    private double weight;

    public Flour(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Flour{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
