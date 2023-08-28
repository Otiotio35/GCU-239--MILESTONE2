package Menu;

import inventory.InventoryManager;
import salable.Salable;
import shopping.ShoppingCart;
import salable.Weapon;
import salable.Armor;
import salable.Health;

import java.util.Scanner;
/**
 * This class represents a StoreFront that allows users to view an inventory, add items to a shopping cart,
 * view the cart, and complete a checkout process.
 * 
* @version 7/21/2023 ID: 21024608
 * @author toafik otiotio
 */

public class StoreFront {
    private String name;
    private InventoryManager inventoryManager;
    private ShoppingCart shoppingCart;
    private Scanner scanner;

    /**
     * Initializes a new StoreFront with a given name.
     *
     * @param name Name of the store.
     */
    public StoreFront(String name) {
        this.name = name;
        inventoryManager = new InventoryManager();
        shoppingCart = new ShoppingCart();
        scanner = new Scanner(System.in);

        // Call populateInventory before displaying the welcome message or running the menu
        populateInventory();

        displayWelcomeMessage();
        run();
        scanner.close(); // Close the scanner when the program is done
    }

    /**
     * Displays a welcome message to the user.
     */
    public void displayWelcomeMessage() {
        System.out.println("Welcome to " + name + "!");
    }
    /**
     * Displays the main menu of actions that the user can take.
     */
    public void displayMenu() {
        System.out.println("===== Actions =====");
        System.out.println("1. View Inventory");
        System.out.println("2. Add Item to Cart");
        System.out.println("3. View Cart");
        System.out.println("4. Checkout");
        System.out.println("5. Exit");
    }
    /**
     * Main loop for handling user input and navigating the store.
     */
    public void run() {
        while (true) {
            displayMenu();
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    inventoryManager.displayInventory();
                    break;
                case 2:
                    System.out.print("Enter the item name to add to the cart: ");
                    scanner.nextLine(); // Consume the newline character
                    String itemName = scanner.nextLine();
                    Salable item = inventoryManager.getProduct(itemName);
                    if (item != null) {
                        shoppingCart.addItem(item, choice);
                        System.out.println(item.getName() + " added to the cart.");
                    } else {
                        System.out.println("Item not found in the inventory.");
                    }
                    break;
                case 3:
                    shoppingCart.viewCart();
                    break;
                case 4:
                    checkout();
                    break;
                case 5:
                    System.out.println("Thank you for using the StoreFront!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void populateInventory() {
        // Add initial inventory items
        // For demonstration purposes, let's hardcode the inventory
        inventoryManager.addProduct(new Weapon("Sword", "A sharp sword.", 25.0, 5, "One-Handed"));
        inventoryManager.addProduct(new Weapon("Axe", "A heavy axe.", 30.0, 3, "Two-Handed"));
        inventoryManager.addProduct(new Armor("Helmet", "A protective helmet.", 15.0, 10, "Head"));
        inventoryManager.addProduct(new Armor("Chestplate", "A sturdy chestplate.", 40.0, 7, "Chest"));
        inventoryManager.addProduct(new Health("PainKiller", "A healing potion.", 10.0, 20, 50));
    }

	private void checkout() {
        System.out.println("===== Checkout =====");
        shoppingCart.viewCart();
        double totalPrice = shoppingCart.getTotalPrice();
        if (totalPrice > 0) {
            System.out.println("Total Price: $" + totalPrice);
            System.out.print("Confirm checkout (y/n): ");
            String confirm = scanner.next().toLowerCase();
            if (confirm.equals("y")) {
                System.out.println("Checkout completed!");
                shoppingCart.clearCart();
            } else {
                System.out.println("Checkout canceled.");
            }
        } else {
            System.out.println("Cart is empty. Nothing to checkout.");
        }
    }
    /**
     * The main method to start the StoreFront application.
     *
     * @param args Command-line arguments.
     */
	public static void main(String[] args) {
	    StoreFront storeFront2 = new StoreFront("Your Store");
	}
	}
