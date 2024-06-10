package Exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class exception {

	public static void main(String[] args)throws IOException
	{

		int a,b;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the value");
		a=Integer.parseInt(br.readLine());
		b=Integer.parseInt(br.readLine());
		try
		{
			int c=a+b;
			System.out.println("Addition:"+c);
		}
		catch(ArithmeticException sk)
		{
		System.out.println("Please entry the positive numbers"+sk.getMessage());
		System.out.println("NextLine");
		}
	}

}
