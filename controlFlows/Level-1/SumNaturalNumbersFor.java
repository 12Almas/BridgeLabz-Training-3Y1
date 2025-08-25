import java.util.Scanner;

public class SumNaturalNumbersFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isNatural = n > 0;
        int sumFor = 0;
        if (isNatural) {
            for (int i = 1; i <= n; i++) {
                sumFor += i;
            }
            int sumFormula = n * (n + 1) / 2;
            System.out.println("Sum using formula: " + sumFormula);
            System.out.println("Sum using for loop: " + sumFor);
        } else {
            System.out.println("Not a Natural Number");
        }
        sc.close();
    }
}
