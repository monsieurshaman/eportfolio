import java.util.Scanner;

public class ScholarChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of subjects taken last semester:");
        int numSubjects = sc.nextInt();
        double totalPoints = 0;
        double totalUnits = 0;
        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter the grade of subject " + i + ": ");
            double grade = sc.nextDouble();
            System.out.print("Enter the equivalent units: ");
            double units = sc.nextDouble();
            totalPoints += grade * units;
            totalUnits += units;
        }
        double weightedAvg = totalPoints / totalUnits;
        System.out.printf("The average weighted grade is: %.2f%n", weightedAvg);
        if (weightedAvg < 1.50) {
            System.out.println("Congratulations, you are a scholar");
        } else {
            System.out.println("You can do better next semester for you to become a scholar");
        }
        sc.close();
    }
}
