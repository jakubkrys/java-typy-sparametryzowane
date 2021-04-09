package pl.jakubkrys.packageapp;

public class Package <V> implements Operations<V> {
    private V value;

    public Package(V value) {
        this.value = value;
    }

    public V getValue() {
        return value;
    }

    @Override
    public boolean send(){
        System.out.println("Send package");
        System.out.println(value);
        return true;
    }

    @Override
    public V pickUp(){
        System.out.println("Pick up package");
        System.out.println(value);
        return value;
    }

    @Override
    public String toString() {
        return "Package{" +
                "value=" + value +
                '}';
    }
}