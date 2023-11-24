
package exceptions.market.cashiers;

import exceptions.market.CashierStrategy;
import exceptions.market.customers.CustomerWithCreditCard;
import exceptions.market.customers.NormalCustomer;
import exceptions.market.strategies.CommonStrategy;
import exceptions.market.strategies.FriendlyStrategy;

public class NiceCashier extends AbstractCashier {
    public CashierStrategy strategy(Class customerClass) {
        if (CustomerWithCreditCard.class.isAssignableFrom(customerClass) || NormalCustomer.class.isAssignableFrom(customerClass))
            return new FriendlyStrategy(); // с обычными покупателями кассир дружелюбный
        else
            return new CommonStrategy(); // с медленными - обычный

    }
}
