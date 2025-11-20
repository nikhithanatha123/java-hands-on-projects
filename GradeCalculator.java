import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== Student Grade Calculator ===");

        System.out.print("Enter marks of Subject 1: ");
        int sub1 = sc.nextInt();

        System.out.print("Enter marks of Subject 2: ");
        int sub2 = sc.nextInt();

        System.out.print("Enter marks of Subject 3: ");
        int sub3 = sc.nextInt();

        // Calculate total and average
        int total = sub1 + sub2 + sub3;
        double average = total / 3.0;

        // Determine grade
        char grade;

        if (average >= 90) {
            grade = 'A';
        } else if (average >= 80) {
            grade = 'B';
        } else if (average >= 70) {
            grade = 'C';
        } else if (average >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // Display Output
        System.out.println("\n--- Results ---");
        System.out.println("Total Marks: " + total);
        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);

        sc.close();
    }
}
