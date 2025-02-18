package Model;


import Repository.Identifiable;

import java.util.ArrayList;
import java.util.List;

/**
 * Model representing a Patient.
 */
public class Character implements Identifiable {
    private int id;
    private String name;
    private String region;
    private List<Product> products;

    /**
     *
     * @param name
     * @param region
     */
    public Character(String name, String region) {
        this.name = name;
        this.region = region;
        this.products = new ArrayList<>();
    }

    /**
     *
     * @param id
     */
    @Override
    public void setId(int id) {
        this.id = id;
    }

    /**
     *
     * @return
     */
    @Override
    public int getId() {
        return id;
    }

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return
     */
    public String getRegion() {
        return region;
    }

    /**
     *
     * @return
     */
    public List<Product> getProducts() {
        return products;
    }

    /**
     *
     * @param product
     */
    public void addProduct(Product product) {
        products.add(product);
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Patient{" + "id=" + id + ", name='" + name + '\'' +  ", region='" + region + '\'' + ", products=" + products + '}';
    }
}

