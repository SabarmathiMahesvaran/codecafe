package MultipleCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleCatchExample {

	public static void main(String[] args) {
		System.out.println("Now we in main Block");
		int s,k,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two number");
		while(true)
		{
			try {
				s=sc.nextInt();
				k=sc.nextInt();
				c=s/k;
				System.out.println("Division="+c);
			}
		
		catch(InputMismatchException e)
		{
			System.out.println("Please enter the integer value only"+e.getMessage());
			break;
		}
		catch(ArithmeticException e)
			{
			System.out.println("Please check the input value"+e.getMessage());
			break;
			}
		catch(Exception e)
			{
			System.out.println("It is the invalid input");
			}

	}

  }
}
