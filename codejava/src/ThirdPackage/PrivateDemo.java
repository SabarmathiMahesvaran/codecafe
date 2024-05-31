package ThirdPackage;

import ThirdPackage.Class;

public class PrivateDemo {

	public static void main(String[] args) {
		//we can't call the class because it is in private class
		//Class m1=new Class();	
		//We want to call with the variable with class name
		Class m=Class.getObject();
		m.setId(40);
		Class m1=Class.getObject();
       System.out.println(m);
       System.out.println(m1);
	}

}
