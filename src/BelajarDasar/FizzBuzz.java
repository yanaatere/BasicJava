package BelajarDasar;

/**
 * @author Yana Andika
 * @Date 20/12/21
 * @Project BasicJava
 */
public class FizzBuzz {

    public static void fizzBuzz(int n) {
        for (int i = 0; i <= n; i++) {
            if (i != 0) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
            }
        }
    }

    public static class Solution {
        public static void main(String[] args) throws java.io.IOException {
            java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
            int n = Integer.parseInt(bufferedReader.readLine().trim());
            FizzBuzz.fizzBuzz(n);
            bufferedReader.close();
        }
    }

}
