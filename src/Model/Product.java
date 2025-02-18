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

    /**
     *
     * @param name
     * @param price
     * @param universum
     */
    public Product(String name, double price, String universum) {
        this.name = name;
        this.price = price;
        this.universum = universum;
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
    public double getPrice() {
        return price;
    }

    /**
     *
     * @return
     */
    public String getUniversum() {
        return universum;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Medication{" + "id=" + id + ", name='" + name + '\'' + ", price=" + price + ", universum='" + universum + '\'' + '}';
    }
}