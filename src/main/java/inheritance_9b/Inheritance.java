/*
 * Chapter 9b - Constructors in Inheritance
 *
 * Constructors in inheritance work in a specific way:
 * - When a subclass object is created, it first calls the constructor of the superclass before executing its own constructor.
 * - Even if we do not explicitly define constructors, Java implicitly creates default constructors.
 * - You can use the `super()` keyword to call a specific constructor from the superclass.
 *
 * Rules:
 * 1. The superclass constructor is always called before the subclass constructor.
 * 2. If the superclass has multiple constructors, the subclass can choose which one to call using `super()`.
 * 3. Explicit calls to `super()` must be the first statement in the subclass constructor.
 * 4. If the superclass does not have a default constructor, the subclass must explicitly call one of its other constructors.
 */

// Person class (Superclass) with multiple constructors
package inheritance_9b;

public class Person {
    private String name;
    private int age;
    private String gender;

    // Default constructor
    public Person() {
        System.out.println("In Person default constructor");
    }

    // Constructor with one parameter
    public Person(String name) {
        this.name = name;
        System.out.println("In Person constructor with name: " + name);
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}

/*
 * The Employee class extends Person.
 * - It can either call the default constructor of Person or a specific constructor using `super()`.
 */

// Employee class (Subclass)


public class Employee extends Person {

    // Default constructor, which calls a specific constructor of Person using super()
    public Employee() {
        super("Angie"); // Calls the Person constructor with the name parameter
        System.out.println("In Employee default constructor");
    }

    // Additional fields specific to Employee
    private String employeeId;
    private String title;

    // Getters and Setters for Employee-specific fields
    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}

/*
 * Testing Constructors in Inheritance:
 * This class demonstrates how constructors in inheritance work.
 * When an Employee object is created, it first calls the Person constructor (via super) before executing its own.
 */

// InheritanceTester class
public class InheritanceTester {
    public static void main(String[] args) {
        // Create an Employee object
        Employee employee = new Employee(); // This will invoke the Employee constructor and call the Person constructor using super()

        // Output inherited Person properties and Employee-specific properties
        employee.setAge(30); // Inherited from Person
        employee.setGender("Female"); // Inherited from Person
        employee.setEmployeeId("EMP123"); // Specific to Employee
        employee.setTitle("Manager"); // Specific to Employee

        System.out.println("Employee: " + employee.getName() + ", Age: " + employee.getAge()
                + ", Gender: " + employee.getGender() + ", ID: " + employee.getEmployeeId() + ", Title: " + employee.getTitle());
    }
}

/*
 * Explanation:
 * - The Employee constructor uses `super("Angie")` to call the Person constructor that takes a name as a parameter.
 * - The Person constructor runs first, and then the Employee constructor is executed.
 * - If the superclass does not have a default constructor, the subclass must explicitly call one of the superclass's other constructors.
 */
