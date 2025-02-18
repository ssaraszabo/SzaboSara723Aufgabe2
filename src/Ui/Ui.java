package Ui;


import Model.Product;
import Model.Character;
import Service.Service;

import java.util.List;
import java.util.Scanner;

class Ui {
    private final Service service;
    private final Scanner scanner = new Scanner(System.in);

    public Ui(Service service) {
        this.service = service;
    }

    public void start() {
        while (true) {
            System.out.println("Marvel Management System");
            System.out.println("1. Add Product");
            System.out.println("2. Add Character");
            System.out.println("3. View Character Sorted By Region");
            System.out.println("4. View CharactersByPUniversum");
            System.out.println("5. Sort Products By Price");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> addProduct();
                case 2 -> addCharacter();
                case 3 -> System.out.println(service.getCharacterSortedByRegion());
                case 4 -> getCharactersByPUniversum();
                case 5 -> sortMedicationsForPatient();
                case 6 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Invalid choice!");
            }
        }
    }

    private void addProduct() {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter price: ");
        double price = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Enter universum: ");
        String universum = scanner.nextLine();
        service.addProduct(new Product(name, price, universum));
    }

    private void addCharacter() {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Region: ");
        String region = scanner.nextLine();
        service.addCharacter(new Character(name, age, region));
    }

    private void getCharactersByPUniversum() {
        System.out.print("Enter universum: ");
        String universum = scanner.nextLine();
        List<Character> characters = service.getCharactersByPUniversum(universum);

        if (characters.isEmpty()) {
            System.out.println("No characters found.");
        } else {
            System.out.println("Characters found with products from " + universum + ":");
            for (Character character : characters) {
                System.out.println(character);
            }
        }
    }
//
//    private void sortMedicationsForPatient() {
//        System.out.print("Enter patient ID: ");
//        int patientId = scanner.nextInt();
//        scanner.nextLine();
//
//        System.out.print("Sort by price (ascending/descending): ");
//        String order = scanner.nextLine().trim().toLowerCase();
//        boolean ascending = order.equals("ascending");
//
//        try {
//            List<Medication> sortedMedications = service.getMedicationsSortedByPrice(patientId, ascending);
//            System.out.println("Medications for Patient ID " + patientId + " sorted by price:");
//            for (Medication med : sortedMedications) {
//                System.out.println(med);
//            }
//        } catch (NoSuchElementException e) {
//            System.out.println("Error: " + e.getMessage());
//        }
//    }
//
}

