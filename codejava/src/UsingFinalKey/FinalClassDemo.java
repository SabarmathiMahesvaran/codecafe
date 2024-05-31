package UsingFinalKey;

final class FinalClass{
	void show()
	{
		System.out.println("final class cannot be extends");
	}
}
class FinalVariable extends FinalClass();

public class FinalClassDemo {
	public static void main(String[] args) {
	//Create the object for the final class
		FinalClass f1=new FinalClass();
		f1.show();

	}

}
