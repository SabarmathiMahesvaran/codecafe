package OverRiding;

public class overRiding {

	public static void main(String[] args) {
		//we inhertances all the sub class
	RBI R;
	R=new SBI();
	System.out.println(R.getRateOfInterest());
	R=new ICIC();
	System.out.println(R.getRateOfInterest());
	R=new HDFD();
	System.out.println(R.getRateOfInterest());
	

	}

}
