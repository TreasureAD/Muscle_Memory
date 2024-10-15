package interfaces_11b;

// Subclass of Animal representing a Pig
public class Pig extends Animal {

    // Implementation of the abstract method makeSound specific to Pig
    @Override
    public void makeSound() {
        System.out.println("The pig says: Oink Oink!");  // Print the sound that a pig makes
    }
}

