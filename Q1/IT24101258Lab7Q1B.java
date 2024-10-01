import java.util.Scanner;

public class IT24101258Lab7Q1B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfStudents = 3;
        int numberOfSubjects = 4;

        // Loop through each student
        for (int student = 1; student <= numberOfStudents; student++) {
            int totalMarks = 0;

            // Input marks for four subjects for each student
            System.out.println("\nStudent " + student);
            System.out.print("Enter marks: ");
            for (int i = 1; i <= numberOfSubjects; i++) {
                int marks = input.nextInt();
                totalMarks += marks;
            }

            // Calculate average
            double average = totalMarks / (double) numberOfSubjects;
            System.out.println("Average is: " + average);

            // Determine grade based on the average
            if (average >= 75 && average <= 100) {
                System.out.println("Overall Grade is: Distinction");
            } else if (average >= 50 && average < 75) {
                System.out.println("Overall Grade is: Credit");
            } else if (average >= 0 && average < 50) {
                System.out.println("Overall Grade is: Fail");
            } else {
                System.out.println("Invalid marks entered.");
            }
        }

    }
}