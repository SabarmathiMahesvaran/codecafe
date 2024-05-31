package StaticBlockMethod;

public class MyClassDemo {

	public static void main(String[] args) {
		MyClass o=new MyClass();
		System.out.println(o);
		//we call the static display method
		MyClass.display();
		MyClass o1=new MyClass();
		System.out.println(o1);
		//again we call the static display
		MyClass.display();
		MyClass o2=new MyClass();
		System.out.println(o2);
		//again we call the static display
		MyClass.display();

	}

}
