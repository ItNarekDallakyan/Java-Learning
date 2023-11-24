package exceptions.market.strategies;

import exceptions.market.CashierStrategy;
import exceptions.market.Customer;

public class AngryStrategy implements CashierStrategy {
    int ANGRY_COEFFICIENT = 3;
    @Override
    public int communicate(Customer customer) {

        return customer.buyThings() + ANGRY_COEFFICIENT;
    }
}
