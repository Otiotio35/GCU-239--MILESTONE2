package inventory;

import salable.Salable;
import java.util.HashMap;
import java.util.Map;

/**
 * This class represents an inventory manager which handles
 * operations related to adding, removing, purchasing, and displaying
 * products.
 * 
 * @version 7/21/2023 ID: 21024608
 * @author toafik otiotio
 */
public class InventoryManager {

    /** Holds the products with their names as keys. */
    private Map<String, Salable> products;

    /**
     * Constructs an empty InventoryManager.
     */
    public InventoryManager() {
        this.products = new HashMap<>();
    }

    /**
     * Adds a product to the inventory.
     *
     * @param product The product to be added.
     */
    public void addProduct(Salable product) {
        products.put(product.getName().toLowerCase(), product);
    }

    /**
     * Removes a product from the inventory.
     *
     * @param product The product to be removed.
     */
    public void removeProduct(Salable product) {
        products.remove(product.getName().toLowerCase());
    }

    /**
     * Fetches a product from the inventory based on its name.
     *
     * @param name The name of the product to retrieve.
     * @return The product if found, or null otherwise.
     */
    public Salable getProduct(String name) {
        return products.get(name.toLowerCase());
    }

    /**
     * Attempts to purchase a specific quantity of a product.
     * Reduces the product's quantity if successful.
     *
     * @param name The name of the product to purchase.
     * @param quantity The quantity to purchase.
     * @return true if the purchase is successful, false otherwise.
     */
    public boolean purchaseProduct(String name, int quantity) {
        Salable product = getProduct(name);
        if (product != null && product.getQuantity() >= quantity) {
            product.setQuantity(product.getQuantity() - quantity);
            return true;
        }
        return false;
    }

    /**
     * Cancels the purchase of a product, increasing its quantity.
     *
     * @param name The name of the product.
     * @param quantity The quantity to cancel.
     * @return true if the cancellation is successful, false otherwise.
     */
    public boolean cancelPurchase(String name, int quantity) {
        Salable product = getProduct(name);
        if (product != null) {
            product.setQuantity(product.getQuantity() + quantity);
            return true;
        }
        return false;
    }

    /**
     * Displays the current inventory with product details.
     */
    public void displayInventory() {
        System.out.println("Current Inventory:");
        System.out.printf("%-15s %-30s %-10s %-8s%n", "Name", "Description", "Price", "Quantity");
        for (Salable product : products.values()) {
            System.out.printf("%-15s %-30s $%-9.2f %-8d%n", product.getName(), product.getDescription(),
                    product.getPrice(), product.getQuantity());
        }
    }
}
