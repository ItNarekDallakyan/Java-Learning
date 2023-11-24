package exceptions.market.cashiers;

import exceptions.market.CashierStrategy;
import exceptions.market.customers.CustomerWithCreditCard;
import exceptions.market.customers.NormalCustomer;
import exceptions.market.strategies.AngryStrategy;
import exceptions.market.strategies.FriendlyStrategy;

public class StrangeCashier extends AbstractCashier {

    public CashierStrategy strategy(Class customerClass) {
        if (NormalCustomer.class.isAssignableFrom(customerClass) || CustomerWithCreditCard.class.isAssignableFrom(customerClass))
            return new AngryStrategy(); // странный кассир с обычными покупателями злой
        else
            return new FriendlyStrategy(); // с медленными покупателями - дружелюбный
    }
}


