package TryCatch;
	public class TryCatch {
		static  int performAddtion(int x,int y) 
		{
			System.out.println("It is use add the interger value");
			int z=0;
		
		try
		{
			z=x+y;
			System.out.println("Addition="+z);
		}
		catch(ArithmeticException bf)
		{
			System.out.println("This is the Catch block"+bf.getMessage());
			System.out.println("NextLine");
		}
		return z;
		}
		static float performAddition(float a,float b)
		{
			return a+b;
		}
		
		

	}
	



