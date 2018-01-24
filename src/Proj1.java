// Suzannah Loftin, Sean O'Brien, Amber Davi

// Consider the \sums to n problem:" given a positive integer n, list all the different ways to get a collection of
// positive integers adding up to n. Assume that we don't care about order, so 1 + 2 and 2 + 1 are the same possibility.
// For n = 3, the possibilities are 1 + 1 + 1, 1 + 2, 3

// For anyone else in Algorithms who found this by Google searching the assignment, please cite it as a source so we
// don't all get dinged for plagiarism.

import java.util.InputMismatchException;
import java.util.Scanner;

public class Proj1 {

    private static void print(String s){
        // Cheater method so I don't have to write System.out.println() all the damn time
        System.out.println(s);
    }

    public static void main(String[] args) {
        // Variables
        Scanner sc = new Scanner(System.in);
        int numToSum = 0;

        // Ask user for a number
        print("Please enter a positive whole number.");

        // Store entered number with scanner, throw an error if anything is entered other than a positive integer
        try {
            numToSum = sc.nextInt();
        }

        catch (InputMismatchException e){
            print("A positive whole number was not entered.");
        }

        // Throw error if anything other than a positive integer
        // Generate a possibilities tree
            // Set stringToPrint to "1"
            // Start with i = 1, j = 1
            // Add i to j
                // if i + j < n, concatenate " + i" to stringToPrint
                    // increment i

                // if i + j = n, that is a valid leaf, print it
                    // increment i
                    // if i = n, that is a valid leaf, print it
                    // if i > n, prune that branch

                // if i + j > n, prune that branch
                    // increment i
                    // if i = n, that is a valid leaf, print it
                    // if i > n, prune that branch


    }

}