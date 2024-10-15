package overloading6d; // Defines the package this class belongs to

public class PhoneBill {

    // Fields to store the phone bill's details
    private int id; // Stores the ID of the phone bill
    private double baseCost; // Stores the base cost of the phone bill
    private int allottedMinutes; // Stores the number of minutes included in the plan
    private int minutesUsed; // Stores the number of minutes used

    // Default constructor: Initializes the phone bill with default values
    public PhoneBill() {
        id = 0; // Sets default ID to 0
        baseCost = 79.99; // Sets default base cost to 79.99
        allottedMinutes = 800; // Sets default allotted minutes to 800
        minutesUsed = 800; // Sets default minutes used to 800
    }

    // Constructor with 1 parameter: Initializes the phone bill with a specific ID
    public PhoneBill(int id) {
        this.id = id; // Sets the ID to the provided value
        baseCost = 79.99; // Sets default base cost to 79.99
        allottedMinutes = 800; // Sets default allotted minutes to 800
        minutesUsed = 800; // Sets default minutes used to 800
    }

    // Constructor with 4 parameters: Initializes the phone bill with custom values
    public PhoneBill(int id, double baseCost, int allottedMinutes, int minutesUsed) {
        this.id = id; // Sets the ID to the provided value
        this.baseCost = baseCost; // Sets the base cost to the provided value
        this.allottedMinutes = allottedMinutes; // Sets the allotted minutes to the provided value
        this.minutesUsed = minutesUsed; // Sets the minutes used to the provided value
    }

    // Getter method for ID
    public int getId() {
        return id; // Returns the ID of the phone bill
    }

    // Setter method for ID
    public void setId(int id) {
        this.id = id; // Sets the ID of the phone bill
    }

    // Getter method for base cost
    public double getBaseCost() {
        return baseCost; // Returns the base cost of the phone bill
    }

    // Setter method for base cost
    public void setBaseCost(double baseCost) {
        this.baseCost = baseCost; // Sets the base cost of the phone bill
    }

    // Getter method for allotted minutes
    public int getAllottedMinutes() {
        return allottedMinutes; // Returns the number of allotted minutes
    }

    // Setter method for allotted minutes
    public void setAllottedMinutes(int minutes) {
        allottedMinutes = minutes; // Sets the number of allotted minutes
    }

    // Getter method for minutes used
    public int getMinutesUsed() {
        return minutesUsed; // Returns the number of minutes used
    }

    // Setter method for minutes used
    public void setMinutesUsed(int minutes) {
        minutesUsed = minutes; // Sets the number of minutes used
    }

    // Method to calculate overage fees
    public double calculateOverage() {
        if (minutesUsed <= allottedMinutes) {
            return 0; // If minutes used is less than or equal to allotted minutes, no overage fee
        }

        double overageRate = 0.25; // Overage fee per extra minute
        double overageMinutes = minutesUsed - allottedMinutes; // Calculate extra minutes used
        return overageMinutes * overageRate; // Calculate and return total overage fee
    }

    // Method to calculate tax based on the base cost and overage fee
    public double calculateTax() {
        double taxRate = 0.15; // Tax rate is 15%
        return taxRate * (baseCost + calculateOverage()); // Calculate and return tax amount
    }

    // Method to calculate the total bill
    public double calculateTotal() {
        return baseCost + calculateOverage() + calculateTax(); // Return total cost including base cost, overage, and tax
    }

    // Method to print an itemized bill
    public void printItemizedBill() {
        System.out.println("ID: " + id); // Print the ID of the bill
        System.out.println("Base Rate: $" + baseCost); // Print the base cost
        System.out.println("Overage Fee: $" + String.format("%.2f", calculateOverage())); // Print the overage fee, formatted to 2 decimal places
        System.out.println("Tax: $" + String.format("%.2f", calculateTax())); // Print the tax amount, formatted to 2 decimal places
        System.out.println("Total: $" + String.format("%.2f", calculateTotal())); // Print the total cost, formatted to 2 decimal places
    }
}

