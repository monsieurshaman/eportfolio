import java.util.Scanner;

public class AllowanceVsExpense {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter allowance for a day: ");
        double allowance = sc.nextDouble();

        System.out.print("Enter total expenses for one day: ");
        double expenses = sc.nextDouble();

        if (allowance < 0 || expenses < 0) {
            System.out.println("Invalid Input");
        } else if (allowance > expenses) {
            System.out.println("GOOD BUDGET");
        } else {
            System.out.println("BAD BUDGET");
        }

        sc.close();
    }
}
