package MarkerInterface;

public class Student implements Registrable {
	private int RollNo;
	private String name;
	private int id;
	private String course;
	 Student()
	{
		super();
	}
	public Student(int rollNo,String name,int id,String course)
	{
		super();
		this.RollNo=rollNo;
		this.name=name;
		this.id=id;
		this.course=course;
		
	}
	public int getRollNo() {
		return RollNo;
	}
	public void setRollNo(int rollNo) {
		RollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "Student [RollNo=" + RollNo + ", name=" + name + ", id=" + id + ", course=" + course + "]";
	}
	
	

}
