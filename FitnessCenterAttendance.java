// 2. The Fitness Center Attendance 
// A gym tracks attendance for 10 days using an array.
// Use a for loop to calculate the total number of visitors in 10 days.
// Identify the day with the maximum attendance.
// Find the minimum attendance day.
// Display all days where attendance was above the average.


import java.util.Scanner;

public class FitnessCenterAttendance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] attendance = new int[10];

        System.out.println("Enter attendance for 10 days:");
        for (int day = 0; day < attendance.length; day++) {
            System.out.print("Day " + (day + 1) + ": ");
            attendance[day] = scanner.nextInt();
        }

        int totalVisitors = 0;
        int maxAttendance = attendance[0];
        int maxDay = 1;
        int minAttendance = attendance[0];
        int minDay = 1;

        for (int i = 0; i < attendance.length; i++) {
            totalVisitors += attendance[i];

            if (attendance[i] > maxAttendance) {
                maxAttendance = attendance[i];
                maxDay = i + 1;
            }

            if (attendance[i] < minAttendance) {
                minAttendance = attendance[i];
                minDay = i + 1;
            }
        }

        double averageAttendance = (double) totalVisitors / attendance.length;

        System.out.println("\nSummary of attendance:");
        System.out.println("Total visitors in 10 days: " + totalVisitors);
        System.out.println("Maximum attendance on Day " + maxDay + ": " + maxAttendance);
        System.out.println("Minimum attendance on Day " + minDay + ": " + minAttendance);
        System.out.println("Days with attendance above average:");
        for (int i = 0; i < attendance.length; i++) {
            if (attendance[i] > averageAttendance) {
                System.out.println("Day " + (i + 1) + ": " + attendance[i]);
            }
        }

        scanner.close();
    }
}
