package MutileveInheritance;

public class NotePad {
	protected String contents;
	public NotePad()
	{
		this.contents="";
	}
	public void Text(String text)
	{
	 contents+=text;
	}
	public void contentsDisplay(String string)
	{
		System.out.println("contents="+ contents);
	}

}
