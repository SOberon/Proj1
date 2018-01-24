// Suzannah Loftin, Sean O'Brien, Amber Davi

// Consider the \sums to n problem:" given a positive integer n, list all the different ways to get a collection of
// positive integers adding up to n. Assume that we don't care about order, so 1 + 2 and 2 + 1 are the same possibility.
// For n = 3, the possibilities are 1 + 1 + 1, 1 + 2, 3

// For anyone else in Algorithms who found this by Google searching the assignment, please cite it as a source so we
// don't all get dinged for plagiarism.

import java.util.InputMismatchException;
import java.util.Scanner;

public class Proj1 {
    public static void main (String[] args) {
        // Bits and bobs
        Scanner sc = new Scanner(System.in);
        int numToSum = 0;   // I don't like that I have to initialize this to 0 to get it to work. Puzzle it through.

        // Ask user for a number
        print("Please enter a positive whole number.");

        // Store entered number with scanner, throw an error if anything is entered other than a positive integer
        try {
            numToSum = sc.nextInt();
        }

        catch (InputMismatchException e){ // Exits if anything other than a positive int was entered.
            print("A positive whole number was not entered.");
            //System.exit(0); // Turns out this is redundant.
        }

        if (numToSum < 1){ // Exits if number entered was less than 0.
            print("A positive whole number was not entered.");
            System.exit(0);
        }

        // Generate a possibilities tree
        for (int counter = 1; counter <= numToSum; counter++){
            generateTree(numToSum, "" + counter, counter, counter);
        }
    }

    public static void generateTree(int numToSum, String leaf, int currentNumber, int runningTotal){
        // Check if our running total equals the number we are trying to find sums for. If so, we have a good leaf.
        if (runningTotal == numToSum){
            print(leaf);
        }

        // Keep generating branches, prune branches if they go over the number we are trying to find sums for
        else if (runningTotal < numToSum){
            for (int counter = currentNumber; counter < numToSum; counter++){
                generateTree(numToSum, leaf + " + " + counter, counter, runningTotal + counter);
            }
        }
    }

    // Cheater methods so I don't have to write System.out.println() all the damn time
    private static void print(String s) {System.out.println(s);}
    //private static void print(int i)    {System.out.println(i);}
}

//TODO add test methods maybe I don't know