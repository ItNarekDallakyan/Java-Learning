package exceptions.market.cashiers;
import exceptions.market.Cashier;
import exceptions.market.CashierStrategy;
import exceptions.market.exceptions.CashierHasNoChange;

import java.util.Random;

public abstract class AbstractCashier implements Cashier {
    @Override
    public abstract CashierStrategy strategy(Class customerClass);
    public void giveChange() throws CashierHasNoChange
    {
        Random random = new Random();
        if ((random.nextInt(150) + 1) <= 60) // вероятность того, что у кассира не будет сдачи
            throw new CashierHasNoChange("Cashier has no change!");
    }
}
