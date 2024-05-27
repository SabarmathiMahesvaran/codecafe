package constructor;

public class constructorDemo {

	public static void main(String[] args) {
		//default constructor
		constructor c=new constructor();
		System.out.println(c);
		//parameterized constructor with two argument
		constructor c1=new constructor(143,"Sabarmathi");
		System.out.println(c1);
		//parameterized constructor with three argument
		constructor c2=new constructor(144,"ellalan",18);
		System.out.println(c2);
		
			}

}
