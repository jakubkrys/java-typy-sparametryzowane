package pl.jakubkrys.peopleregister;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

// Zadanie 4 z interfejsem Comparable nierozwiązywalne na obecnym etapie - Szymon przygotuje inne

public class RegisterApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8);
        Person[] persons = new Person[20];
        int option;
        int index = 0;

        do {
            System.out.println("----- Register App -----");
            System.out.println("1 - add person");
            System.out.println("2 - display all");
            System.out.println("0 - quit");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.print("Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Surname: ");
                    String surname = scanner.nextLine();
                    System.out.print("Identifier: ");
                    int identifier = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Postal code: ");
                    String postalcode = scanner.nextLine();

                    Person<Integer, String> person = new Person<>(name, surname, identifier, postalcode);
                    addPersonToRegister(persons, index, person);
                    break;
                case 2:
                    displayAllPersons(persons);
                    break;
            }
        } while (option != 0);
        scanner.close();
    }

    private static void displayAllPersons(Person[] persons) {
        for (int i = 0; i < persons.length && persons[i] != null; i++) {
            System.out.println(persons[i].toString());
        }
    }

    private static int addPersonToRegister(Person[] persons, int index, Person<Integer, String> person) {
        if (index == persons.length - 1) {
            index = 0;
        }
        persons[index] = person;
        index++;
        return index;
    }
}
