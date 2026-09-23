import java.util.Scanner;

public class PemdasSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 3 numbers: ");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        double num3 = sc.nextDouble();

        System.out.print("Enter a character for the operation: ");
        char operation = sc.next().charAt(0);

        double answer = 0;

        switch (Character.toUpperCase(operation)) {
            case 'P':
                answer = (num1 / 100) * num2 * num3;
                break;
            case 'E':
                answer = Math.pow(num1, num2) * num3;
                break;
            case 'M':
                answer = num1 * num2 * num3;
                break;
            case 'D':
                answer = num1 / num2 / num3;
                break;
            case 'A':
                answer = num1 + num2 + num3;
                break;
            case 'S':
                answer = num1 - num2 - num3;
                break;
            default:
                System.out.println("Invalid operation!");
                sc.close();
                return;
        }

        System.out.println("The answer is " + (long) answer);

        sc.close();
    }
}
