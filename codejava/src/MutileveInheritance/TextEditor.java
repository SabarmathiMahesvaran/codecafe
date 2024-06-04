package MutileveInheritance;

public class TextEditor {

	public static void main(String[] args) {
		Word word=new Word();
		word.Text("Hello");
		word.TextFormate(true);
		word.contentsDisplay("Coders");
		word.SpellingCheck();
		System.out.println("In the wordPad there is a bold?"+word.isbold());
		System.out.println("Disable to checking the spelling in the world");
		word.EnableSpellingCheck(false);
	    word.SpellingCheck();
	    
		

	}

}
