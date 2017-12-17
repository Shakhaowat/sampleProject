package math;

public class MakePyramid {
    public static void main(String[] args) {

        //   Implement a large Pyramid of stars in the screen with java.
        //
        //                    *
        //                   * *
        //                  * * *
        //                 * * * *
        //                * * * * *
        //               * * * * * *

        //Start Here
        for (int i = 7; i > 0; i--) {
            int j = 0;
            for (j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = j; k < 7; k++) {
                System.out.print(" *");
            }
            System.out.println(" ");

        }

    }


         }

