import java.util.Scanner;

public class EligibleToVote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        if (age >= 15 && age <= 35) {
            System.out.println("An " + age + "-year-old is eligible to vote.");
        } else if (age > 0) {
            System.out.println("An " + age + "-year-old is not eligible to vote.");
        } else {
            System.out.println("INVALID data");
        }

        sc.close();
    }
}
