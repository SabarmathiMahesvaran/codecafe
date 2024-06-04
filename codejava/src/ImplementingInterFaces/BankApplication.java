package ImplementingInterFaces;

public class BankApplication {

	public static void main(String[] args) {
		Bank Bank=new BankImpl();
		//we create the account
		Account account=new Account(1238986,"Sabar",500000,Bank);
		//we deposit the money
		 account.Deposit(2000);
		//now we print the deposit money
		System.out.println(account);
		//we withdraw the money
		account.withdraw(10000);
		//now we print to withdraw the money
		System.out.println(account);

	}

}
