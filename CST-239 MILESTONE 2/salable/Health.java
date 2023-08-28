package salable;

/**
 * The Health class represents a type of salable product which is related to health.
 * Health is a derived specialization of Salable Products.
 */
public class Health extends Salable {
    private int power;

    /**
     * Constructs a new Health object with the specified properties.
     *
     * @param name        The name of the health product.
     * @param description A description of the health product.
     * @param price       The price of the health product.
     * @param quantity    The quantity of the health product available in the inventory.
     * @param power       The health power of the health product.
     */
    public Health(String name, String description, double price, int quantity, int power) {
        super(name, description, price, quantity);
        this.power = power;
    }

    /**
     * Gets the health power of the health product.
     *
     * @return The health power.
     */
    public int getPower() {
        return power;
    }

    /**
     * Sets the health power of the health product.
     *
     * @param power The health power to set.
     */
    public void setPower(int power) {
        this.power = power;
    }
}
