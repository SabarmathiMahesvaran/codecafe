package ThirdPackage;

public class Class {
	//object is the static memory we can call anywhere in the class
	private static Class obj= new Class();
	private int id;
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	private Class()
	{
		System.out.println("CLass object is created");
	}
	public static Class getObject()
	{
		return obj;
	}
	@Override
	public String toString() {
		return "Class [id=" + id + "]";
	}
	
	
	
	

}
