package InstanceOfInterface;

public class Executor{

	public static void main(String[] args) {
		Phone phone= PhoneFactory.CreatePhone("Samsung");
		phone.call();
		phone.sms();
		 
		Phone phone1= PhoneFactory.CreatePhone("jio");
		 phone1.call();
		 phone1.sms();
		

	}

}
