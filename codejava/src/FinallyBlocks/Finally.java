package FinallyBlocks;

import java.util.Scanner;

public class Finally {

	public static void main(String[] args) {
	 String Name;
	 int RollNo;
	 int Address;
	 int PhoneNumber;
	 Scanner scanner=new Scanner(System.in);
	 System.out.println("Enter the personal details");
	 String name=scanner.next();
	 int rollno=scanner.nextInt();
	 int address=scanner.nextInt();
	 int phonenumber=scanner.nextInt();
	 try
	 {
		 System.out.println("Enter the personal details");
		 System.out.println("Name="+name+",\nRollNo="+rollno+",\nAddress="+address+",\nPhoneNumber="+phonenumber);
	 }
	 catch(StringIndexOutOfBoundsException e)
	 {
		 System.out.println("check the input value");
	 }
	 finally
	 {
		 System.out.println("........It is the Finally");
		 scanner.close();
	 }
	}

}
