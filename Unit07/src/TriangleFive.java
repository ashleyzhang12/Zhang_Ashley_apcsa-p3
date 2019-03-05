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
		char newLetter = letter;
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		int place = 0;
		
		for (int i = amount; i > 0 ; i --) //number of rows printed out
		{
			for (int j = amount; j > amount - i; j--)// number of letters to print out
			{
				for (int k = amount; k > amount - j; k-- )// number of each letter to print out
				
				{
					if (amount - j == 0)
					newLetter = letter;//prints out original letter if printing out amount number of times
					else
					newLetter = newLetter;
					
					output = output + newLetter;
					
				}
				
				//determines new letter
				place = alphabet.indexOf(newLetter);
				if (place < 25)
				{
					place++;
					newLetter = alphabet.charAt(place);
				}
				else //looping back around after z
				newLetter = alphabet.charAt(place - 25);
				
				output = output + " ";
				
			}		
			
			output = output + "\n";
		}
		
		
			
	
		return output;
		
		
	}
}