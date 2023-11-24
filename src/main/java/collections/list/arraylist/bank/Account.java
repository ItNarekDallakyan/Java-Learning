package collections.list.arraylist.bank;

import java.util.ArrayList;

 class Account {

    private String name;
    private String uuid;
    private User holder;
    private ArrayList<Transaction> transaction;

     Account(String name, User holder, Bank theBank){
        this.name = name;
        this.holder = holder;
        this.uuid = theBank.getNewAccontUUID();
        this.transaction = new ArrayList<>();

    }

     String getUUID(){

        return this.uuid;

    }

     String getSummaryLine(){
        double balance = this.getBalance();
        if (balance >= 0) {
            return String.format("%s : $%.02f : %s", this.uuid, balance, this.name);
        } else {
            return String.format("%s : $(%.02f) : %s", this.uuid, balance, this.name);
        }
    }

     double getBalance(){
        double balance = 0;
        for (Transaction t : this.transaction) {
            balance += t.getAmount();
        }
        return balance;
    }


     void printTransHistory(){

        System.out.printf("\nTranscation History for accounts %s\n", this.uuid);
        for (int t = this.transaction.size() - 1; t >= 0; t--) {
            System.out.printf(this.transaction.get(t).getSummaryLine());

        }
        System.out.println();

    }

     void addTransaction(double amount, String memo){

        Transaction newTrans = new Transaction(amount, memo, this);
        this.transaction.add(newTrans);
    }

}
