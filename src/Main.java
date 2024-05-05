//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard(100);
        RewardCard rewardCard = new RewardCard(100, 10);
        creditCard.addBalance(2000);
        rewardCard.addBalance(2000);
        System.out.println(creditCard.getBalance() + "-" + rewardCard.getBalance());
        rewardCard.applyPoints();
        System.out.println(rewardCard.getBalance());
    }
}