package pl.jakubkrys.packageapp;

public class FlourPackage {

    private Flour flour;

    public FlourPackage(Flour flour) {
        this.flour = flour;
    }
    public void send(){
        System.out.println("Send flour");
    }

    public void pickUp(){
        System.out.println("Pick up flour");
    }
}
