package ImplementingInterFaces;

public  class BankImpl implements Bank {

	@Override
	  public void Deposit(Account account, double amount )
	{
		if(amount>DEPOSIT_LIMIT)
			System.err.println("Deposit is not possible. if the amount is access with limit deposit");
		else
			account.setBalance(account.getBalance()+amount);
		System.out.println("Deposit="+amount+",into AccountNo="+account.getBalance());
		
		
	}

	@Override
	public void withdraw(Account account, double amount) 
	{
	 if(account.getBalance()-amount >=MIN_BALANCES)
		 System.out.println("withdraw="+amount+",from AccountNo="+account.getBalance());
	 else
		 System.out.println("The remaining balance in account:"+account.getBalance());
	 
	}
	

}
