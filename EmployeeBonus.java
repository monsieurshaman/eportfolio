import java.util.Scanner;

public class EmployeeBonus {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter employee's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter department: ");
        String department = scanner.nextLine();

        System.out.print("Enter monthly salary: ");
        double monthlySalary = scanner.nextDouble();

        System.out.print("No. of years in service: ");
        int years = scanner.nextInt();

        double bonus = (monthlySalary * 8.33 / 100) + (monthlySalary * getServiceRate(years));

        System.out.printf("Your bonus is %.2f%n", bonus);

        scanner.close();
    }

    private static double getServiceRate(int years) {
        if (years <= 1) {
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
