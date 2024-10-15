package interfaces_11b;

// Subclass of Animal representing a Duck
public class Duck extends Animal {

    // Implementation of the abstract method makeSound specific to Duck
    @Override
    public void makeSound() {
        System.out.println("The duck says: Quack Quack!");  // Print the sound that a duck makes
    }
}

