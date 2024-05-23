package IF.java;

public class NestedIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=30,b=50,c=40;
		System.out.println("Enter the largest number");
		if(a>b)
			if(a>c)
				System.out.println(a);
			else
		   		System.out.println(b);
		{
		 if(c>b)
			 System.out.println(c);
		 else
			 System.out.println(b);
		}
	}
	}


