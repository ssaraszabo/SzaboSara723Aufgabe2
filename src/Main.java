import Model.Product;
import Model.Character;
import Repository.IRepository;
import Repository.InMemoryRepository;
import Service.Service;
import Ui.Ui;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        IRepository<Product> productRepository = new InMemoryRepository<>();
        IRepository<Character> characterRepository = new InMemoryRepository<>();

        Service service = new Service(productRepository, characterRepository);
        service.addProduct(new Product("Mjolnir", 500.0, "Asgard"));
        service.addProduct(new Product("Vibranium-Schild", 700.0, "Wakanda"));
        service.addProduct(new Product("Infinity Gauntlet", 10000.0, "Titan"));
        service.addProduct(new Product("Web-Shooter", 250.0, "Terra"));
        service.addProduct(new Product("Arc-Reaktor", 1500.0, "Terra"));
        service.addProduct(new Product("Norn Stones", 1200.0, "Asgard"));
        service.addProduct(new Product("Quantum Suit", 3000.0, "Terra"));
        service.addProduct(new Product("X-Gene Serum", 850.0, "X-Mansion"));
        service.addProduct(new Product("Cosmic Cube", 9000.0, "Multiverse"));
        service.addProduct(new Product("Darkhold", 2000.0, "Multiverse"));

        Character thor = new Character("Thor", "Asgard");
        Character blackPanther = new Character("Black Panther", "Wakanda");
        Character ironMan = new Character("Iron Man", "Terra");
        Character spiderMan = new Character("Spider-Man", "Terra");
        Character doctorStrange = new Character("Doctor Strange", "Multiverse");

        service.addCharacter(thor);
        service.addCharacter(blackPanther);
        service.addCharacter(ironMan);
        service.addCharacter(spiderMan);
        service.addCharacter(doctorStrange);
        thor.addProduct(productRepository.get(1)); // Mjolnir
        thor.addProduct(productRepository.get(6)); // Norn Stones
        thor.addProduct(productRepository.get(10)); // Darkhold
        blackPanther.addProduct(productRepository.get(2)); // Vibranium-Schild
        blackPanther.addProduct(productRepository.get(8)); // X-Gene Serum
        ironMan.addProduct(productRepository.get(5)); // Arc-Reaktor
        ironMan.addProduct(productRepository.get(7)); // Quantum Suit
        ironMan.addProduct(productRepository.get(4)); // Web-Shooter
        spiderMan.addProduct(productRepository.get(4)); // Web-Shooter
        spiderMan.addProduct(productRepository.get(9)); // Cosmic Cube
        doctorStrange.addProduct(productRepository.get(10)); // Darkhold
        doctorStrange.addProduct(productRepository.get(9)); // Cosmic Cube
        doctorStrange.addProduct(productRepository.get(3)); // Infinity Gauntlet

        Ui ui = new Ui(service);
        ui.start();
    }
}