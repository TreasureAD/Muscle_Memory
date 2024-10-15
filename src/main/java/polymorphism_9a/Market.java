package polymorphism_9a;

// Market class to test polymorphism by creating several variations of fruits
public class Market {

    public static void main(String[] args) {

        // Create an Apple object and call its methods
        Apple apple = new Apple();
        System.out.println("Apple has " + apple.getCalories() + " calories.");
        apple.removeSeeds();  // Call Apple specific method
        apple.makeJuice();  // Call overridden method for making Apple juice

        System.out.println();  // Print an empty line for clarity

        // Create a Banana object and call its methods
        Banana banana = new Banana();
        System.out.println("Banana has " + banana.getCalories() + " calories.");
        banana.peel();  // Call Banana specific method
        banana.makeJuice();  // Call overridden method for making Banana juice

        System.out.println();  // Print an empty line for clarity

        // Demonstrate polymorphism: Fruit can hold both Apple and Banana objects
        Fruit genericFruit = new Apple();  // Assign an Apple object to a Fruit reference
        genericFruit.makeJuice();  // Call the overridden method for Apple

        genericFruit = new Banana();  // Assign a Banana object to the same Fruit reference
        genericFruit.makeJuice();  // Call the overridden method for Banana
    }
}

