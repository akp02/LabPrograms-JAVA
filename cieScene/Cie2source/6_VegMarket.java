import java.util.ArrayList;
/*6. Write a simulation program for the vegetable market. 
The farmer will be able to produce different types of vegetables and put them in the market to sell. 
The market has limited capacity and farmers must wait if the capacity is exceeded to sell their vegetables. 
Consumers can come to the market and purchase their desired vegetable if available; 
and if the vegetable they want to buy runs out, they are willing to wait until the supply of that kind is ready. */
class Market {
    private ArrayList<String> vegetables = new ArrayList<>(); 
    private int vegetablesNumber;
    // make a constructor to get set the vegetable number on initializing the market
    public Market(int vegetablesNumber) {
        if (vegetablesNumber > 0) {
            this.vegetablesNumber = vegetablesNumber;
        } 
        else {
            throw new IllegalArgumentException("This argument is not valid");
        }
    } // end of the constructor
    // check if there is no place or its full // 
    private synchronized boolean isFull() {
        return vegetables.size() == this.vegetablesNumber; 
    }
    private synchronized boolean isEmpty() { 
        return vegetables.isEmpty();
    }
    // consumer and producer methods // the main program // 
    public synchronized void farmer(String vegetable) {
        if (isFull()) { 
            System.out.println("We can not accept more vegetables at the moment !!");
            try {
                wait();
            }
            catch (InterruptedException e) { 
                System.out.println("Interruption"); 
            }
        }
        vegetables.add(vegetable);
        System.out.printf("vegetable : %s is added !!!%n", vegetable); 
    }
    public synchronized String consumer() {
        if (isEmpty()) {
            System.out.println("we don't have any goods yet"); 
            try {
                wait();// program doesn't end on its own, because of this
                //IF ASKED by ma'am tell: we need wait() as both farmer and consumer are SYNCHRONISED
            } 
            catch (InterruptedException e) {
                System.out.println("interruption occured !!!"); 
            }
        }
            String currentVegetableRequested = vegetables.remove(0); 
            notifyAll();
            return currentVegetableRequested;
    }
}

/**
 * InnerMarket
 */
public class VegMarket {
    public static void main(String[] args) {
            Market sm = new Market(25);
            sm.farmer("onion");
            sm.farmer("cucumber");
            sm.farmer("potato");
            sm.farmer("brinjal");
            sm.consumer();
            sm.consumer();
            sm.consumer();
            sm.consumer();
            sm.consumer();
        }
    
}