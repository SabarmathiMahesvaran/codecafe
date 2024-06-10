package NestedTryCatchExample.java;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NestedTryCatchExample {

	public static void main(String[] args) {
		String Name;
		int pos;
		try(Scanner mv=new Scanner(System.in)){
			try
			{
				System.out.println("Enter the name");
				Name=mv.next();
				System.out.println("Enter the position");
				pos=mv.nextInt();
			
			try 
			{
				System.out.println("Character"+Name+"is"+pos+Name.charAt(pos));
			}
			
			
			catch(StringIndexOutOfBoundsException c)
			{
				System.out.println(c.getMessage());
			}
			}
			catch(InputMismatchException c)
			{
				System.out.println("Please Enter the integer value"+c.getMessage());
			}
			
		}
	}
}
			
			

