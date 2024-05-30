package FirstPackage;

public class object {

	public static void main(String[] args) {
		
		Base b1=new Base();
		b1.methodDefault();
		//b1.methodPrivate();
		b1.methodPublic();
		b1.methodProtected();
		//we never give the scanner we directly give the value
		//For default variable
		b1.varDefault=50;
		b1.methodDefault();
		//For private variable but it didn't access in the another class
		//b1.varPrivate=30;
		//b1.methodPrivate();
		//For the public variable 
		b1.varPublic=40;
		b1.methodPublic();
		//For the protected variable
		b1.varProtected=20;
		b1.methodProtected();
		System.out.println("b1 is the instance of the Base class");
		
		
		
		
		
		
		
		
		
	}

}
