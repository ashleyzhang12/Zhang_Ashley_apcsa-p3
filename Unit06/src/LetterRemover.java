//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class LetterRemover
{
   private String sentence;
   private char lookFor;

	public LetterRemover()
	{
		sentence = "";
		lookFor = 0;
	}

	public LetterRemover(String s, char rem)
	{
		setRemover(s,rem);
	}
	
	
	public void setRemover(String s, char rem)
	{
		sentence = s;
		lookFor = rem;
	}

	public String removeLetters()
	{
		String cleaned= "";
		for(int x = 0; x <= sentence.length() - 1; x = x+1)
		{
			if(sentence.charAt(x) == lookFor)
			{
				cleaned = cleaned;
			}
			else
			{
				cleaned = cleaned + sentence.charAt(x);
			}
		}
		return cleaned + "\n";
	}

	public String toString()
	{
		return sentence + " - letter to remove " + lookFor;
	}
}