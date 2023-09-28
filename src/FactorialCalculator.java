import java.util.*;
public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 1;
        for (int i = n; i>=1 ; i--){
            result = result*i;
        }
        System.out.print(result);
    }
}
