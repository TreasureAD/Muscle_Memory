package interfaces_11b;

// Farm class to test the Animal, Pig, and Duck classes
public class Farm {

    public static void main(String[] args) {

        // Create a Pig object and call its methods
        Pig pig = new Pig();
        pig.makeSound();  // Call the makeSound method for Pig
        pig.eat();  // Call the common eat method from Animal class

        System.out.println();  // Print an empty line for clarity

        // Create a Duck object and call its methods
        Duck duck = new Duck();
        duck.makeSound();  // Call the makeSound method for Duck
        duck.eat();  // Call the common eat method from Animal class
    }
}

