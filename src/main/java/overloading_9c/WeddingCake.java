package overloading_9c;

// Subclass of Cake representing a Wedding Cake
public class WeddingCake extends Cake {

    // Instance variable for the number of tiers
    private int tiers;

    // Constructor that sets the flavor of the wedding cake
    public WeddingCake(String flavor) {
        super(flavor);  // Call the constructor of the Cake superclass to set flavor
        this.tiers = 0;  // Default number of tiers is 0
    }

    // Getter method for the number of tiers
    public int getTiers() {
        return tiers;  // Return the number of tiers
    }

    // Setter method for the number of tiers
    public void setTiers(int tiers) {
        this.tiers = tiers;  // Set a new number of tiers
    }
}

