package FunctionInterFace;

public class functionInterFace {

	public static void main(String[] args) {
		EmployeeClass e= new EmployeeClass();
		System.out.println(e.Employee());
		// using Lambda Expression
			
		EmployeeInterFace e1=()->{return "Good Morning Coders";};
		System.out.println(e1.Employee());
				
	}

}
