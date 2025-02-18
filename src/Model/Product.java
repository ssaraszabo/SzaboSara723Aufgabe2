package Model;

import Repository.Identifiable;

/**
 * Model representing a Medication.
 */
public class Product implements Identifiable {
    private int id;
    private String name;
    private double price;
    private String universum;

    public Product(String name, double price, String universum) {
        this.name = name;
        this.price = price;
        this.universum = universum;
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

    public double getPrice() {
        return price;
    }

    public String getUniversum() {
        return universum;
    }

    @Override
    public String toString() {
        return "Medication{" + "id=" + id + ", name='" + name + '\'' + ", price=" + price + ", universum='" + universum + '\'' + '}';
    }
}