//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class StringEquality
{
	private String wordOne, wordTwo;

	public StringEquality()
	{
		wordOne = "";
		wordTwo = "";
	}

	public StringEquality(String one, String two)
	{
		setWords(one,two);
	}

	public void setWords(String one, String two)
	{
		wordOne = one;
		wordTwo = two;
	}

	public boolean checkEquality( )
	{
		if(wordOne.length() != wordTwo.length() || wordOne != wordTwo)
		{
			return false;
		}
		else
		{
			return true;
		}
	}

	public String toString()
	{
		if (checkEquality() == false)
		{
			return wordOne + " does not have the same letters as " + wordTwo + "\n";
		}
		else
		{
			return wordOne + " has the same letters as " + wordTwo + "\n";
		}
		
	}
}