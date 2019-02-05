//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class StringOddOrEven
{
	private String word;

	public StringOddOrEven()
	{
		word = "";
	}

	public StringOddOrEven(String s)
	{
		setString(s);
	}

	public void setString(String s)
	{
		word = s;
	}

 	public boolean isEven()
 	{
 		if(word.length() % 2 == 0)
 		{
 			return true;
 		}
 		else 
 		{
 			return false;
 		}
		
	}

 	public String toString()
 	{
 		if ()
 		String output= word + "is";
 		return output;
	}
}