//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class Word
{
	private String word;

	public Word()
	{
		word = "";
	}

	public Word(String s)
	{
		setString(s);
	}

	public void setString(String s)
	{
		word = s;
	}

	public char getFirstChar()
	{
		char first = word.charAt(0);
		return first;
	}

	public char getLastChar()
	{
		char last = word.charAt(word.length() - 1);
		return last;
	}

	public String getBackWards()
	{
		String back = "";
		for(int x = 0; x <= word.length()-1; x = x + 1)
		{
			
			back = back + word.charAt(word.length()-x-1);
		}
		return back;
	}

 	public String toString()
 	{
 		return word;
	}
}