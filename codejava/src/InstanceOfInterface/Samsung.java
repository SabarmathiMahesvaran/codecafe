package InstanceOfInterface;

public class Samsung implements Phone {
	@Override
	public void call() 
	{
		System.out.println("Call to someone using the samsung");
	}
	@Override
	public void sms()
	{
		System.out.println("Text for someone from the sms");
	}
	

}
