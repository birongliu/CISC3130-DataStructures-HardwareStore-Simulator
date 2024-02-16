import java.util.*;

public class HardwareStore {
    private final ArrayList<Queue<Shopper>> queues;
    private double revenue;
    HardwareStore(int numRegisters) {
        this.revenue = 0;
        this.numRegisters = numRegisters;
        this.queues = new ArrayList<>(numRegisters);
        for(int i = 0; i < numRegisters; i++) {
            this.queues.add(new PriorityQueue<>(Comparator.comparing(Shopper::amountOwed)));
        }
    }
    public void addShopperToLine(Shopper shopper) {
       Queue<Shopper> shortestQueue = this.queues.get(0);
       for(Queue<Shopper> priorityQueue : queues) {
           if(priorityQueue.size() < shortestQueue.size()) {
               shortestQueue = priorityQueue;
           }
           shortestQueue.add(shopper);
       }
    }

    void checkoutAllShopper() {
        for (Queue<Shopper> queue : this.queues) {
            Shopper shopper = queue.poll();
            if (shopper != null) this.revenue += shopper.cart.grandTotal();
        }
    }

    public double totalRevenue() {
        return this.revenue;
    }
}
