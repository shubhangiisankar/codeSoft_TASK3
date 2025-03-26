import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for number of subjects
        System.out.print("Enter the number of subjects: ");
        int numSubjects = sc.nextInt();

        // Array to store marks and variable for total marks
        int[] marks = new int[numSubjects];
        int totalMarks = 0;

        // Taking input for marks in each subject
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter marks obtained in subject " + (i + 1) + " (out of 100): ");
            marks[i] = sc.nextInt();
            totalMarks += marks[i];  // Summing up marks
        }

        // Calculating average percentage
        double averagePercentage = (double) totalMarks / numSubjects;

        // Determining grade based on percentage
        char grade;
        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
             grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F'; // Fail
        }

        // Displaying results
        System.out.println("\nTotal Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);

        sc.close();
}
}
