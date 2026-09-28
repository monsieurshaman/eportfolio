import java.util.Scanner;

public class DateFormatting {
    public static void main(String[] args) {
        // Initialize Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Array to map month numbers to their corresponding names
        String[] monthNames = {
            "January", "February", "March", "April", "May", "June", 
            "July", "August", "September", "October", "November", "December"
        };

        // Array to store the standard number of days for each month
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // 1. Prompt and read the month
        System.out.print("Enter month: ");
        int month = scanner.nextInt();

        // Validate month (1 to 12)
        while (month < 1 || month > 12) {
            System.out.print("Invalid month. Please enter a month from 1 to 12: ");
            month = scanner.nextInt();
        }

        // 2. Prompt and read the day
        System.out.print("Enter day: ");
        int day = scanner.nextInt();

        // Determine the maximum valid days for the entered month
        int maxDays = daysInMonth[month - 1];

        // Special handling for February to account for leap years
        if (month == 2) {
            // Leap year logic: divisible by 4, except for centuries unless divisible by 400
            if ((yearIsLeap(scanner)) && (day > 28)) { // We'll fix the leap year check below
                // Placeholder
            }
        }
        
        // Let's refine the leap year logic cleanly before validating the day
        // We need the year first to validate the day for February.
        
        // 3. Prompt and read the year (Moved up logically to validate Feb days)
        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        // Re-evaluate max days for February with the year known
        if (month == 2) {
            if (isLeapYear(year)) {
                maxDays = 29;
            } else {
                maxDays = 28;
            }
        }

        // Validate day based on the specific month and year
        while (day < 1 || day > maxDays) {
            System.out.print("Invalid day. Please enter a day from 1 to " + maxDays + ": ");
            day = scanner.nextInt();
        }

        // 4. Display the formatted date
        // Using month - 1 to get the correct index for the monthNames array
        System.out.println("Date Format is " + monthNames[month - 1] + " " + day + ", " + year);

        // Close the scanner
        scanner.close();
    }

    // Helper method to determine if a year is a leap year
    public static boolean isLeapYear(int year) {
        if (year % 4 != 0) {
            return false;
        } else if (year % 100 != 0) {
            return true;
        } else if (year % 400 != 0) {
            return false;
        } else {
            return true;
        }
    }
}
