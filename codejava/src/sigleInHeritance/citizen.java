package sigleInHeritance;

public class citizen {
	private String name;
	private int age;
	private String Address;
	private long PhoneNumber;
	 //we call the default constructor
	public citizen()
	{
		System.out.println("it is the citizen detials");
	}
	//we call the parameterized constructor
	public citizen(String name,int age,String address,long phoneNumber)
	{
		this.name=name;
		this.age=age;
		this.Address=address;
		this.PhoneNumber=phoneNumber;
	}
	public String getname()
	{
		return name;
	}
	public void setname(String name)
	{
		this.name=name;
	}
	public int getage()
	{
		return age;
	}
	public void setage(int age)
	{
		this.age=age;
	}
	public String getaddress()
	{
		return Address;
	}
	public void setaddress(String address)
	{
		this.Address=address;
	}
	public long getPhoneNumber()
	{
		return PhoneNumber;
	}
	public void setPhoneNumber(long phoneNumber)
	{
		this.PhoneNumber=phoneNumber;
	}
	@Override
	public String toString()
	{
		return "citizen [name="+name+",age="+  age+",Address="+  Address+",PhoneNumber="+  PhoneNumber+"]";
	}
}
