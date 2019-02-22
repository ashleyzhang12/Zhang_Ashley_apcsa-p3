//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class TriangleFive
{
   private char letter;
   private int amount;

	public TriangleFive()
	{
		letter = ' ';
		amount = 0;
		setLetter(' ');
	}

	public TriangleFive(char c, int amt)
	{
		setLetter(c);
		setAmount(amt);
	}

	public void setLetter(char c)
	{
		letter = c;
	}

	public void setAmount(int amt)
	{
		amount = amt;
	}

	public String toString()
	{
		String output="";
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		for (int i = amount; i > 0; i --) //number of rows
		{
			for (int j = amount; j > 0; j--)
			{
				output = output + letter;
			}
			letter = alphabet.charAt(alphabet.indexOf(letter) + 1);
		}
	
		return output;
		
		
	}
}