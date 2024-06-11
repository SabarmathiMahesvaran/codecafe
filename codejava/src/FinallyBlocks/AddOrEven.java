package FinallyBlocks;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AddOrEven {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		try
		{
			System.out.println("Entet the number:");
			int Number= scanner.nextInt();
			System.out.println(Number %2==0?+Number+"is Even":Number+"\nIs Odd");
		}
		catch(InputMismatchException k)
		{
			System.out.println("The input is invalied");
		}
		finally
		{
			System.out.println(".............finally");
			scanner.close();
		}
		

	}

}
