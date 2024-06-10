package GenericClass.java;

public class GenericmethodExample {

	public static void main(String[] args) {
	GenericMethod obj =new GenericMethod();
	Integer[] intarray= {12,33,56,77,88,};
	String[] str= {"Sabar","Ellalan","krish"};
	Person[] P= {new Person("Sabar","vathikuppam"),new Person("Ellalan","Mariamman kovil")};
	//We display IntegerArray Method
	obj.displayArrayElement(intarray);
	//We display StringArray Method
	obj.displayArrayElement(str);
	//We display PArray Method
	obj.displayArrayElement(P);
	}

}
