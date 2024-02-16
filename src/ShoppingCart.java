import java.util.LinkedList;
import java.util.List;

public class ShoppingCart {
    public List<Item> items = new LinkedList<>();

    public void addItem(Item item) {
        this.items.add(item);
    }

    public int grandTotal() {
        double total = 0;
        for (Item item : this.items) {
            total += item.getPrice();
        }
        return (int) total;
    }

    public int numItems() {
        return this.items.size();
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "items=" + items +
                '}';
    }
}
