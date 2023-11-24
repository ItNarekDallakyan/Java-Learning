package exceptions.market.customers;

public class SlowlyCustomer extends AbstractCustomer {
    @Override
    public int buyThings() {
        return 100;
    }
}
