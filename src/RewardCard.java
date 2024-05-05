public class RewardCard extends CreditCard{
    private int points;

    public RewardCard(double balance, int points) {
        super(balance);
        this.points = points;
    }

    public void addBalance(double amount) {
        balance += amount;
    }

    public void applyPoints() {
        // Each point is equivalent to 5 cents
        this.balance = this.balance + points * 0.5;

        // Reset points
        points = 0;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

}
