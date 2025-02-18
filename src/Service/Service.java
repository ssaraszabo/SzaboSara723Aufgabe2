package Service;

import Model.Product;
import Model.Character;
import Repository.IRepository;

import java.util.*;

/**
 * Service layer to handle business logic for medications and patients.
 */
class Service {
    private final IRepository<Product> productRepository;
    private final IRepository<Character> characterRepository;

    public Service(IRepository<Product> productRepository, IRepository<Character> characterRepository) {
        this.productRepository = productRepository;
        this.characterRepository = characterRepository;
    }

    public void addProduct(Product product) {
        productRepository.add(product);
    }

    public void addCharacter(Character character) {
        characterRepository.add(character);
    }

    public List<Character> getCharacterSortedByRegion() {
        List<Character> characters = characterRepository.getAll();
        characters.sort(Comparator.comparing(Character::getRegion));
        return characters;
    }

//    public List<Patient> getPatientsByMedication(String disease) {
//        List<Patient> result = new ArrayList<>();
//        for (Patient patient : patientRepository.getAll()) {
//            for (Medication medication : patient.getMedications()) {
//                if (medication.getDisease().equalsIgnoreCase(disease)) {
//                    result.add(patient);
//                    break;
//                }
//            }
//        }
//        return result;
//    }
//
//    public List<Product> getProductsSortedByPrice(int characterId, boolean ascending) {
//        Character character = characterRepository.get(characterId);
//        if (character == null) {
//            throw new NoSuchElementException("Patient not found");
//        }
//        List<Product> products = new ArrayList<>(character.getProducts());
//        products.sort(ascending ? Comparator.comparingDouble(Product::getPrice) : Comparator.comparingDouble(Product::getPrice).reversed());
//        return products;
//    }
//}
