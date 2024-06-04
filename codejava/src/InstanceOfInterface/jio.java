package InstanceOfInterface;

public class jio implements Phone {
	@Override
	public void call()
	{
		System.out.println("Call someone using the jio");
	}
	@Override
	public void sms()
	{
		System.out.println("Text someone from the Sms");
	}
	

}
