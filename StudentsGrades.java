import java.util.Scanner;

public class StudentsGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first grade: ");
        int g1 = sc.nextInt();
        System.out.print("Enter second grade: ");
        int g2 = sc.nextInt();
        System.out.print("Enter third grade: ");
        int g3 = sc.nextInt();
        System.out.print("Enter fourth grade: ");
        int g4 = sc.nextInt();
        System.out.print("Enter fifth grade: ");
        int g5 = sc.nextInt();
        System.out.print("Enter sixth grade: ");
        int g6 = sc.nextInt();
        System.out.print("Enter seventh grade: ");
        int g7 = sc.nextInt();

        int smallest = g1;
        if (g2 < smallest) smallest = g2;
        if (g3 < smallest) smallest = g3;
        if (g4 < smallest) smallest = g4;
        if (g5 < smallest) smallest = g5;
        if (g6 < smallest) smallest = g6;
        if (g7 < smallest) smallest = g7;

        System.out.println("The smallest grade is " + smallest + ".");

        sc.close();
    }
}
