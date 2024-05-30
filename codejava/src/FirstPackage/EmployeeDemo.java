package FirstPackage;
import java.util.Scanner;

public class EmployeeDemo {

	public static void main(String[] args) {
		Employee e1=new Employee();//default constructor
		
		Scanner sk=new Scanner(System.in);
		String EmployeeName,EmployeeCity;
		int Employeeid,EmployeeAge;
		System.out.println("Enter the Employees details:Id,Name,Age,City");
		//we get the employee details in the running mood
		Employeeid=sk.nextInt();
		EmployeeName=sk.next();
		EmployeeAge=sk.nextInt();
		EmployeeCity=sk.next();
		//we get the setter values
		e1.setEmployeeid(Employeeid);
		e1.setEmployeeName(EmployeeName);
		e1.setEmployeeAge(EmployeeAge);
		e1.setEmployeecity(EmployeeCity);
		System.out.println("Employeeid="+e1.getEmployeeid()+"EmployeeName="+e1.getEmployeeName()+"EmployeeAge="+e1.getEmployeeAge()+"EmployeeCity="+e1.getEmployeeCity());
		//Again we get the employee value in running mood with parameterized constructor
		System.out.println("Enter the Employee details:Id,Name.Age,City");
		Employeeid=sk.nextInt();
		EmployeeName=sk.next();
		EmployeeAge=sk.nextInt();
		EmployeeCity=sk.next();
		//We give the value so it is the parameterized constructor
		Employee e2=new Employee(Employeeid,EmployeeName,EmployeeAge,EmployeeCity);
		System.out.println("Employeeid="+e2.getEmployeeid()+"EmployeeName="+e2.getEmployeeName()+"EmployeeAge="+e2.getEmployeeAge()+"EmployeeCity="+e2.getEmployeeCity());
		sk.close();
		
		
		
		
		
		
	}

}
