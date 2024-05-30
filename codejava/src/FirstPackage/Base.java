package FirstPackage;

public class Base {
	int varDefault=10;
	private int varPrivate=20;
	public int varPublic=40;
	protected int varProtected=50;
	//This is for the default variable we will called any class
	void methodDefault()
	{
		System.out.println("Default access base class is called");
		System.out.println("varDefault:"+varDefault);
	}
	//This is for the private variable but it is not access in the another class
	private void methodPrivate()
	{
		System.out.println("Private access base class is called");
		System.out.println("varPrivate:"+varPrivate);
	}
	//This is for the public class we will called any package or class 
	public void methodPublic()
	{
		System.out.println("Public access base class is called");
		System.out.println("varpublic:"+varPublic);
	}
	//This is for the protected variable we will call any class. if we want to call the protected in any package we want to crate the inhertance
	protected void methodProtected()
	{
		System.out.println("Protected access base class");
		System.out.println("varProtected:"+varProtected);
	}
	

}
