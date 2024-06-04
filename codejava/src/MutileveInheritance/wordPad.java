package MutileveInheritance;

public class wordPad extends NotePad {
	private boolean isbold;
	//WE call default constructor
	 public wordPad()
	 {
		 super();
		 this.isbold=false;
	 }
	 //now we call parameterized constructor
	 public void TextFormate(boolean bold)
	 {
	 if(bold)
	 {
		 contents="<b>"+contents+"</b";
	 }
	isbold=bold;
	 }
	 
	 public boolean isbold()
	 {
		 return  isbold;
	 }
	 
	 

}
