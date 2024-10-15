package overloading_9c;

// Superclass Cake that holds common attributes for all cakes
public class Cake {

    // Instance variables for cake's flavor and price
    private String flavor;
    private double price;

    // Constructor that initializes the cake with a flavor
    public Cake(String flavor) {
        this.flavor = flavor;  // Set the flavor of the cake
        this.price = 0.0;  // Default price is set to 0.0
    }

    // Getter method for flavor
    public String getFlavor() {
        return flavor;  // Return the flavor of the cake
    }

    // Setter method for flavor
    public void setFlavor(String flavor) {
        this.flavor = flavor;  // Set a new flavor for the cake
    }

    // Getter method for price
    public double getPrice() {
        return price;  // Return the price of the cake
    }

    // Setter method for price
    public void setPrice(double price) {
        this.price = price;  // Set a new price for the cake
    }
}

