package interfaces_11b;

// Abstract class Animal that contains common behaviors for all animals
public abstract class Animal {

    // Abstract method makeSound, which will be implemented by subclasses
    public abstract void makeSound();

    // Non-abstract method eat, which is common for all animals
    public void eat() {
        System.out.println("This animal is eating.");  // Print a generic message for eating
    }
}

