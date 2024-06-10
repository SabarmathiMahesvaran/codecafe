package GenericClass.java;

public class Person {
	private String Name;
	private String Address;
	public Person()
	{
		
	}
	public Person(String Name,String Address){
		this.Name=Name;
		this.Address=Address;
	}
	
public String getName()
{
	return Name;
}
public void setName(String Name)
{
	this.Name=Name;
}

public String getAddress()
{
	return Address;
}
public void setAddress(String Address)
{
	this.Address=Address;
}
@Override
public String toString() {
	return "Person [Name=" + Name +  ", Address=" + Address + "]";
}

}
