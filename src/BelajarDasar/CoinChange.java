package BelajarDasar;

import java.util.Arrays;

/**
 * @author Yana Andika
 * @Date 19/12/21
 * @Project BasicJava
 */
public class CoinChange {

    static long countWays(int array[], int lengthOfArray, int n) {
        // table[i] will be storing the number of solutions
        // for value i. We need n+1 rows as the table is
        // constructed in bottom up manner using the base
        // case (n = 0)
         long[] table = new long[n + 1];

        // Initialize all table values as 0
        Arrays.fill(table, 0);   //O(n)

        // Base case (If given value is 0)
        table[0] = 1;

        // Pick all coins one by one and update the table[]
        // values after the index greater than or equal to
        // the value of the picked coin
        for (int i = 0; i < lengthOfArray; i++)
            for (int j = array[i]; j <= n; j++) {
                int sequence = j - array[i];
                long newValue = table[sequence];
                table[j] += newValue;
            }

        return table[n];
    }

    // Driver Function to test above function
    public static void main(String args[]) {
        int arr[] = {1, 2, 3};
        int m = arr.length;
        int n = 4;
        System.out.println(countWays(arr, m, n));
    }
}
