package TryCatch;

public class TRyCatchExample{
	public static void main(String[] args) {
		System.out.println("Now we in the main method");
		int result;
		result=TryCatch.performAddtion(50,20);
		if(result!=0)
		{
			System.out.println("Addition="+result);
		}
		System.out.println("__________________________________________");
		float results;
		results=TryCatch.performAddition(25f, 0f);
		if(results!=0)
		{
			System.out.println("Addition="+results);
		}
		System.out.println("__________________________________________");
		System.out.println(TryCatch.performAddition(20,10));
		System.out.println("___________________________________________");
		System.out.println(TryCatch.performAddition(10f,5f));


	}

}

