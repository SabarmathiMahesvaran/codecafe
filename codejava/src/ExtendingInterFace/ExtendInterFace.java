package ExtendingInterFace;

public class ExtendInterFace implements ChildInterFace {
//now we call the display and show in the different class
	//override the interface method
        public void display()
		{
			System.out.println("print display");
		}
        //override the ChildInterFace method
		public void show()
		{
		System.out.println("print show");
		
     	}
	}


