package exceptions.market.cashiers;

import exceptions.market.CashierStrategy;
import exceptions.market.customers.CustomerWithCreditCard;
import exceptions.market.customers.NormalCustomer;
import exceptions.market.strategies.AngryStrategy;
import exceptions.market.strategies.CommonStrategy;

public class NormalCashier extends AbstractCashier {
    public CashierStrategy strategy(Class customerClass) {
        if (NormalCustomer.class.isAssignableFrom(customerClass) || CustomerWithCreditCard.class.isAssignableFrom(customerClass))
            return new CommonStrategy(); // с обычными покупателями - обычная стратегия
        else
            return new AngryStrategy(); // с медленными - он злой


    }
}
