package math;

/**
 * Created by mrahman on 04/22/17.
 */
public class Factorial {
    static int factorial(int n) {
        //logic for factorial
        if (n == 0)
            return 1;//since factorial of 0 is 1;
        else
            return (n * factorial(n-1));

    }
    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */
        int i,fact=1;
        int number=5;//It is the number to calculate factorial
        fact = factorial(number);//passing the parameter and store in fact
        System.out.println("Factorial of "+number+" is: "+fact);
    }
}
