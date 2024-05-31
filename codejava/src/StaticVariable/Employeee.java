package StaticVariable;

public class Employeee {

	private int id;
	private String name;
	static String CompanyName="TATA";
	//Now we call the parameterized constructor 
	
	Employeee(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	@Override
	public String toString()
	{
		return "Employee details\n[EmployeeId="+id+"  EmployeeName="+name+"  CompanyName="+CompanyName+"]";
	}
    	
}