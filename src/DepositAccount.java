import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DepositAccount extends BankAccount{
    private LocalDate lastIncome = LocalDate.of(2025, 1, 25);

    @Override
    public void put(double value) {
        super.put(value);
        lastIncome = LocalDate.of(2025, 2, 1);
    }

    @Override
    public void take(double value) {
        LocalDate nowDate = LocalDate.of(2025, 3, 2);
        if (ChronoUnit.MONTHS.between(lastIncome, nowDate) >= 1) {
            super.take(value);
        }
    }
}
