package collections.list.arraylist.bank;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

/**
 * @author IT-HOME
 */
public class User {

    private String firstName;

    private String lastName;

    private String uuid;

    private byte pinHash[];

    private ArrayList<Account> accounts;


    public User(String firstName, String lastName, String pin, Bank theBank){
        this.firstName = firstName;
        this.lastName = lastName;

        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            this.pinHash = md.digest(pin.getBytes());

        } catch (NoSuchAlgorithmException e) {
            System.err.println("Error, Caught NoSuchAlgorithmException");
            e.printStackTrace();
            System.exit(1);
        }

        this.uuid = theBank.getNewUserUUID();

        this.accounts = new ArrayList<>();
        System.out.printf("New user %s, %s with ID %s created.\n", lastName, firstName, this.uuid);
    }

     void addAccount(Account onAcct){
        this.accounts.add(onAcct);
    }

     String getUUID(){
        return this.uuid;

    }

     boolean validatePin(String aPin){

        try {
            MessageDigest md = MessageDigest.getInstance("MD5");

            return MessageDigest.isEqual(md.digest(aPin.getBytes()), this.pinHash);
        } catch (NoSuchAlgorithmException e) {
            System.err.println("Error, Caught NosuchAlgorithmException");

            e.printStackTrace();
            System.exit(1);

        }
        return false;
    }

    public String getFirstName(){
        return this.firstName;
    }

    void printAccountsSummary(){

        System.out.printf("\n\n%s Accounts summary\n", this.firstName);
        for (int a = 0; a < this.accounts.size(); a++) {
            System.out.printf("%d. %s\n Accounts summary\n", a + 1, this.accounts.get(a).getSummaryLine());
        }
        System.out.println();
    }

    int numAccounts(){

        return this.accounts.size();
    }


    void printAcctTransHistory(int acctIdx){
        this.accounts.get(acctIdx).printTransHistory();
    }

    double getAcctBalance(int acctIdx){


        return this.accounts.get(acctIdx).getBalance();
    }

    String getAcctUUID(int acctIdx){

        return this.accounts.get(acctIdx).getUUID();
    }

    void addAcctTransaction(int acctIdx, double amount, String memo){
        this.accounts.get(acctIdx).addTransaction(amount, memo);
    }
}
