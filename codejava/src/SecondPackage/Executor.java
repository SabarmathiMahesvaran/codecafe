package SecondPackage;

import FirstPackage.Base;

public class Executor {

	public static void main(String[] args) {
		//import the firstpackage class
		Base b1=new Base();
		//we access the private class only
		//we call the default variable
		b1.methodPublic();
		//we assigning the value for the public variable
		b1.varPublic =50;
        b1.methodPublic();		
		
	}

}
