package dayOfTheWeek_7c;

import java.util.Scanner;

public class DayOfTheWeek { // Defines the class DayOfTheWeek

    // Main method - Entry point of the program
    public static void main(String args[]){

        // Declares and initializes an array of strings representing the days of the week
        String[] week = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        // Creates a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Prompts the user to enter a number representing the day of the week
        System.out.println("Enter a number for the day of the week");

        // Reads the user's input as an integer and stores it in the variable 'index'
        int index = input.nextInt();

        // Closes the Scanner object to prevent resource leaks
        input.close();

        // Prints the corresponding day from the 'week' array
        // The array is zero-indexed, so subtract 1 from the user's input to get the correct day
        System.out.println("Corresponding day: " + week[index - 1]);
    }
}

