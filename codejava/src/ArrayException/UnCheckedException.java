package ArrayException;

public class UnCheckedException {

	public static void main(String[] args) {
		int x[];
		try
		{
		 x=new int[] {1,2,3,4};
		 System.out.println(x[6]);
		 }
		catch(ArrayIndexOutOfBoundsException c) {
			System.err.println("your index dose not exits:"+c.getMessage());
		}

	}

}
