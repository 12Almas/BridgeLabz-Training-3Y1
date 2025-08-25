import java.util.Scanner;

public class PosNegZero {
    public static int checkSign(int n) {
        if (n < 0) return -1;
        else if (n > 0) return 1;
        else return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(checkSign(num));
        sc.close();
    }
}
