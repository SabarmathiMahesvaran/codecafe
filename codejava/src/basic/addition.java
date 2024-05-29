package basic;

import java.util.Scanner;

public class addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner s=new Scanner(System.in);
        System.out.println("enter the values:");
        a=s.nextInt();
        b=s.nextInt();
        c=a+b;
        System.out.println("Addition of a="+a+"and b="+b+"is:"+c);
        }

}
