import java.util.Scanner;

public class EmployeeInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for employee first name
        System.out.print("Enter employee first name: ");
        String firstName = scanner.nextLine();

        // Prompt for employee last name
        System.out.print("Enter employee last name: ");
        String lastName = scanner.nextLine();

        // Prompt for employee age
        System.out.print("Enter employee age: ");
        int age = scanner.nextInt();

        // Prompt for number of hours worked in a day
        System.out.print("Enter number of hours worked in a day: ");
        float hoursWorked = scanner.nextFloat();

        // Prompt for hourly wage
        System.out.print("Enter employee hourly wage: ");
        double hourlyWage = scanner.nextDouble();

        // Compute the employee's years to retire in 65 years
        int yearsToRetirement = Math.abs(65 - age);

        // Compute the hours worked and horly wage to daily wage
        double dailyWage = hoursWorked * hourlyWage;

        // Compute the weekly wage 5 working days a week
        double weeklyWage = dailyWage * 5;

        // Compute the monthly wage in 4 weeks in a month
        double monthlyWage = weeklyWage * 4;

        // Compute the gross yearly wage in 12 months every year 
        double grossYearlyWage = monthlyWage * 12;

        // Compute the net yearly wage 
        double deduction = grossYearlyWage * 0.32; 
        double netYearlyWage = grossYearlyWage - deduction - 1500.00; 

        // Display the collected and computed information
        System.out.println("\nEmployee Information:");
        System.out.println("-------------");
       System.out.println("Full Name:               " + lastName.toUpperCase() + ", " + firstName.toUpperCase());
        System.out.println("Age:                        " + age + " years old");
    System.out.println("Years to Retirement: " + yearsToRetirement + " years");
        System.out.printf("Daily Wage:                  PHP %.2f%n", dailyWage);  
        System.out.printf("Weekly Wage:                 PHP %.2f%n", weeklyWage);
        System.out.printf("Monthly Wage:                PHP %.2f%n", monthlyWage); 
        System.out.printf("Gross Yearly Wage:           PHP %.2f%n", grossYearlyWage); 
        System.out.printf("Net Yearly Wage:             PHP %.2f%n", netYearlyWage);

        // Close the scanner
        scanner.close();
    }
}
