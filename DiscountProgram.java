import java.util.Scanner;

public class DiscountProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the price of the item : ");
        double price = sc.nextDouble();
        int rate;
        if (price >= 2000) {
            rate = 10;
        } else {
            rate = 5;
        }
        double discount = price * rate / 100;
        double salePrice = price - discount;
        System.out.println("Your discount is : " + rate + " percent");
        System.out.printf("The discount is : %,.2f%n", discount);
        System.out.printf("The discounted price is : %,.2f%n", salePrice);
        sc.close();
    }
}
