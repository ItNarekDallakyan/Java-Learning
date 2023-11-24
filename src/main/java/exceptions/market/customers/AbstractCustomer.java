package exceptions.market.customers;
import exceptions.market.Customer;

public abstract class AbstractCustomer implements Customer {
    int timeOfShopping;
    public AbstractCustomer()
    {
        timeOfShopping = 0;
    }
}
