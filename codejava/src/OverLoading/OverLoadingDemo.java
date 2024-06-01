package OverLoading;

public class OverLoadingDemo {

	public static void main(String[] args) {
		System.out.println("_____________Constructor Method______________");
		//default constructor
		Point p=new Point();
		System.out.println(p);
		//parameterized constructor with one arguments
		Point p1=new Point(10.4f);
		System.out.println(p1);
		//parameterized constructor with two arguments
		Point p2=new Point(12.3f,23.4f);
		System.out.println(p2);
		System.out.println("_______________Method OverLoading______________");
		System.out.println("Addition of the two integer:"+ MethodOverLoading.addition(10,20));
		System.out.println("Addition of the two float:"+ MethodOverLoading.addition(20.5f,50.5f));
		System.out.println("Addition of one integer and one float:"+ MethodOverLoading.addition(10,10.5f));
		System.out.println("Addition of one float and one integer:"+ MethodOverLoading.addition(40.5f,50));
		System.out.println("addition of two String:"+ MethodOverLoading.addition("Hello","Coders"));
		

	}

}
