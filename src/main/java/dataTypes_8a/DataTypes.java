package dataTypes_8a;

public class DataTypes {

    /*
     * Chapter 8a - Data Types in Java
     *
     * Java is a statically typed programming language.
     * Statically typed languages check data types at compile-time.
     * This means variables must be declared with a specific type before they can be assigned a value.
     */

    /*
     * Dynamically Typed vs Statically Typed
     * - Dynamically typed languages determine the data type of a variable at runtime.
     * - Java is statically typed, so variables must be declared before being used.
     */

    /*
     * Local Variable Type Inference (Java 10+)
     * - Java 10 introduced the 'var' keyword, allowing the compiler to infer the data type based on the assigned value.
     * - Type inference applies only to local variables, not global variables or method parameters.
     */

    // Example of using var for local variables
    public class TypeInferenceExample {
        public static void main(String[] args) {
            // Using 'var' for type inference
            var number = 10; // Java infers the type as int
            var message = "Hello"; // Java infers the type as String

            System.out.println("Number: " + number);
            System.out.println("Message: " + message);

            // Before Java 10, the above code would have been written like this:
            // int number = 10;
            // String message = "Hello";
        }
    }

    /*
     * Primitive Data Types
     * - Java provides 8 primitive data types:
     *   1. byte   - 1 byte
     *   2. short  - 2 bytes
     *   3. int    - 4 bytes
     *   4. long   - 8 bytes
     *   5. float  - 4 bytes (floating-point numbers)
     *   6. double - 8 bytes (floating-point numbers)
     *   7. char   - 2 bytes (Unicode character)
     *   8. boolean - 1 bit (true or false)
     */

    // Example of primitive data types
    public class PrimitiveDataTypes {
        public static void main(String[] args) {
            int number = 10; // int is 4 bytes
            double price = 19.99; // double is 8 bytes
            boolean isJavaFun = true; // boolean is 1 bit

            System.out.println("Number: " + number);
            System.out.println("Price: " + price);
            System.out.println("Is Java Fun? " + isJavaFun);
        }
    }

    /*
     * Wrapper Classes
     * - Each primitive data type has a corresponding wrapper class.
     * - These wrapper classes allow primitive types to be treated as objects.
     * - Wrapper classes are useful when working with collections or when you need methods associated with the type.
     *   - int -> Integer
     *   - double -> Double
     *   - boolean -> Boolean
     */

    // Example using wrapper classes
    public class WrapperClasses {
        public static void main(String[] args) {
            int primitiveInt = 5; // primitive int
            Integer wrapperInt = 5; // wrapper Integer

            double primitiveDouble = 9.99; // primitive double
            Double wrapperDouble = 9.99; // wrapper Double

            // Use wrapper class methods
            System.out.println("Integer max value: " + Integer.MAX_VALUE);
            System.out.println("Double min value: " + Double.MIN_VALUE);

            // Convert double to int using a wrapper method
            System.out.println("Converted to int: " + wrapperDouble.intValue());
        }
    }

    /*
     * Type Inference Rules:
     * - Type inference only works for local variables (i.e., inside methods).
     * - Variables must be initialized at the time of declaration when using 'var'.
     * - You cannot use 'var' in method parameters or return types.
     */

// Example of invalid usage of 'var'
// public void myMethod(var x) { // This will cause an error
// }

    public class ValidTypeInference {
        public static void main(String[] args) {
            // var must be initialized
            var greeting = "Hello, World!";
            System.out.println(greeting);

            // This will cause an error: var uninitialized
            // var uninitialized;
        }
    }

    /*
     * Type inference and complex data types:
     * - With type inference, the type of the variable is inferred based on the assigned value,
     *   which is particularly useful for complex types like multidimensional arrays.
     */

    // Example of type inference with complex data types
    public class ComplexTypeInference {
        public static void main(String[] args) {
            // Using 'var' for a two-dimensional array
            var matrix = new int[][]{{1, 2}, {3, 4}};

            // Iterating through the array
            for (var row : matrix) {
                for (var element : row) {
                    System.out.print(element + " ");
                }
                System.out.println();
            }
        }
    }

    /*
     * Summary:
     * - Java is a statically typed language, meaning data types must be declared explicitly.
     * - Java 10 introduced local variable type inference (var), which simplifies the code.
     * - Primitive data types are the most basic types in Java, while wrapper classes allow primitive types to be treated as objects.
     * - Use wrapper classes when working with collections or when you need to use methods like converting or comparing values.
     */


}
