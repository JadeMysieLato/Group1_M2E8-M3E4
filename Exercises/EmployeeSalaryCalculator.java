import java.util.Scanner;

public class EmployeeSalaryCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double hoursWorked;
        double hourlyRate;
        double grossSalary;

        System.out.print("Enter hours worked: ");
        hoursWorked = input.nextDouble();

        System.out.print("Enter hourly rate: ");
        hourlyRate = input.nextDouble();

        grossSalary = hoursWorked * hourlyRate;

        System.out.println("Gross Salary: PHP " + grossSalary);

        input.close();
    }
}
