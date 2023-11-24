package exceptions.market;

import exceptions.market.cashiers.NiceCashier;
import exceptions.market.cashiers.NormalCashier;
import exceptions.market.cashiers.StrangeCashier;
import exceptions.market.customers.CustomerWithCreditCard;
import exceptions.market.customers.NormalCustomer;
import exceptions.market.customers.SlowlyCustomer;

import java.util.Random;
public class Application implements Runnable{

    private Customer randomCustomer()
    {
        if(new Random().nextInt(2) == 0)
            return new CustomerWithCreditCard();
        else {
            if(new Random().nextBoolean())
                return new NormalCustomer();
            else return new SlowlyCustomer();
        }
    }

    /* private Cashier randomCashier()
     {
         if (new Random().nextInt(2) == 0) {
             System.out.println("Nice Cashier");
             return new NiceCashier();
         }
         else {
             if(new Random().nextBoolean()) {
                 System.out.println("Strange Cashier");
                 return new StrangeCashier();
             }
             else {
                 System.out.println("Normal Cashier");
                 return new NormalCashier();
             }
         }
     }*/
    public void run() {
        System.out.println("Nice Cashier");
        Register register = new Register(new NiceCashier());
        for (int i = 0; i < 20; i++) {
            register.newCustomer(randomCustomer());
        }
        register.run();
        System.out.println("Strange Cashier");
        register = new Register(new StrangeCashier());
        for (int i = 0; i < 20; i++) {
            register.newCustomer(randomCustomer());
        }
        register.run();
        System.out.println("Normal Cashier");
        register = new Register(new NormalCashier());
        for (int i = 0; i < 20; i++) {
            register.newCustomer(randomCustomer());
        }
        register.run();

    }

}
