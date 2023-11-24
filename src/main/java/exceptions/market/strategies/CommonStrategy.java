package exceptions.market.strategies;

import exceptions.market.CashierStrategy;
import exceptions.market.Customer;

public class CommonStrategy implements CashierStrategy {
    int COMMON_COEFFICIENT = 0;
    @Override
    public int communicate(Customer customer) {
       /* System.out.println("Common Strategy");*/
        return customer.buyThings() + COMMON_COEFFICIENT;
    }
}
