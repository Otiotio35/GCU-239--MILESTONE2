package salable;

/**
 * The Armor class represents a type of salable product which is an armor.
 * Armors are derived specializations of Salable Products.
 */
public class Armor extends Salable {
    private String type;

    /**
     * Constructs a new Armor object with the specified properties.
     *
     * @param name        The name of the armor product.
     * @param description A description of the armor product.
     * @param price       The price of the armor product.
     * @param quantity    The quantity of the armor product available in the inventory.
     * @param type        The type of the armor product (e.g., helmet, chestplate, etc.).
     */
    public Armor(String name, String description, double price, int quantity, String type) {
        super(name, description, price, quantity);
        this.type = type;
    }

    /**
     * Gets the type of the armor product.
     *
     * @return The type of the armor.
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the type of the armor product.
     *
     * @param type The type of the armor to set.
     */
    public void setType(String type) {
        this.type = type;
    }
}
