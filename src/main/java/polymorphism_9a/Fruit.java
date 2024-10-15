package polymorphism_9a;

// Superclass Fruit that holds common attributes for all fruits
public class Fruit {

    // Instance variable for calories
    private int calories;

    // Method to set the calories of the fruit
    public void setCalories(int calories) {
        this.calories = calories;  // Set the number of calories for the fruit
    }

    // Getter method for calories
    public int getCalories() {
        return calories;  // Return the number of calories
    }

    // Method to make juice, this will be overridden in subclasses
    public void makeJuice() {
        System.out.println("Juice is made.");  // Print generic message for making juice
    }
}

