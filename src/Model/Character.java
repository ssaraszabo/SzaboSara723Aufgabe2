package Model;


import Repository.Identifiable;

import java.util.ArrayList;
import java.util.List;

/**
 * Model representing a Patient.
 */
class Character implements Identifiable {
    private int id;
    private String name;
    private String region;
    private List<Product> products;

    public Character(String name, String region) {
        this.name = name;
        this.region = region;
        this.products = new ArrayList<>();
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getRegion() {
        return region;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    @Override
    public String toString() {
        return "Patient{" + "id=" + id + ", name='" + name + '\'' +  ", region='" + region + '\'' + ", products=" + products + '}';
    }
}

