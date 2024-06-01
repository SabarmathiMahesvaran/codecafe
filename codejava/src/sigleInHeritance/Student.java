package sigleInHeritance;

public class Student extends citizen {
	private int rollNumber;
	private String CollegeName;
	//We  call default constructor
    public Student()
    {
    	super();
    }
    //now we call parameterized constructor
    public Student(String name,int age,String Address,long PhoneNumber,int rollNumber,String CollegeName)
    {
    	super(name, age,Address,PhoneNumber);//accessing the parents class constructor
    	this.CollegeName=CollegeName;
    	this.rollNumber=rollNumber;
    }
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getCollegeName() {
		return CollegeName;
	}
	public void setCollegeName(String collegeName) {
		CollegeName = collegeName;
	}
	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", CollegeName=" + CollegeName + ", getname()=" + getname()
				+ ",getage()=" + getage()+ ", getaddress()=" + getaddress() + ", getPhoneNumber()=" + getPhoneNumber()
				+"]";
	}
    
    

}
