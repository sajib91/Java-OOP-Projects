package oop_prblm_7;
import java.util.ArrayList;

public class Bank {
	private ArrayList<Account> accountList = new ArrayList<Account> ();
	
	public void addAccount(Account account) {
		accountList.add(account);
	}
	public void removeAccount(Account account) {
		accountList.remove(account);
	}
	public void depositMoney(Account account, long amount) {
		account.deposit(amount);
	}
	public void withdrawMoney(Account account, long amount) {
		account.withdraw(amount);
	}
	
	public ArrayList<Account> getAccounts(){
		return accountList;
	}
}
