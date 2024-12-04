package oop_prblm_7;


public class Account {
       private String accountName;
       private String accountNumber;
       private String accountType;
       private long accountBalance;
       
       
	public Account(String accountName, String accountNumber, String accountType,long accountBalance) {

		this.accountName = accountName;
		this.accountNumber = accountNumber;
		this.accountType = accountType;
		this.accountBalance = accountBalance;
	}
	
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public long getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(long accountBalance) {
		this.accountBalance = accountBalance;
	}
	
	public void deposit(long amount) {
		accountBalance += amount;
	}  
	public void withdraw(long amount) {
		if(amount > accountBalance) {
			System.out.println("No sufficient balance.");
		}
		else {
			accountBalance -= amount;
		}
	}
	public String getAccountInfo() {
		return "name: "+accountName+", Account No: "+accountNumber+", Account Type: "+accountType+", Account Balance: "+accountBalance;
	}
	

	
}
