package ImplementingInterFaces;

public interface Bank {
	 double MIN_BALANCES=1000;
	 double DEPOSIT_LIMIT=25000;
	 double RATE_INTEREST=7.8;
	 
	 void Deposit(Account account,double amount);
	 void withdraw(Account account,double amount);
	

}
