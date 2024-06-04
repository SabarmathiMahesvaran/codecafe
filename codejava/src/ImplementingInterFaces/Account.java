package ImplementingInterFaces;

public class Account {
private int AccountNo;
private String Name;
private double balance;
private Bank bank;
 
public Account(int AccountNo,String Name,double balance,Bank bank)
{
	this.AccountNo=AccountNo;
	this.Name=Name;
	this.balance=balance;
	this.bank=bank;
}

public int getAccountNo() 
{
	return AccountNo;
}

public void setAccountNo(int accountNo)
{
	AccountNo = accountNo;
}

public String getName() {
	return Name;
}

public void setName(String name) {
	Name = name;
}

public  double getBalance() {
	return balance;
}

public void setBalance(double balance) {
	this.balance = balance;
}

public Bank getbank() {
	return bank;
}

public void setbank(Bank bank) {
	bank = bank;
}

public void Deposit(double Amount) {
	bank.Deposit(this,Amount);
	
}

public void withdraw(double Amount) {
	bank.withdraw(this,Amount);
	
}
public Bank getBank()
{
	return bank;
}
public void setBank(Bank Bank)
{
	this.bank=Bank;
}
@Override
public String toString() {
	return "Account [AccountNo=" + AccountNo + ", Name=" + Name + ", balance=" + balance + "]";
}


}

