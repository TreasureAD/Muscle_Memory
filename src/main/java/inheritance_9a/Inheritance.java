package inheritance_9a;

public class Inheritance {

    /*
     * Chapter 9a - Inheritance
     *
     * Inheritance is one of the four major principles of object-oriented programming (OOP):
     * - Encapsulation (covered earlier)
     * - Inheritance (this chapter)
     * - Polymorphism
     * - Abstraction
     *
     * Inheritance allows one class (the child or subclass) to inherit fields and methods from another class (the parent or superclass).
     * This promotes code reuse and creates an "is-a" relationship between classes.
     *
     * Terminology:
     * - Parent class = Superclass
     * - Child class = Subclass
     *
     * Inheritance helps avoid redundancy, enabling child classes to reuse code from their parent classes.
     * Example: An Employee class can inherit common properties like name, age, and gender from a Person class.
     */

    /*
     * Example: The Person class serves as the parent class.
     * The Employee class will inherit from it using the `extends` keyword.
     */

// Person class (Superclass)
    public class Person {
        private String name; // Field for storing a person's name
        private int age; // Field for storing a person's age
        private String gender; // Field for storing a person's gender

        // Getter and Setter for name
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        // Getter and Setter for age
        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        // Getter and Setter for gender
        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }
    }

    /*
     * The Employee class is a more specific form of a Person.
     * It inherits common attributes from the Person class and adds new ones like employeeId and title.
     */

// Employee class (Subclass)

    public class Employee extends Person {
        private String employeeId; // Field for storing employee ID
        private String title; // Field for storing job title

        // Getter and Setter for employeeId
        public String getEmployeeId() {
            return employeeId;
        }

        public void setEmployeeId(String employeeId) {
            this.employeeId = employeeId;
        }

        // Getter and Setter for title
        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }
    }

    /*
     * Inheritance in Action:
     * Let's create an instance of Person and Employee, and demonstrate how the Employee class
     * has access to fields and methods inherited from Person, as well as its own fields and methods.
     */

    // Inheritance Tester
    public class InheritanceTester {
        public static void main(String[] args) {
            // Creating a Person object and setting its properties
            Person person = new Person();
            person.setName("John Doe");
            person.setAge(30);
            person.setGender("Male");

            // Output Person details
            System.out.println("Person: " + person.getName() + ", " + person.getAge() + " years old, " + person.getGender());

            // Creating an Employee object and setting properties from both Person and Employee
            Employee employee = new Employee();
            employee.setName("Jane Doe"); // Inherited from Person
            employee.setAge(25); // Inherited from Person
            employee.setGender("Female"); // Inherited from Person
            employee.setEmployeeId("EMP123"); // Specific to Employee
            employee.setTitle("Software Engineer"); // Specific to Employee

            // Output Employee details
            System.out.println("Employee: " + employee.getName() + ", " + employee.getAge() + " years old, " + employee.getGender()
                    + ", ID: " + employee.getEmployeeId() + ", Title: " + employee.getTitle());
        }
    }

    /*
     * Explanation:
     * - The Employee class inherits all the fields and methods of the Person class.
     * - The Employee class adds its own fields (employeeId, title) and their respective getters and setters.
     * - We don't need to duplicate code from Person, as Employee "is a" Person.
     */


}
