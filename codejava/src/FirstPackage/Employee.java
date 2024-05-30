package FirstPackage;

public class Employee {
	private int Employeeid;
	private String EmployeeName;
	private int EmployeeAge;
	private String EmployeeCity;
	public int getEmployeeid()
	{
		return Employeeid;
	}
	public void setEmployeeid(int Employeeid)
	{
		this.Employeeid=Employeeid;
	}
	public String getEmployeeName()
	{
		return EmployeeName;	
	}
	public void setEmployeeName(String EmployeeName)
	{
		this.EmployeeName=EmployeeName;
	}
	public int getEmployeeAge()
	{
		return EmployeeAge;
	}
	public void setEmployeeAge(int EmployeeAge)
	{
		this.EmployeeAge=EmployeeAge;
	}
	public String getEmployeeCity()
	{
		return EmployeeCity;
	}
	public void setEmployeecity(String EmployeeCity)
	{
		this.EmployeeCity=EmployeeCity;
		}
	public Employee() {
		System.out.println("Default constructor");
	}
	public Employee(int Employeeid,String EmployeeName,int EmployeeAge,String EmployeeCity) 
	{
		System.out.println("parameterized constructor");
		
	this.Employeeid=Employeeid;
	this.EmployeeName=EmployeeName;
	this.EmployeeAge=EmployeeAge;
	this.EmployeeCity=EmployeeCity;
	}

}
