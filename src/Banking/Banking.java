package Banking;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Banking {

    static Scanner sc = new Scanner(System.in);
    static int amount = 0;

    public static void main(String[] args) {
        BackgroundBanking balance = new BackgroundBanking(1000);

        System.out.println("Your current balance is $" + balance.getCurrentbalance());

            System.out.print("Would you like to deposit a banking account? (y/n): ");
            String response = sc.nextLine();
            do {
                if (response.equalsIgnoreCase("y")) {
                    System.out.print("Enter the amount of deposit: ");
                    amount = sc.nextInt();
                    balance.deposit(amount); //what does this (amount) does?
                } else if (response.equalsIgnoreCase("n")) {
                    System.out.println("Thank you for using our bank.");
                } else {
                    System.out.println("That is not a valid option. Try again.");
                    break;
                }
            }while (!response.equalsIgnoreCase("y") && !response.equalsIgnoreCase("n"));
            //it loops forever.

            System.out.println("Your current deposit is $" + balance.getCurrentbalance());


    }
}
