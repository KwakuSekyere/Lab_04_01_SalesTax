import java.util.Scanner;

public class SalesTaxCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the purchase price: $");
        double purchasePrice = scanner.nextDouble();

        double salesTax = 0.05 * purchasePrice;

        System.out.printf("Purchase Price: $%.2f%n", purchasePrice);
        System.out.printf("Sales Tax (5%%): $%.2f%n", salesTax);

        scanner.close();
    }
}
