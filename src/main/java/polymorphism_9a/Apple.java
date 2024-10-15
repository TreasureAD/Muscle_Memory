package polymorphism_9a;

// Subclass of Fruit representing an Apple
public class Apple extends Fruit {

    // Constructor that sets the calories for Apple
    public Apple() {
        setCalories(95);  // Apples typically have 95 calories
    }

    // Method specific to Apple: removing seeds
    public void removeSeeds() {
        System.out.println("Seeds are removed from the apple.");  // Print message indicating seeds have been removed
    }

    // Override makeJuice method to provide specific juice message for Apple
    @Override
    public void makeJuice() {
        System.out.println("Apple juice is made.");  // Print a specific message for Apple juice
    }
}

