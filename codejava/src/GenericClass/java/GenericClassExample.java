package GenericClass.java;

import java.util.Scanner;

public class GenericClassExample {

	public static void main(String[] args) {
		GenericClass<String> StringObj=new GenericClass<String>();
		 StringObj.setdata("Hello Coders");
		 System.out.println("Enter the String:"+StringObj.getdata());
		 GenericClass<Integer> IntegerObj=new GenericClass<Integer>();
		 IntegerObj.setdata(1);
		 System.out.println("Enter the Integer:"+IntegerObj.getdata());
		 GenericClass<Person> PersonObj=new GenericClass<Person>();
		 PersonObj.setdata(new Person("Chathenya","MG.Nagar"));
		 System.out.println("Enter the person details"+PersonObj.getdata());
	}

}
