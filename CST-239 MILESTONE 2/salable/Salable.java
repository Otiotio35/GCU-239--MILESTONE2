package salable;


/**
 * The Salable class represents a product that can be sold.
 * This is a base class for all salable products in the store.
 */
public class Salable {
    private String name;
    private String description;
    private double price;
    private int quantity;

    /**
     * Constructs a new Salable product with the specified details.
     *
     * @param name        The name of the product.
     * @param description The description of the product.
     * @param price       The price of the product.
     * @param quantity    The quantity of the product.
     */
    public Salable(String name, String description, double price, int quantity) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
    }

    /**
     * Get the name of the product.
     *
     * @return The name of the product.
     */
    public String getName() {
        return name;
    }

    /**
     * Get the description of the product.
     *
     * @return The description of the product.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Get the price of the product.
     *
     * @return The price of the product.
     */
    public double getPrice() {
        return price;
    }

    /**
     * Set the price of the product.
     *
     * @param price The new price of the product.
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Get the quantity of the product.
     *
     * @return The quantity of the product.
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Set the quantity of the product.
     *
     * @param quantity The new quantity of the product.
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
