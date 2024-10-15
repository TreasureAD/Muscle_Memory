package overloading_9c;

// Subclass of Cake representing a Birthday Cake
public class BirthdayCake extends Cake {

    // Instance variable for the number of candles
    private int candles;

    // Constructor that sets the flavor of the birthday cake
    public BirthdayCake(String flavor) {
        super(flavor);  // Call the constructor of the Cake superclass to set flavor
        this.candles = 0;  // Default number of candles is 0
    }

    // Getter method for the number of candles
    public int getCandles() {
        return candles;  // Return the number of candles
    }

    // Setter method for the number of candles
    public void setCandles(int candles) {
        this.candles = candles;  // Set a new number of candles
    }
}

