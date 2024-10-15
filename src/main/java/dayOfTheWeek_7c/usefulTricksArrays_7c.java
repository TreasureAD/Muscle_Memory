package dayOfTheWeek_7c;

import java.util.Scanner;

public class usefulTricksArrays_7c {

    // Static array to hold the grades entered by the user
    private static int grades[];

    // Static Scanner object to read input from the user
    private static Scanner scanner = new Scanner(System.in);

    // Method to prompt the user to enter grades and populate the grades array
    public static void getGrades(){
        // Loop to collect each grade from the user
        for(int i=0; i<grades.length; i++){
            System.out.println("Enter grade #" + (i+1)); // Prompt the user to enter the next grade
            grades[i] = scanner.nextInt(); // Store the entered grade in the array at position i
        }
    }

    // Method to calculate the sum of all grades
    public static int calculateSum(){
        int sum = 0; // Initialize the sum to 0
        // Loop through each grade in the grades array and add it to the sum
        for(int grade : grades){
            sum = sum + grade;
        }
        return sum; // Return the total sum of the grades
    }

    // Method to calculate the average of the grades
    public static double calculateAverage(){
        return calculateSum()/grades.length; // Returns the sum divided by the number of grades to get the average
    }

    // Method to find the highest grade
    public static int getHighest(){
        int highest = grades[0]; // Assume the first grade is the highest initially
        // Loop through each grade to check if there is a higher value
        for(int grade: grades){
            if(grade > highest){ // If a grade is higher than the current highest, update the highest
                highest = grade;
            }
        }
        return highest; // Return the highest grade found
    }

    // Method to find the lowest grade
    public static int getLowest(){
        int lowest = grades[0]; // Assume the first grade is the lowest initially
        // Loop through each grade to check if there is a lower value
        for(int grade: grades){
            if(grade < lowest){ // If a grade is lower than the current lowest, update the lowest
                lowest = grade;
            }
        }
        return lowest; // Return the lowest grade found
    }

    // Main method - Entry point for the program
    public static void main(String[] args){
        //multi dimensional array ex int[] grades = new int[20][4] -> 20 students with 4 grades each

        // Asks the user how many grades they want to enter and initializes the grades array with that size
        System.out.println("How many grades would you like to enter?");
        grades = new int[scanner.nextInt()]; // Sets the size of the grades array based on user input

        getGrades(); // Calls the method to get grades from the user

        // Displays the average, highest, and lowest grades
        System.out.println("Average: " + String.format("%.2f", calculateAverage())); // Calculates and formats the average to 2 decimal places
        System.out.println("Highest: " + getHighest()); // Calls the method to find and display the highest grade
        System.out.println("Lowest: " + getLowest()); // Calls the method to find and display the lowest grade

    }



}
