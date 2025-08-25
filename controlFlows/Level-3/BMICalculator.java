import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double weight = sc.nextDouble();
        double heightCm = sc.nextDouble();
        double heightM = heightCm / 100;
        double bmi = weight / (heightM * heightM);
        if (bmi <= 18.4) {
            System.out.println("BMI is " + bmi + ": Underweight");
        } else if (bmi <= 24.9) {
            System.out.println("BMI is " + bmi + ": Normal");
        } else if (bmi <= 39.9) {
            System.out.println("BMI is " + bmi + ": Overweight");
        } else {
            System.out.println("BMI is " + bmi + ": Obese");
        }
        sc.close();
    }
}
