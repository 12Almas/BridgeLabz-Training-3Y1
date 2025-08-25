import java.util.Scanner;

public class SumNaturalNumbersComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isNatural = n > 0;
        int sumWhile = 0, i = 1;
        if (isNatural) {
            while (i <= n) {
                sumWhile += i;
                i++;
            }
            int sumFormula = n * (n + 1) / 2;
            System.out.println("Sum using formula: " + sumFormula);
            System.out.println("Sum using while loop: " + sumWhile);
        } else {
            System.out.println("Not a Natural Number");
        }
        sc.close();
    }
}
