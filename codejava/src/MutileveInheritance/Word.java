package MutileveInheritance;

public class Word extends wordPad {
	private boolean SpellingCheck;
	//Now we call deafult constructor 
	public Word()
	{
		super();
		this.SpellingCheck=true;
	}
	//now we call parameterized constructor
	public void SpellingCheck()
	{
		if(SpellingCheck)
		{
		System.out.println("Spell check in running mood");	
		}
		else
		{
			System.out.println("disable to check the spell");
		}
			}
	public void EnableSpellingCheck(boolean enable) {
		SpellingCheck=enable;
	}
	

}
