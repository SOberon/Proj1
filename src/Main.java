// Suzannah Loftin, Sean O'Brien, Amber Davi

// Consider the \sums to n problem:" given a positive integer n, list all the different ways to get a collection of
// positive integers adding up to n. Assume that we don't care about order, so 1 + 2 and 2 + 1 are the same possibility.
// For n = 3, the possibilities are 1 + 1 + 1, 1 + 2, 3

// For anyone else in Algorithms who found this by Google searching the assignment, please cite it as a source so we
// don't all get dinged for plagiarism.

import java.util.Scanner;

public class Proj1 {

    public static void main(String[] args){
        int number = userPicksAnInt();		//User picks a number
        sumsToN(number);						//Tree is generated and printed
    }

    public static int userPicksAnInt(){
        Scanner sc = new Scanner(System.in); 	//Scanner for user entry
        int number;					//Number to be parsed or whatever the correct word is

        //Ask the user to input a number
        System.out.println("Please enter a positive integer");
        //TODO Add exception handling for user entry of a char, negative number, float, empty, null, etc...
        number = sc.nextInt();
    }

    public static void sumsToN(int number)
    {
        if(number == 1) //Base cases are good, but probably don't need them if the recursion works properly
        {
            System.out.print("1");

        } else {

            for(int i = 1; i < number; i++)
            {

                System.out.print(i + " + ");
                sumsToN(number - i);
                System.out.print("   ");
            }

        }

    }

}
//TODO Write unit tests. Maybe.
