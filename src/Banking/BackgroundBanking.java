package Banking;

public class BackgroundBanking {
    private int currentBalance = 0;

    public BackgroundBanking(int currentBalance) {
        this.currentBalance = currentBalance;
    }

    public int getCurrentBalance() {
        return currentBalance;
    }

    public boolean withdraw(int amount) {
        if (amount <= currentBalance){
            currentBalance -= amount;
            System.out.println("Successfully deposited $" + amount);
            return true;
        } else {
            System.out.println("Deposit must be positive.");
            return false;
        }
    }
}
