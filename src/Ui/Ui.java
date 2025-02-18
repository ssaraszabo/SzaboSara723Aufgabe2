package Ui;


import Model.Product;
import Model.Character;
import Service.Service;

import java.util.List;
import java.util.NoSuchElementException;
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
                case 4 -> findPatientsByMedication();
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
//
//    private void findPatientsByMedication() {
//        System.out.print("Enter disease: ");
//        String disease = scanner.nextLine();
//        List<Patient> patients = service.getPatientsByMedication(disease);
//
//        if (patients.isEmpty()) {
//            System.out.println("No patients found for this medication.");
//        } else {
//            System.out.println("Patients prescribed medication for " + disease + ":");
//            for (Patient patient : patients) {
//                System.out.println(patient);
//            }
//        }
//    }
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

