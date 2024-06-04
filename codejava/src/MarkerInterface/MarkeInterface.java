package MarkerInterface;

public class MarkeInterface {

	public static void main(String[] args) {
		Student s=new Student(45,"ellalan",12234,"HDFD");
	     if (s instanceof Registrable)
		 System.out.println("The student is Registrable of this course");
		else
		 System.out.println("The studentis not Registrable of this course");
		
		


	}

}
