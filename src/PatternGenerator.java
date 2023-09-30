import java.util.*;

public class PatternGenerator {
    public static void main(String[] args) {
//        rightanglepattern();
//        rectangularPattern();

    }

    //
    public static void rightanglepattern() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();


        }


    }
//
    public static void rectangularPattern() {
        int n = 4;
        int m = 10;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (i == 1 || i == 4) {
                    System.out.print("* ");
                } else if (j == 1 || j == 10) {
                    System.out.print("* ");
                } else System.out.print("  ");
            }
            System.out.println();

        }


    }


}
