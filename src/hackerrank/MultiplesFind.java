package hackerrank;

import java.util.Scanner;

public class MultiplesFind {
    public static void main(String[] args) {
        System.out.println("Please enter the number");
        int n = new Scanner(System.in).nextInt();
        printTable(n);
    }

    static void printTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + n * i);
        }
    }
}
