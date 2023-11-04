import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Student Grade Calculator");
        System.out.println("Enter the student's information:");

        System.out.print("Student Name: ");
        String studentName = scanner.nextLine();

        System.out.print("Number of Subjects: ");
        int numSubjects = scanner.nextInt();

        double totalScore = 0;

        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter score for Subject " + i + ": ");
            double subjectScore = scanner.nextDouble();
            totalScore += subjectScore;
        }

        double averageScore = totalScore / numSubjects;

        System.out.println("\nStudent Information:");
        System.out.println("Name: " + studentName);
        System.out.println("Number of Subjects: " + numSubjects);
        System.out.println("Total Score: " + totalScore);
        System.out.println("Average Score: " + averageScore);

        String grade = calculateGrade(averageScore);
        System.out.println("Grade: " + grade);

        scanner.close();
    }

    
    public static String calculateGrade(double averageScore) {
        if (averageScore >= 90) {
            return "A+";
        } else if (averageScore >= 80) {
            return "A";
        } else if (averageScore >= 70) {
            return "B";
        } else if (averageScore >= 60) {
            return "C";
        } else if (averageScore >= 50) {
            return "D";
        } else {
            return "F";
        }
    }
}
