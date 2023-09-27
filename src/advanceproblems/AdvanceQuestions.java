package advanceproblems;

import java.util.Scanner;

public class AdvanceQuestions {
    public static void main(String[] args) {
        printNumberInReverse();
        }

    public static void printNumberInReverse() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = n; i >= 1; i--) {
            System.out.println(i);
        }
    }

    public static void printNaturalNumberToN() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

    }
}


