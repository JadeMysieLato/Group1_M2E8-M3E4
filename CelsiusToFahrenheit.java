import java.util.Scanner;

public class CelsiusToFahrenheit {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double celsius;
        double fahrenheit;

        System.out.print("Enter Celsius temperature: ");
        celsius = input.nextDouble();

        fahrenheit = (celsius * 9.0 / 5.0) + 32;

        System.out.println("Fahrenheit: " + fahrenheit);

        input.close();
    }
}