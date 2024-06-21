package Java101;

import java.util.Scanner;

public class PassingStatus {
    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);
        String[] subjects = {"math", "physical", "turkish", "chemical", "music"};
        int[] grades = new int[subjects.length];
        int total = 0, counter = 0;
        int passingGrade=55;

        for (int i = 0; i < grades.length; i++) {
            System.out.print(subjects[i] + " enter your grade: ");
            int grade = user.nextInt();

            if (!((grades[i] < 0) || (grades[i] > 100))) {
                grades[i] = grade;
                total += grade;
                counter++;
            } else {
                System.out.println("Invalid grade will not avarage");
            }
        }

        if  (total > 0) {
            double average = (double) total / counter;
            System.out.println("Average of valid grades: " + average);

            if (average >= passingGrade) {
                System.out.println("Congratulations you passed");
            } else {
                System.out.println("Invalid GPA");
            }
        }

    }
}