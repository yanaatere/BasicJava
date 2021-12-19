package BelajarDasar;


import java.util.Scanner;

import static java.util.Arrays.stream;

/**
 * @author Yana Andika
 * @Date 17/12/21
 * @Project BasicJava
 */
public class Fibonnaci {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //taking total count of testcases
        int t = sc.nextInt();

        while (t-- > 0) {
            //taking total number of elements
            int n = sc.nextInt();

            //calling printFibb() method
            long[] res = new Fibonnaci().fib_bottom_up(n);

            //printing the elements of the array
            for (int i = 0; i < res.length; i++)
                System.out.print(res[i] + " ");
            System.out.println();
        }
    }


    public static long[] fib_bottom_up(int n) {
        long[] bottom_up = new long[n];
        if (n == 1) {
            bottom_up[0] = 1;
            return bottom_up;
        } else if (n == 2) {
            bottom_up[0] = 1;
            bottom_up[1] = 1;
            return bottom_up;
        }

        bottom_up[0] = 1;
        bottom_up[1] = 1;

        if (n >= 3) {
            for (int i = 2; i < n; i++) {
                bottom_up[i] = bottom_up[i - 1] + bottom_up[i - 2];
            }
        }

        return bottom_up;
    }
}
