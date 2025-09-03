// 1. The Library Book Tracker 
// A library records the number of books borrowed each day for 7 days in an array.
// Use a loop to calculate the total number of books borrowed in the week.
// Find the day with the highest borrowings.
// Check if there was any day with zero borrowings (holiday).
// Display the average daily borrowings.

import java.util.Scanner;

public class LibraryBookTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] dailyBorrowings = new int[7];

        System.out.println("Please enter the number of books borrowed for each of the 7 days:");
        for (int day = 0; day < dailyBorrowings.length; day++) {
            System.out.print("Day " + (day + 1) + ": ");
            dailyBorrowings[day] = scanner.nextInt();
        }

        int totalBorrowed = 0;
        int highestBorrowed = dailyBorrowings[0];
        int highestDay = 1;
        boolean hadHoliday = false;

        for (int i = 0; i < dailyBorrowings.length; i++) {
            totalBorrowed += dailyBorrowings[i];

            if (dailyBorrowings[i] > highestBorrowed) {
                highestBorrowed = dailyBorrowings[i];
                highestDay = i + 1;
            }

            if (dailyBorrowings[i] == 0) {
                hadHoliday = true;
            }
        }

        double averageBorrowed = (double) totalBorrowed / dailyBorrowings.length;

        System.out.println("\nSummary of borrowings for the week:");
        System.out.println("Total books borrowed: " + totalBorrowed);
        System.out.println("Highest borrowings were on Day " + highestDay + " with " + highestBorrowed + " books.");
        System.out.println("Was there any holiday (zero borrowings)? " + (hadHoliday ? "Yes" : "No"));
        System.out.printf("Average daily borrowings: %.2f\n", averageBorrowed);

        scanner.close();
    }
}
