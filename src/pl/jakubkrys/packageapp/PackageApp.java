package pl.jakubkrys.packageapp;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class PackageApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8);
        Package <Shoes> shoesPackage = null;
        Package <Flour> flourPackage = null;

        int option;
        do {
            System.out.println("----- Package App -----");
            System.out.println("1 - send package");
            System.out.println("2 - pick up package");
            option = scanner.nextInt();
            scanner.nextLine();
            displaySubMenu();
            switch (option){
                case 1:
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
                            shoesPackage = new Package <> (shoes);
                            shoesPackage.send();
                            break;
                        case 2:
                            System.out.print("Name: ");
                            String name = scanner.nextLine();
                            System.out.print("Weight: ");
                            double weight = scanner.nextDouble();
                            scanner.nextLine();

                            Flour flour = new Flour (name,weight);
                            flourPackage = new Package <> (flour);
                            flourPackage.send();
                            break;
                    }
                    break;
                case 2:
                    option = scanner.nextInt();
                    scanner.nextLine();
                    switch (option){
                        case 1:
                            shoesPackage.pickUp();
                            break;
                        case 2:
                            flourPackage.pickUp();
                            break;
                    }
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