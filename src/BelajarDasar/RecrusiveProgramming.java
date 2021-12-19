package BelajarDasar;

import java.util.Scanner;

public class RecrusiveProgramming {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        System.out.println("Jumlah Nilai" + getJumlah(input));
        System.out.println("Jumlah Perkalian"+ getTotalPerkalian(input));
    }

    public static int getJumlah(int input) {
        System.out.println("Input" + input);
        if (input == 0) {
            return input;
        }
        return input + getJumlah(input - 1);
    }

    public static int getTotalPerkalian(int input) {
        System.out.println("Input" + input);
        if (input == 1) {
            return input;
        }
        return input * getTotalPerkalian(input - 1);
    }

    public static void getTotalNilai(int input) {
        System.out.println("Print Nilai " + input);
        if (input == 0)
            return;
        input--;
        getTotalNilai(input);
    }
}
