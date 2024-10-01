import java.util.Scanner;

public class IT24101258Lab7Q1A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalMarks = 0;
        int numberOfSubjects = 4;

       
        System.out.println("Enter marks for four subjects:");
        for (int i = 1; i <= numberOfSubjects; i++) {
            System.out.print("Enter Subject Mark " + i + ": ");
            int marks = input.nextInt();
            totalMarks += marks;
        }

      
        double average = totalMarks / (double) numberOfSubjects;
        System.out.println("\nAverage is: " + average);

       
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