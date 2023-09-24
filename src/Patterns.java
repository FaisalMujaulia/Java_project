import java.util.Scanner;

import java.util.*;
public class Patterns {
    public static void main(String[] args) {
//        drawRectanglePattern();
//        drawEquilateralTrianglePattern();
//        drawSquareWithStar();
        drawRightAngleTriangle();
    }

    private static void drawRightAngleTriangle() {
        System.out.println("Please enter the no.of rows and columns");
        Scanner scan = new Scanner(System.in);
        int rows = scan.nextInt();
        int cols = scan.nextInt();
        for(int i= 1; i<rows; i++) {
            for (int j= 1;j<=i;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void drawSquareWithStar() {
        System.out.println("Please enter the no.of rows and columns");
        Scanner scan = new Scanner(System.in);
        int rows = scan.nextInt();
        int cols = scan.nextInt();
        for(int i= 0; i<rows; i++) {
            for (int j= 0;j<cols;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void drawEquilateralTrianglePattern() {
        System.out.println("Please Complete the coding to draw Equi triangle");
    }
    private static void drawRectanglePattern() {
        int n = 4;
        int m = 5;
// outer loop
        for (int i=1;i<=n;i++){
// inner loop
            for (int j = 1; j<=m;j++){
                if (i==1 || j==1 || i==n || j==m){
                    System.out.print("*");

                }
                else System.out.print(" ");

            }
            System.out.println();
        }
    }
}

