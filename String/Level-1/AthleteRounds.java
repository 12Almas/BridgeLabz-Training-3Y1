import java.util.Scanner;

public class AthleteRounds {
    public static int rounds(double a, double b, double c) {
        double perimeter = a + b + c;
        return (int) Math.ceil(5000 / perimeter);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double side1 = sc.nextDouble();
        double side2 = sc.nextDouble();
        double side3 = sc.nextDouble();
        int totalRounds = rounds(side1, side2, side3);
        System.out.println("Number of rounds to complete 5 km: " + totalRounds);
        sc.close();
    }
}
