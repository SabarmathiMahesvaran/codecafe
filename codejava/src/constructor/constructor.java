package constructor;

public class constructor {
	private int rollno;
	private String name;
	private int age;
	public constructor()//default constructor
	{
		
	}
	public constructor(int rollno,String name)//parameterized with two argument
	{
		System.out.println("parameterized constructor with 2 agruments");
		this.rollno=rollno;
		this.name=name;
	}
	public constructor(int rollno,String name,int age)//parameterized with three argument
	{
	System.out.println("Parameterized constructor with 3 agruments");
	this.rollno = rollno;
	this.name = name;
	this.age=age;
	}
	public int  getRollNo()
	{
		return rollno;

	}
	public void rollno(int rollno)
	{
		this.rollno=rollno;
	}
	public String name()
	{
		return name;
	}
	public void name(String name)
	{
		this.name=name;
	}
	public int age()
	{
		return age;
	}
	public String toString()
	{
		return "constructor rollno="+rollno+"name="+name+"age="+age;
	}

}
