import java.util.Scanner;

public class MenuProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("[1] Calculating Average");
        System.out.println("[2] Calculating Product");
        System.out.println("[3] Calculating Sum");
        int choice = sc.nextInt();
        int[] n = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Input integer " + (i + 1) + ": ");
            n[i] = sc.nextInt();
        }
        int sum = n[0] + n[1] + n[2] + n[3] + n[4];
        if (choice == 1) {
            double average = sum / 5.0;
            System.out.println("The average is : " + average);
        } else if (choice == 2) {
            int product = n[0] * n[1];
            System.out.println("The product is : " + product);
        } else if (choice == 3) {
            System.out.println("The sum is : " + sum);
        } else {
            System.out.println("Invalid choice");
        }
        sc.close();
    }
}
