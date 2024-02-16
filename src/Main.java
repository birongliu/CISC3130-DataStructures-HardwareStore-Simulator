import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
       HardwareStore hardwareStore = new HardwareStore(1);
       Scanner scanner = new Scanner(new File("events.text"));
       while (scanner.hasNextLine()) {
           String firstName = scanner.next();
           String lastName = scanner.next();
           int amountOfItem = scanner.nextInt();
           String itemName = scanner.next();
           double itemCost = scanner.nextDouble();
           Shopper shopper = new Shopper(firstName, lastName);
           shopper.addItemToCart(new Item(itemName, itemCost), amountOfItem);
           hardwareStore.addShopperToLine(shopper);
           hardwareStore.checkoutAllShopper();
       }
       System.out.println(hardwareStore.totalRevenue());
    }
}