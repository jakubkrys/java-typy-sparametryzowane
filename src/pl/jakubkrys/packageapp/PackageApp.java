package pl.jakubkrys.packageapp;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class PackageApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8);
        Package <Shoes> shoesPackage = null;
        Package <Flour> flourPackage = null;
        Package <Cat> catPackage = null; // Kot nie jest produktem, więc nie można utworzyć paczki z kotem
        boolean sended;

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
                            System.out.println("Price: ");
                            double shoesPrice = scanner.nextDouble();
                            scanner.nextLine();
                            System.out.print("Brand: ");
                            String brand = scanner.nextLine();
                            System.out.print("Size: ");
                            int size = scanner.nextInt();
                            scanner.nextLine();

                            Shoes shoes = new Shoes (shoesPrice,brand,size);
                            shoesPackage = new Package <> (shoes);
                            sended = shoesPackage.send();
                            break;
                        case 2:
                            System.out.println("Price: ");
                            double flourPrice = scanner.nextDouble();
                            System.out.print("Name: ");
                            String name = scanner.nextLine();
                            System.out.print("Weight: ");
                            double weight = scanner.nextDouble();
                            scanner.nextLine();

                            Flour flour = new Flour (flourPrice,name,weight);
                            flourPackage = new Package <> (flour);
                            sended = flourPackage.send();
                            break;
                        case 3:
                            System.out.println("Price: ");
                            double catPrice = scanner.nextDouble();
                            System.out.print("Breed: ");
                            String breed = scanner.nextLine();
                            System.out.print("Age: ");
                            int age = scanner.nextInt();
                            scanner.nextLine();

                            Cat cat = new Cat (catPrice,breed,age); // jak wyżej
                            catPackage = new Package <> (cat);
                            sended = catPackage.send();
                            break;
                    }
                    break;
                case 2:
                    option = scanner.nextInt();
                    scanner.nextLine();
                    switch (option){
                        case 1:
                            Shoes shoes = shoesPackage.pickUp();
                            break;
                        case 2:
                            Flour flour = flourPackage.pickUp();
                            break;
                        case 3:
                            Cat cat = catPackage.pickUp();
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
        System.out.println("3 - cat");
    }
}