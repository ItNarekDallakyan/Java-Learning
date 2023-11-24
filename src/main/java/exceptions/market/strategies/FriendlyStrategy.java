package exceptions.market.strategies;


import exceptions.market.CashierStrategy;
import exceptions.market.Customer;

public class FriendlyStrategy implements CashierStrategy {
    private final static int FRIENDLY_COEFFICIENT = -2;

    public int communicate(Customer customer) {

        return customer.buyThings() + FRIENDLY_COEFFICIENT;

    }
}
