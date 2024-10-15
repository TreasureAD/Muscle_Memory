package polymorphism_9a;

// Subclass of Fruit representing a Banana
public class Banana extends Fruit {

    // Constructor that sets the calories for Banana
    public Banana() {
        setCalories(105);  // Bananas typically have 105 calories
    }

    // Method specific to Banana: peeling the banana
    public void peel() {
        System.out.println("The banana is peeled.");  // Print message indicating banana is peeled
    }

    // Override makeJuice method to provide specific juice message for Banana
    @Override
    public void makeJuice() {
        System.out.println("Banana smoothie is made.");  // Print a specific message for Banana juice (smoothie)
    }
}

