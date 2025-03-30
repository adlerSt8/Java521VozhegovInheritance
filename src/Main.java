//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        CardAccount cardAccount = new CardAccount();
        DepositAccount depositAccount = new DepositAccount();

        account.put(1000);
        account.put(-1000);
        System.out.println(account.getAmount());
        account.put(700);
        account.put(7800);
        System.out.println(account.getAmount());
        account.take(1000);
        account.take(-1000);
        account.take(-1000);
        System.out.println(account.getAmount());

        cardAccount.put(1000);
        cardAccount.take(-100);
        cardAccount.take(500);
        System.out.println(cardAccount.getAmount());
        //put, take клади, бери

        depositAccount.put(10000);
        depositAccount.take(5000);
        System.out.println(depositAccount.getAmount());
    }
}