package pl.jakubkrys.packageapp;

public class ShoesPackage {

    private Shoes shoes;

    public ShoesPackage(Shoes shoes) {
        this.shoes = shoes;
    }
    public void send(){
        System.out.println("Send shoes");
    }

    public void pickUp(){
        System.out.println("Pick up shoes");
    }
}
