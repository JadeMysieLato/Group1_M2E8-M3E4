import java.util.Scanner;

public class ShoppingBillVAT {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double productPrice;
        int quantity;
        double subtotal;
        double vat;
        double total;

        System.out.print("Enter product price: ");
        productPrice = input.nextDouble();

        System.out.print("Enter quantity: ");
        quantity = input.nextInt();

        subtotal = productPrice * quantity;
        vat = subtotal * 0.12;
        total = subtotal + vat;

        System.out.println("Subtotal: PHP " + subtotal);
        System.out.println("VAT: PHP " + vat);
        System.out.println("Total: PHP " + total);

        input.close();
    }
}
