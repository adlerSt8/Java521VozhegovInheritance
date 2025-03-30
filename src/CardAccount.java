public class CardAccount extends BankAccount{
    private static final double PERCENT = 0.01;

    @Override
    public void take(double value){
        super.take(value + (value * PERCENT));
    }
}
