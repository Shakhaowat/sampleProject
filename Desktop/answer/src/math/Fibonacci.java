package math;

public class Fibonacci {
    public static void main(String[] args) {
        /*
          Write 40 Fibonacci numbers with java.
         */
        int n, a=0, b = 0, c = 1;
        System.out.println("Fibonacci: " );
        for (int i=1; i<=40; i++){

            a=b;
            b=c;
            c=a+b;
            System.out.println(a+ " ");

        }
    }
}
