package Banking;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Banking {
    static Scanner sc = new Scanner(System.in);
    static int amount = 0;

    public static void main(String[] args) {
        BackgroundBanking balance = new BackgroundBanking(1000);
        System.out.println("Your current balance is $" + balance.getCurrentBalance());

            //System.out.print("Would you like to deposit a banking account? (y/n): ");
            String response = "";
            do {
                System.out.print("Would you like to withdraw a banking account? (y/n): ");
                response = sc.nextLine().toLowerCase();

                switch (response) {
                    case "y":
                        do {
                            System.out.print("Enter the amount of withdraw: ");
                            amount = sc.nextInt();
                        } while(!balance.withdraw(amount));
                        break;
                    case "n":
                        System.out.println("Thank you for using our bank.");
                        break;
                    default:
                        System.out.println("That is not a valid option. Try again.");
                        break;
                }
            } while (!response.equalsIgnoreCase("y") && !response.equalsIgnoreCase("n"));
            //it loops forever.
            //what is the "!"? does it mean not?

            System.out.println("Your current deposit is $" + balance.getCurrentBalance());
    }
}
