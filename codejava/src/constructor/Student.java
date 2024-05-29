package constructor;

public class Student {
	private int eid;
	private String name;
	private int age;
	//default constructor
	public Student()
	{
		this(113,"sabar",18);
	System.out.println("default constructor is called");	
	}
	//parameterized constructor
	public Student(int eid,String name,int age)
	{
		//this(); 
        this.eid=eid;
		this.name=name;
		this.age=age;
	}
	
	public int getEid()
	{
		return eid;
	}
	public void  setEid(int eid)
	{
		this.eid=eid;
	}
	public String name()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public int getAge()
	{
		return age;
	}
	public void setAge()
	{
		this.age=age;
	}
	
	public String toString()
	{
	 return "Student eid="+eid+"name="+name+"age="+age;
	}
}
