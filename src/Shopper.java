public class Shopper implements Comparable<Shopper> {
    public String firstName;
    public String lastName;
    public ShoppingCart cart;

    Shopper(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.cart = new ShoppingCart();
    }
    @Override
    public int compareTo(Shopper o) {
        return this.amountOwed() - o.amountOwed();
    }

    public void addItemToCart(Item item, int numItems) {
       for(int i = 0; i < numItems; i++) {
           this.cart.addItem(item);
       }
    }

    public int amountOwed() {
        double taxRate = 8.875 / 100;
        double totalWithTax = this.cart.grandTotal() + (this.cart.grandTotal() * taxRate);
        return (int) Math.ceil(totalWithTax * 100);
    }

    @Override
    public String toString() {
        return "Shopper{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", cart=" + cart +
                '}';
    }
}
