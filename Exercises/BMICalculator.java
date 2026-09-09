import java.util.Scanner;

public class BMICalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double weight;
        double height;
        double bmi;

        System.out.print("Enter weight in kilograms: ");
        weight = input.nextDouble();

        System.out.print("Enter height in meters: ");
        height = input.nextDouble();

        bmi = weight / (height * height);

        System.out.println("BMI: " + bmi);

        input.close();
    }
}
