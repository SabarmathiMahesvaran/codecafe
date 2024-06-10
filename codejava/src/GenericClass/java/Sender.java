package GenericClass.java;

public class Sender<T> {
	private T message;
	//Default Generic constructor
	public Sender()
	{
		
	}
	//Parameterized Generic constructor
	public Sender(T message)
	{
		this.message=message;
	}
	//Now we call the Generic Method
	public void setmessage(T message)
	{
		this.message=message;
	}
	public void sendmessage()
	{
		System.out.println(message);
	}

}
