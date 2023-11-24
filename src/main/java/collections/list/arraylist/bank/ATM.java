package collections.list.arraylist.bank;

import java.util.Scanner;

public class ATM {



		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			
			Bank theBank = new Bank("Bank of BB");
			
			User aUser = theBank.addUser("Madona", "Syombua", "1234");
			Account newAccount = new Account("Checking", aUser, theBank);
			aUser.addAccount(newAccount);
	        theBank.addAccount(newAccount);	
	        
	        User curUser;
	        while(true){

	        	curUser = ATM.mainMenuPrompt(theBank, sc);
	        	
	        	ATM.printUserMenu(curUser, sc);
	        }
		}
		private static User mainMenuPrompt(Bank theBank, Scanner sc) {
			String userID;
			String pin;
			User outhUser;

			do{
				System.out.printf("\n\nWelcome to %s\n\n ",theBank.getName());
				System.out.print("Enter user ID: ");
				userID = sc.nextLine();
				System.out.print("Enter Pin: ");
				pin = sc.nextLine();
				

				outhUser = theBank.userLogin(userID, pin);
				
				if(outhUser == null){
					System.out.println("Incorrect user ID/Pin combination" + "Please try again");
				}
				
				
			}while(outhUser == null);
			
			return outhUser;
		}
		private static void printUserMenu(User theUser, Scanner sc) {

			theUser.printAccountsSummary();
			
			int choice;
			do{
				
				System.out.printf("Welcome %s What would you love to do?\n" , theUser.getFirstName());
				System.out.println("  1. Show account Transaction history");
				System.out.println("  2. Withdraw");
				System.out.println("  3. Deposit");
				System.out.println("  4. Transfer");
				System.out.println("  5. Quit");
				System.out.println();
				System.out.println("Enter Choice: ");
				choice = sc.nextInt();			
				
				if(choice <1 || choice> 5){
					System.out.println("Invalicd choice. Please choose 1-5");
				}
			}while(choice <1 || choice>5);
			
			switch (choice){
			
			case 1:
				ATM.showTransHistory(theUser, sc);
				break;
			case 2:
				ATM.withdrawlFunds(theUser,sc);
				break;
			case 3:
				ATM.depositFunds(theUser,sc);
				break;
			case 4: 
				ATM.transferFunds(theUser,sc);
				
				break;	
			}
			
			if(choice != 5){
				System.exit(1);
	 		}
		}
	 private static void showTransHistory(User theUser, Scanner sc) {
			
			int theAcct ;
			do{
				System.out.printf("Enter the number (1-%d) of the account\n"+"whose transactions you want to see:",theUser.numAccounts());
				theAcct = sc.nextInt() -1;
				if(theAcct <0 || theAcct >= theUser.numAccounts()){
					System.out.println("Invalid Account: please try again");
				}
				
				
			}while(theAcct < 0|| theAcct >= theUser.numAccounts());
			theUser.printAcctTransHistory(theAcct);
			
			
		}
	 private static void transferFunds(User theUser, Scanner sc) {
		int fromAcct;
		int toAcct;
		double amount;
		double acctBal;
		
		do{
			System.out.printf("Enter the number (1 - %d of the account\n"+ "to Transfer from:",theUser.numAccounts());
			fromAcct = sc.nextInt()-1;
			
			if(fromAcct <0 || fromAcct >= theUser.numAccounts()){
				System.out.println("Invalid Account: please try again");
			}
			
			
		}while(fromAcct < 0|| fromAcct >= theUser.numAccounts());
		
		acctBal = theUser.getAcctBalance(fromAcct);
		do{
			System.out.printf("Enter the number (1- %d) of the account\n" + "to transafer to:",theUser.numAccounts());
			toAcct =sc.nextInt() - 1;
			
			if(toAcct <0 || toAcct >= theUser.numAccounts()){
				System.out.println("Invalid Account: please try again");
			}
			
			
		}while(toAcct < 0|| toAcct >= theUser.numAccounts());
		
		do{
			System.out.printf("Enter the amount to Transfer(max $%.02f :$",acctBal);
			amount = sc.nextDouble();
			if(amount<0){
				System.out.println("Amount must be greater than Zero.");
			} else if (amount > acctBal){
				System.out.printf("Amount must not be greater than \n" + "balance of $%.02f\n",acctBal);
			}
			

		}while(amount < 0 || amount > acctBal);

		theUser.addAcctTransaction(fromAcct, -1*amount, String.format("Transfer to account %s",theUser.getAcctUUID(toAcct)));
		theUser.addAcctTransaction(toAcct, amount, String.format("Transfer tp account %s",theUser.getAcctUUID(fromAcct)));
	}

	 private static void withdrawlFunds(User theUser, Scanner sc) {
		int fromAcct;
		double amount;
		double acctBal;
		String memo;
		
		do{
			System.out.printf("Enter the number (1-%d )of the account\n"+"to withdraw from:",theUser.numAccounts());
			fromAcct = sc.nextInt()-1;
			
			if(fromAcct <0 || fromAcct >= theUser.numAccounts()){
				System.out.println("Invalid Account: please try again");
			}
			
			
		}while(fromAcct < 0|| fromAcct >= theUser.numAccounts());
		
		acctBal = theUser.getAcctBalance(fromAcct);

		do{
			System.out.printf("Enter the amount to Transfer(max $%.02f, args): $",acctBal);
			amount = sc.nextDouble();
			if(amount<0){
				System.out.println("Amount must be greater than Zero");
			} else if (amount > acctBal){
				System.out.printf("Amount must not be greater than \n" + "balance of $%.02f\n",acctBal);
			}
			

		}while(amount < 0 || amount > acctBal);
		sc.nextLine();
		
		System.out.println("Enter a Memo: ");
		memo = sc.nextLine();
		
		theUser.addAcctTransaction(fromAcct, -1*amount, memo);
	}
		private static void depositFunds(User theUser, Scanner sc) {

			int toAcct;
			double amount;
			double acctBal;
			String memo;
			
			do{
				System.out.printf("Enter the number (1-%d )of the account\n"+ "to deposit in:",theUser.numAccounts());
				toAcct = sc.nextInt()-1;
				
				if(toAcct <0 || toAcct >= theUser.numAccounts()){
					System.out.println("Invalid Account: please try again");
				}
				
				
			}while(toAcct < 0|| toAcct >= theUser.numAccounts());
			
			acctBal = theUser.getAcctBalance(toAcct);
		
			do{
				System.out.printf("Enter the amount to Transfer(max $%.02f, args): $",acctBal);
				amount = sc.nextDouble();
				if(amount<0){
					System.out.println("Amount must be greater than Zero");
				} 
				
		
			}while(amount < 0);
			sc.nextLine();
			
			System.out.println("Enter a Memo: ");
			memo = sc.nextLine();
			
			theUser.addAcctTransaction(toAcct, amount, memo);
		}
	
}
