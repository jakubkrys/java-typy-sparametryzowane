package pl.jakubkrys.packageapp;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class PackageApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8);


        int option;
        do{
            System.out.println("----- Package App -----");
            System.out.println("1 - send package");
            System.out.println("2 - pick up package");
            option = scanner.nextInt();
            scanner.nextLine();
            switch (option){
                case 1:
                    displaySubMenu();
                    option = scanner.nextInt();
                    scanner.nextLine();
                    switch (option){
                        case 1:
                            System.out.print("Brand: ");
                            String brand = scanner.nextLine();
                            System.out.print("Size: ");
                            int size = scanner.nextInt();
                            scanner.nextLine();

                            Shoes shoes = new Shoes (brand,size);
                            ShoesPackage shoesPackage = new ShoesPackage(shoes);
                            shoesPackage.send();
                            break;
                        case 2:
                            System.out.print("Name: ");
                            String name = scanner.nextLine();
                            System.out.print("Weight: ");
                            int weight = scanner.nextInt();
                            scanner.nextLine();

                            Flour flour = new Flour (name,weight);
                            FlourPackage flourPackage = new FlourPackage(flour);
                            flourPackage.send();
                            break;
                    }
                    break;
                case 2:
                    break;
            }
        } while (option != 0);
        scanner.close();
    }

    private static void displaySubMenu() {
        System.out.println("1 - shoes");
        System.out.println("2 - flour");
    }
}
