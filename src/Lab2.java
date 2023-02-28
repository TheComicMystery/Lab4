import java.util.Scanner;

public class Lab2 {
    public static void Lab2(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount of purchases: ");
        double amount = scanner.nextDouble();
        double discount = 0;
        if (amount >= 500 && amount <= 1000) {
            discount = 0.05;
        } else if (amount > 1000 && amount <= 10000) {
            discount = 0.07;
        } else if (amount > 10000) {
            discount = 0.09;
        }
        double totalAmountToBePaid = amount - (amount * discount);
        System.out.println("The total amount to be paid is: " + totalAmountToBePaid + " UAH. Have a good day!");
    }
}