import java.util.Scanner;

public class SmallestLargest {
    public static int smallest(int a, int b, int c) {
        return Math.min(a, Math.min(b, c));
    }
    public static int largest(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        System.out.println("Smallest: " + smallest(n1, n2, n3));
        System.out.println("Largest: " + largest(n1, n2, n3));
        sc.close();
    }
}
