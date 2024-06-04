package InstanceOfInterface;

public class PhoneFactory {
	public static Phone CreatePhone(String Company)
	{
		if(Company.equalsIgnoreCase("Samsung"))
			return new Samsung();
		else if (Company.equalsIgnoreCase("jio"))
			return new jio();
			return null;
	}

}
