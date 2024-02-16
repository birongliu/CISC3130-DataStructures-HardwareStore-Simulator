# HardwareStore Simulator

This is a simple simulator for a hardware store. It models the store, the shoppers, and the items they can purchase. This simulator is part of a data structures class and demonstrates the use of `ArrayList` and `PriorityQueue` data structures in Java.

## Classes

The simulator includes the following classes:

- `Item`: Represents an item for sale in the hardware store.
- `Shopper`: Represents a shopper in the hardware store. Each shopper has a shopping cart total and can be added to a line to check out.
- `HardwareStore`: Represents the hardware store. The store has a list of items for sale, a total revenue, and a priority queue of shoppers ordered by their shopping cart total.

## Data Structures

The simulator uses the following data structures:

- `ArrayList`: This is a resizable array implementation of the `List` interface in Java. It provides efficient methods for adding, removing, and accessing elements. In the simulator, `ArrayList` is used to store the list of items in the `HardwareStore` class and the list of registers.
- `PriorityQueue`: This is a specialized queue implementation in Java that orders elements according to their natural ordering or a custom comparator. It provides efficient methods for inserting elements and retrieving and removing the element with the highest priority. In the simulator, `PriorityQueue` is used to manage the line of shoppers in the `HardwareStore` class, with shoppers ordered by their shopping cart total.

These data structures are well-suited to the tasks they're being used for in the simulator, and understanding how they work is a fundamental part of the data structures class.

## Usage

To use the simulator, create instances of the `Shopper` and `Item` classes and add them to an instance of the `HardwareStore` class. Then, use the `addShopperToLine` method to add shoppers to the line and the `checkoutAllShoppers` method to process all shoppers in the line.

Here's a basic example:

```java
HardwareStore store = new HardwareStore(3); // Create a store with 3 registers
Shopper shopper1 = new Shopper(); // Create a shopper
store.addShopperToLine(shopper1); // Add the shopper to the line
store.checkoutAllShoppers(); // Process all shoppers in the line
double revenue = store.totalRevenue(); // Get the total revenue