package salable;

/**
 * The Weapon class represents a type of salable product which is a weapon.
 * Weapons are derived specializations of Salable Products.
 */
public class Weapon extends Salable {
    private String type;

    /**
     * Constructs a new Weapon object with the specified properties.
     *
     * @param name        The name of the weapon product.
     * @param description A description of the weapon product.
     * @param price       The price of the weapon product.
     * @param quantity    The quantity of the weapon product available in the inventory.
     * @param type        The type of the weapon product (e.g., sword, bow, etc.).
     */
    public Weapon(String name, String description, double price, int quantity, String type) {
        super(name, description, price, quantity);
        this.type = type;
    }

    /**
     * Gets the type of the weapon product.
     *
     * @return The type of the weapon.
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the type of the weapon product.
     *
     * @param type The type of the weapon to set.
     */
    public void setType(String type) {
        this.type = type;
    }
}
