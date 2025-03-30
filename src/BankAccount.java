public class BankAccount{
    private double amount;

    public void put(double value) {
        if (value > 0) {
            amount += value;
        }
    }

    public void take(double value) {
        if (value > 0 && amount >= value) {
            amount -= value;
        }
    }

    public double getAmount() {
        return amount;
    }
}
