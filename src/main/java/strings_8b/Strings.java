package strings_8b;

public class Strings {

    /*
     * Chapter 8b - Strings
     *
     * Strings are not a primitive data type, and they are not a wrapper class either.
     * A String is an object that represents a sequence of characters.
     * Strings provide many helpful methods for working with them, such as charAt(), contains(), equals(), etc.
     */

    /*
     * Accessing String Elements
     * - A String is essentially a sequence of characters and can be treated like an array of characters.
     * - Use the `charAt()` method to access specific characters in a String.
     * - Strings are zero-indexed, so charAt(0) retrieves the first character.
     */

    // Example of using charAt()
    public class StringMethodsExample {
        public static void main(String[] args) {
            String str = "Hello World";
            System.out.println("Character at index 0: " + str.charAt(0)); // Prints 'H'
            System.out.println("Character at index 6: " + str.charAt(6)); // Prints 'W'
        }
    }

    /*
     * Common String Methods:
     * - contains(): Checks if a String contains a specific sequence of characters.
     * - equals() / equalsIgnoreCase(): Compares two Strings for equality.
     * - startsWith() / endsWith(): Checks if a String starts or ends with a specific substring.
     * - length(): Returns the number of characters in the String.
     */

    // Example using common String methods
    public class CommonStringMethods {
        public static void main(String[] args) {
            String str = "Test Automation University";

            System.out.println("Length of the string: " + str.length()); // Prints the length of the String
            System.out.println("Contains 'Automation': " + str.contains("Automation")); // True
            System.out.println("Starts with 'Test': " + str.startsWith("Test")); // True
            System.out.println("Ends with 'University': " + str.endsWith("University")); // True
        }
    }

    /*
     * String Formatting
     * - You can use String.format() to create formatted strings.
     * - Placeholders like %s (string), %d (integer), and %f (float) allow you to insert values into a string.
     */

    // Example of using String.format()
    public class StringFormattingExample {
        public static void main(String[] args) {
            String name = "Java";
            int version = 17;
            String message = String.format("Welcome to %s version %d!", name, version);
            System.out.println(message); // Prints "Welcome to Java version 17!"
        }
    }

    /*
     * Splitting Strings
     * - The split() method divides a String into an array of substrings based on a specified delimiter.
     * - You can split a String by spaces, commas, or any other delimiter.
     */

    // Example of splitting a String into words
    public class StringSplitExample {
        public static void main(String[] args) {
            String sentence = "I love Test Automation University";
            String[] words = sentence.split(" "); // Split by spaces

            System.out.println("Number of words: " + words.length); // Prints 5
            for (String word : words) {
                System.out.println(word); // Prints each word on a new line
            }
        }
    }

    /*
     * Counting Words in a String
     * - This example shows how to split a String by spaces, count the number of words, and print them.
     */

    // Example of counting words in a String
    public class CountWordsExample {
        public static void main(String[] args) {
            countWords("I love Test Automation University");
        }

        /**
         * Splits a String into an array by tokenizing it.
         * Counts words and prints them
         * @param text Full string to be split
         */
        public static void countWords(String text) {
            var words = text.split(" "); // Split by spaces
            int numberOfWords = words.length; // Count the number of words

            String message = String.format("Your text contains %d words:", numberOfWords); // Format the output message
            System.out.println(message); // Print the message

            // Print each word
            for (int i = 0; i < numberOfWords; i++) {
                System.out.println(words[i]); // Print each word on a new line
            }
        }
    }

    /*
     * Reversing a String
     * - You can reverse a String by iterating through it in reverse order and printing each character.
     */

    // Example of reversing a String
    public class ReverseStringExample {
        public static void main(String[] args) {
            String text = "Hello TAU!";
            reverseString(text);
        }

        public static void reverseString(String text) {
            for (int i = text.length() - 1; i >= 0; i--) {
                System.out.print(text.charAt(i)); // Prints the characters in reverse order
            }
            System.out.println(); // Move to a new line after printing
        }
    }

    /*
     * StringBuilder Class
     * - Strings in Java are immutable, meaning their content cannot be changed.
     * - Use the StringBuilder class when you need to modify a String (e.g., insert, delete, append characters).
     */

    // Example of using StringBuilder to reverse a String
    public class StringBuilderExample {
        public static void main(String[] args) {
            StringBuilder sb = new StringBuilder("Hello TAU!");
            sb.reverse(); // Reverse the StringBuilder content
            System.out.println(sb.toString()); // Convert to String and print
        }
    }

    /*
     * Adding Spaces Before Uppercase Letters
     * - We can modify a String by adding spaces before each uppercase letter using StringBuilder.
     */

    // Example of adding spaces before uppercase letters
    public class AddSpacesExample {
        public static void main(String[] args) {
            addSpaces("HeyWorld!It'sMeAngie");
        }

        /**
         * Adds spaces before each uppercase letter
         * @param text The jumbled text
         */
        public static void addSpaces(String text) {
            var modifiedText = new StringBuilder(text);

            for (int i = 0; i < modifiedText.length(); i++) {
                if (i != 0 && Character.isUpperCase(modifiedText.charAt(i))) {
                    modifiedText.insert(i, " "); // Insert a space before the uppercase letter
                    i++; // Skip past the inserted space
                }
            }

            System.out.println(modifiedText); // Print the modified text
        }
    }


}
