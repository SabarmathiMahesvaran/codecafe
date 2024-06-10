package GenericClass.java;

public class SenderExample {

	public static void main(String[] args) {
		Sender <String> SenderString=new Sender("Hello Coders");
		Sender<Person> SenderPerson=new Sender();
		SenderPerson.setmessage(new Person("Ellalan","vathikuppam"));
		SenderString.sendmessage();
		SenderPerson.sendmessage();
		

	}

}
