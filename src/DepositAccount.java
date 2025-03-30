import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class DepositAccount extends BankAccount{
    private LocalDate lastIncome = LocalDate.of(2025, 1, 25);

    @Override
    public void take(double value) {
        //System.out.println("Последняя дата успешного снятия средств: " + lastIncome);

        LocalDate nowDate = LocalDate.now();
        if (ChronoUnit.DAYS.between(lastIncome, nowDate) > 31) {
            super.take(value);
            lastIncome = LocalDate.now();
        }
        //System.out.println("Последняя дата успешного снятия средств: " + lastIncome);
    }
}
