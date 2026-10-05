import java.util.Scanner;

public class RentACar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Base Fee : ");
        double baseFee = sc.nextDouble();
        System.out.print("Charge per mile : ");
        double chargePerMile = sc.nextDouble();
        System.out.print("Number of Miles : ");
        double miles = sc.nextDouble();
        double totalCost = baseFee + (chargePerMile * miles);
        System.out.printf("Total cost : %,.0f%n", totalCost);
        if (totalCost >= 1000) {
            System.out.println("Thank you for Riding");
        } else {
            System.out.println("Have a good day!");
        }
        sc.close();
    }
}
