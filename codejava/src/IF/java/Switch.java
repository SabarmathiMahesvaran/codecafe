package IF.java;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char x='S';
		switch(x)
		{
		case 'l':
		case 'L':
		 System.out.println(x+" is a letter ");
		 break;
		case 'w':
		case 'W':
		  System.out.println(x+" is a white space");
		  break;
		case 'd':
		case 'D':
			System.out.println(x+" is a dight");
			break;
		case 's':
		case 'S':
			System.out.println(x+" is a special symbol");
			break;
		default:
			System.out.println(x+" other than letter,white space.dight,special symbol");
			break;
		}
	}

}
