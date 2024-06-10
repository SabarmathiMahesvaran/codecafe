package GenericClass.java;

public class GenericInterface {

	public static void main(String[] args) {
		//Now we create for the Float value
		Float arr[]= {12.3f,44.5f,6.00f,45.05f};
		MinMaxImpl<Float> objOne=new MinMaxImpl<Float>(arr);
		System.out.println("Enter the Minimum Float value:"+objOne.min());
		System.out.println("Enter the Maximum Float vale:"+objOne.max());
		//Now we create for the String value
		String arr1[]= {"Sabar","Ellalan","Deva","Krishna","ram"};
		MinMaxImpl<String> objTwo=new MinMaxImpl<String>(arr1);
		System.out.println("Enter the Minimum String value:"+objTwo.min());
		System.out.println("Enter the Maximum String value:"+objTwo.max());
		//Now we create for the person 
		
		  Person[] p=new Person[] {new Person("Roja","Vathikuppam"),new Person("Mahesvaran","Mariamman kovil")};
		  MinMaxImpl<Person>objThree=new MinMaxImpl<Person> (p);
		  System.out.println("Enter the Minimum personal values:"+objThree.min());
		  System.out.println("Enter the Maximum personal values:"+objThree.max());
		  
		 
		

	}

}
