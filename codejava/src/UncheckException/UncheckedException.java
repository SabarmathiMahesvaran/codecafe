package UncheckException;

public class UncheckedException {

	public static void main(String[] args) {
		int x[];
		try
		{
		  x=new int[] {1,2,3,4};
		System.out.println(x[6]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.err.println("Special task of array"+e.getMessage());
		}

	}

}
