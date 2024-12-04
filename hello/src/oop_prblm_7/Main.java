package oop_prblm_7;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Bank bank = new Bank();
		
		Account ac1 = new Account("Sajib","SA0145622","Savings",100);
		Account ac2 = new Account("Rajib","SA0145f4115222","DPS",200);
		
		bank.addAccount(ac1);
		bank.addAccount(ac2);
		
		ArrayList<Account> accountList = bank.getAccounts();
		
		for(Account ac: accountList) {
			System.out.println(ac.getAccountInfo());
		}
		
		bank.removeAccount(ac1);
		System.out.println("\nAfter removing Account of "+ac1.getAccountName());
		for(Account ac: accountList) {
			System.out.println(ac.getAccountInfo());
		}
		
		bank.depositMoney(ac2, 500);
		
		for(Account ac: accountList) {
			System.out.println(ac.getAccountInfo());
		}
		bank.withdrawMoney(ac2, 800);
		for(Account ac: accountList) {
			System.out.println(ac.getAccountInfo());
		}
	}

}
