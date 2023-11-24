package collections.list.arraylist.bank;

import java.util.Date;

/**
 * @author IT-HOME
 */

public class Transaction {

    private double amount;

    private Date timestamp;

    private String memo;

    private Account inAccount;

    private Transaction(double amount, Account inAccount){

        this.amount = amount;
        this.inAccount = inAccount;
        this.timestamp = new Date();
        this.memo = "";

    }

    Transaction(double amount, String memo, Account inAccount){

        this(amount, inAccount);
        this.memo = memo;

    }

    public double getAmount(){

        return this.amount;

    }

    String getSummaryLine(){
        if (this.amount >= 0) {
            return String.format("%s : $%.02f :%s,", this.timestamp.toString(), this.amount, this.memo);
        } else {
            return String.format("%s : $(%.02f) :%s,", this.timestamp.toString(), this.amount, this.memo);

        }
    }
}