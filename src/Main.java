//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import Model.Character;
import Model.Product;
import Repository.InMemoryRepository;
import Service.Service;
import Ui.Ui;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Service service = new Service(new InMemoryRepository<>(), new InMemoryRepository<>());
        new Ui(service).start();

        // Initialisierung der Produkte
        List<Product> produkte = new ArrayList<>();
        Product p1 = new Product("Mjolnir", 500.0, "Asgard");
        produkte.add(p1);
        Product p2= new Product("Vibranium-Schild", 700.0, "Wakanda");
        produkte.add(p2);
        Product p3 = new Product("Infinity Gauntlet", 10000.0, "Titan");
        produkte.add(p3);
        Product p4 = new Product("Web-Shooter", 250.0, "Terra");
        produkte.add(p4);
        Product p5 = new Product("Arc-Reaktor", 1500.0, "Terra");
        produkte.add(p5);
        Product p6 = new Product("Norn Stones", 1200.0, "Asgard");
        produkte.add(p6);
        Product p7 = new Product("Quantum Suit", 3000.0, "Terra");
        produkte.add(p7);
        Product p8 = new Product("X-Gene Serum", 850.0, "X-Mansion");
        produkte.add(p8);
        Product p9 = new Product("Cosmic Cube", 9000.0, "Multiverse");
        produkte.add(p9);
        Product p10 = new Product("Darkhold", 2000.0, "Multiverse");
        produkte.add(p10);


    }
}






//
//        charaktere.add(1, "Thor", "Asgard", (p1, p6, p10));
//        charaktere.add(2, "Black Panther", "Wakanda", (p2, p8));
//        charaktere.add(3, "Iron Man", "Terra", (p5, p7, p4));
//        charaktere.add(4, "Spider-Man", "Terra", (p4, p9));
//        charaktere.add(5, "Doctor Strange", "Multiverse", (p10, p9, p3));