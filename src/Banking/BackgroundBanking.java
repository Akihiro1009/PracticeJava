package Banking;

public class BackgroundBanking {
    private int currentbalance = 0;

    public BackgroundBanking(int currentbalance){
        this.currentbalance = currentbalance;
    }

    public int getCurrentbalance(){
        return currentbalance;
    }

    public void deposit(int amount){
        if(amount < currentbalance){
            currentbalance -= amount;
            System.out.println("Successfully deposited $" + amount);
        }
        else{
            System.out.println("Deposit must be positive.");
        }
    }

}
