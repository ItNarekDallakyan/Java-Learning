package exceptions.market;

import exceptions.market.exceptions.CashierHasNoChange;

public interface Cashier {
    CashierStrategy strategy(Class customerClass);
    void giveChange() throws CashierHasNoChange, CashierHasNoChange;
}
