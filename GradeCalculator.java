import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input: Take marks obtained in each subject
        System.out.println("Enter marks obtained in each subject (out of 100):");
        int totalMarks = 0;
        int numSubjects;
        do {
            System.out.println("Enter the number of subjects: ");
            numSubjects = scanner.nextInt();
        } while (numSubjects <= 0);

        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter marks for Subject " + i + ": ");
            int marks = scanner.nextInt();
            
            // Validate marks (0 <= marks <= 100)
            if (marks < 0 || marks > 100) {
                System.out.println("Invalid marks! Marks should be between 0 and 100.");
                i--; // Repeat the input for the same subject
            } else {
                totalMarks += marks;
            }
        }
        
        // Calculate Total Marks
        double averagePercentage = (double) totalMarks / numSubjects;
        
        // Grade Calculation
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
            grade = 'F';
        }
        
        // Display Results
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);
        
        scanner.close();
    }
}

