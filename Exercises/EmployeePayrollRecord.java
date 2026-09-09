import java.util.Scanner;

public class EmployeePayrollRecord {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String employeeName;
        String employeeID;
        String position;
        double hoursWorked;
        double hourlyRate;

        System.out.print("Enter employee name: ");
        employeeName = input.nextLine();

        System.out.print("Enter employee ID: ");
        employeeID = input.nextLine();

        System.out.print("Enter position: ");
        position = input.nextLine();

        System.out.print("Enter hours worked: ");
        hoursWorked = input.nextDouble();

        System.out.print("Enter hourly rate: ");
        hourlyRate = input.nextDouble();

        System.out.println("\nEmployee Payroll Record");
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Position: " + position);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Hourly Rate: PHP " + hourlyRate);

        input.close();
    }
}
