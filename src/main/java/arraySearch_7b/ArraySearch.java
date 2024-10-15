package arraySearch_7b;

import java.util.Arrays;
import java.util.Random;

public class ArraySearch {

    // Constants defining the length of the lottery ticket and the maximum possible ticket number
    private static final int LENGTH = 6; // The number of elements in the lottery ticket (6 numbers)
    private static final int MAX_TICKET_NUMBER = 69; // The maximum number a lottery ticket can have (1-69)


    // Method to generate unique random lottery numbers
    public static int[] generateNumbers(){

        int[] ticket = new int[LENGTH]; // Creates an array to store the lottery numbers

        Random random = new Random(); // Creates a Random object for generating random numbers

        // Loop to generate random numbers and fill the ticket array
        for(int i=0; i< LENGTH; i++){
            int randomNumber; // Variable to store the generated random number

            /*
            Generate a random number, then check if it already exists in the array.
            If it does, regenerate the number and check again.
             */
            do{
                randomNumber = random.nextInt(MAX_TICKET_NUMBER) + 1; // Generate a random number between 1 and MAX_TICKET_NUMBER
            }while(search(ticket, randomNumber)); // Repeat if the number already exists in the ticket array

            // Once a unique number is found, add it to the array at position i
            ticket[i] = randomNumber;
        }

        return ticket; // Return the generated ticket array
    }

    /**
     * Performs a sequential search on the array to find a specific value
     * @param array Array to search through
     * @param numberToSearchFor Value to search for
     * @return true if the number is found, false if it is not found
     */
    public static boolean search(int[] array, int numberToSearchFor){

        /* This is an enhanced for loop. It iterates through 'array' and
           assigns each element to 'value' on each iteration
         */
        for(int value : array){
            if(value == numberToSearchFor){ // If the current value matches the number we are searching for
                return true; // Return true if the number is found
            }
        }

        /* If we've reached this point, the number was not found in the array */
        return false; // Return false if the number is not found
    }

    // Performs a binary search on a sorted array to find a specific value
    public static boolean binarySearch(int[] array, int numberToSearchFor){

        // The array must be sorted for binary search to work
        Arrays.sort(array); // Sort the array before performing the binary search

        int index = Arrays.binarySearch(array, numberToSearchFor); // Perform binary search on the array
        if(index >= 0){ // If the index is non-negative, the number was found
            return true;
        }
        else return false; // If the index is negative, the number was not found
    }

    // Method to print the lottery ticket
    public static void printTicket(int ticket[]) {
        // Loop through the ticket array and print each number, separated by " | "
        for (int i = 0; i < LENGTH; i++) {
            System.out.print(ticket[i] + " | "); // Print the ith element of the ticket array followed by " | "
        }
    }


        public static void main (String[]args){

            //Sequential Search - searches every element until it finds the value
            //Good for small arrays

            //Binary Search - elements are sorted into ascending order from least to greatest
            //Checking to see if the element is greater or less than the value.
            //Searches in the middle and eliminates half of the array to find the value

            //Can use Arrays.binarySearch to do a binary easily.

            int[] ticket = generateNumbers(); // Generates an array of unique random lottery numbers
            Arrays.sort(ticket); // Sorts the generated ticket numbers in ascending order
            printTicket(ticket); // Prints the sorted ticket

        }


}
