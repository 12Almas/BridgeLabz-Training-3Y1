import java.util.Scanner;

public class MaxHandshakes {
    public static int handshakes(int n) {
        return n * (n - 1) / 2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfStudents = sc.nextInt();
        int maxHandshakes = handshakes(numberOfStudents);
        System.out.println("Maximum number of possible handshakes: " + maxHandshakes);
        sc.close();
    }
}
