StoreFront App
StoreFront lets users engage with a virtual store. Users can browse the store's inventory, add products to their cart, see their cart, and check out.

Features
View Inventory: Users can view the store's inventory and details.
Add Item to Cart: Users can add inventory items to their cart.
View Cart: Users can see their shopping cart's goods, names, descriptions, prices, and quantities.
Checkout: The checkout procedure displays the total cart price and clears the basket following confirmation.
Exit: App users can exit.

Packages and Classes
Menu contains the primary application's StoreFront class. It manages navigation and user interactions.
Store inventory is managed by the InventoryManager class. It allows adding, removing, buying, and displaying products.
The ShoppingCart class represents the user's shopping cart. It calculates total pricing, manages things added, and handles checkout.
Salable: All salable products' base class. Name, description, price, and quantity are included.
Weapon, Armor, Health: Derived classes representing specific types of products, extending the Salable class and adding type-specific attributes

Usage
View Inventory: Select 1 to view store inventory.
Add Item to Cart: Choose option 2 to add items to your shopping cart by selecting from the inventory.
View Cart: Select option 3 to display your shopping cart and total pricing.
Checkout: Select option 4 to confirm and clear the cart.
Exit: Select option 5 to quit the app.
