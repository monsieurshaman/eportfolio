import java.util.Scanner;

public class EmployeeBonus {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== ABC MALL YEAR-END BONUS CALCULATOR ===");

        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();

        System.out.print("Enter monthly basic salary (Php): ");
        double monthlySalary = scanner.nextDouble();

        System.out.print("Enter years of service: ");
        int years = scanner.nextInt();

        if (monthlySalary < 0 || years < 1) {
            System.out.println("Invalid input. Salary must not be negative and years of service must be at least 1.");
            scanner.close();
            return;
        }

        double serviceRate = getServiceRate(years);
        double baseBonus = monthlySalary * 8.33 / 100;
        double serviceBonus = monthlySalary * serviceRate;
        double totalBonus = baseBonus + serviceBonus;

        System.out.println();
        System.out.println("--------------------------------------------");
        System.out.println("Employee            : " + name);
        System.out.printf("Monthly Basic Salary: Php %,.2f%n", monthlySalary);
        System.out.println("Years of Service    : " + years);
        System.out.printf("Service Percentage  : %.0f%%%n", serviceRate * 100);
        System.out.println("--------------------------------------------");
        System.out.printf("Base Bonus (8.33%%)  : Php %,.2f%n", baseBonus);
        System.out.printf("Service Bonus       : Php %,.2f%n", serviceBonus);
        System.out.println("--------------------------------------------");
        System.out.printf("TOTAL YEAR-END BONUS: Php %,.2f%n", totalBonus);
        System.out.println("--------------------------------------------");

        scanner.close();
    }

    private static double getServiceRate(int years) {
        if (years == 1) {
            return 0.15;
        } else if (years <= 5) {
            return 0.20;
        } else if (years <= 10) {
            return 0.25;
        } else if (years <= 20) {
            return 0.30;
        } else {
            return 0.35;
        }
    }
}
