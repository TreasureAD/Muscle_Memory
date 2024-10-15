package strings_8b;

// Importing Scanner class to take user input
import java.util.Scanner;

// Public class named PasswordValidator
public class PasswordValidator {

    // Instance variables for the username and current password
    private String username;
    private String currentPassword;

    // Variables to track if the proposed password is valid and to store error messages
    private boolean valid;
    private String errorMessage;

    // Static Scanner object for taking user input, created only once for the class
    private static Scanner scanner = new Scanner(System.in);

    // Constructor that initializes the username and currentPassword with given values
    public PasswordValidator(String username, String currentPassword){
        this.username = username;  // Set username
        this.currentPassword = currentPassword;  // Set current password
    }

    // Method to return the current validity state of the proposed password
    public boolean isValid(){
        return valid;  // Return the boolean value of valid
    }

    // Method to return the error message if the password is invalid
    public String getErrorMessage(){
        return errorMessage;  // Return the errorMessage string
    }

    // Method to close the Scanner object when finished
    public void closeScanner(){
        scanner.close();  // Close the Scanner to prevent resource leaks
    }

    // Main method, the entry point of the program
    public static void main(String[] args){
        var validator = login();  // Calls the login() method and stores the result in 'validator'
        validator.printPasswordRules();  // Print the rules for creating a valid password

        // Loop until a valid password is entered
        do{
            // Ask the user for a proposed password and store it
            var proposedPassword = validator.getProposedPassword();

            // Validate and attempt to change the password
            validator.changePassword(proposedPassword);

            // If the password is invalid, print the error message
            if(!validator.isValid()){
                System.out.println(validator.getErrorMessage());
            }

            // Continue looping until the proposed password is valid
        }while(!validator.isValid());

        // If the loop is exited, the proposed password is valid
        System.out.println("The proposed password is valid");

        // Close the Scanner once finished
        validator.closeScanner();
    }

    // Method to handle the login process and return a PasswordValidator object
    public static PasswordValidator login(){
        // Prompt the user to enter their username
        System.out.println("Enter your username:");
        String username = scanner.nextLine();  // Read and store the username

        // Prompt the user to enter their password
        System.out.println("Enter your password:");
        String password = scanner.nextLine();  // Read and store the password

        // Return a new PasswordValidator object initialized with the username and password
        return new PasswordValidator(username, password);
    }

    // Method to print the password rules to the user
    public void printPasswordRules(){
        System.out.println("Your new password must meet the following requirements:");
        System.out.println("* at least 8 characters long");  // Rule 1: Minimum length
        System.out.println("* contain an uppercase letter");  // Rule 2: Uppercase letter
        System.out.println("* contain a special character");  // Rule 3: Special character
        System.out.println("* not contain the username");  // Rule 4: Should not contain the username
        System.out.println("* not the same as the old password");  // Rule 5: Should be different from current password
        System.out.println();  // Print a blank line for readability
    }

    // Method to ask the user for the proposed new password
    public String getProposedPassword(){
        System.out.println("Enter your new password:");  // Prompt the user
        return scanner.nextLine();  // Read and return the proposed password
    }

    // Method to validate and change the password
    public void changePassword(String newPassword){

        // Set valid to true initially (assume the password is valid)
        valid = true;
        errorMessage = "";  // Reset any previous error messages

        // Rule 1: Check if the password is at least 8 characters long
        if(newPassword.length() < 8){
            valid = false;  // Set valid to false if password is too short
            errorMessage += "\n Your password must be at least 8 characters.";  // Add error message
        }

        // Rule 2: Check if the password contains at least one uppercase letter
        // If the password is all lowercase, it's invalid (no uppercase letter)
        if(newPassword.equals(newPassword.toLowerCase())){
            valid = false;  // Set valid to false if no uppercase letter is found
            errorMessage += "\n Your password must include an uppercase letter.";  // Add error message
        }

        // Rule 3: Check if the password contains a special character
        // The regex [a-zA-Z0-9 ]* means the password contains only letters, digits, or spaces
        if(newPassword.matches("[a-zA-Z0-9 ]*")){
            valid = false;  // Set valid to false if no special character is found
            errorMessage += "\n Your password must include a special character (e.g. %,$[:).";  // Add error message
        }

        // Rule 4: Check if the password contains the username (case insensitive)
        if(newPassword.toUpperCase().contains(username.toUpperCase())){
            valid = false;  // Set valid to false if the password contains the username
            errorMessage += "\n Your password cannot contain your username.";  // Add error message
        }

        // Rule 5: Check if the password is the same as the current password
        if(newPassword.equals(currentPassword)){
            valid = false;  // Set valid to false if the new password is the same as the old password
            errorMessage += "\n Your password must be different from your current password.";  // Add error message
        }
    }
}


