package pl.jakubkrys.packageapp;

public class Package <V> {
    private V value;

    public Package(V value) {
        this.value = value;
    }

    public V getValue() {
        return value;
    }

    public void send(){
        System.out.println("Send package");
        System.out.println(value);
    }

    public void pickUp(){
        System.out.println("Pick up package");
        System.out.println(value);
    }

    @Override
    public String toString() {
        return "Package{" +
                "value=" + value +
                '}';
    }
}