package GenericClass.java;

import java.util.Arrays;
import java.util.List;

public class UnBoundedwildExample {

	public static void main(String[] args) {
		//Now we enter the integer value
  List<Integer>intlist=Arrays.asList(1,5,67,8);
  System.out.println("Enter the integer value:");
  unBoundedWildCard.display(intlist);
  //Now we enter the String value
  List<String>strlist=Arrays.asList("Sabar","Ellalan","Krish");
  System.out.println("Enter the String value:");
  unBoundedWildCard.display(strlist);
  //Now we enter the person value
  Person person[]=new Person[] {new Person("Ellalan","Mariamman kovil"),new Person("Sabar","vathikuppam")};
  List<Person> Personlist=Arrays.asList(person);
  System.out.println("Enter the personal details");
  unBoundedWildCard.display(Personlist);
  
  

	}

}
