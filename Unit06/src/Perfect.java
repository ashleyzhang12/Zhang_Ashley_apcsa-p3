//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Perfect
{
   private int number;

	public Perfect()
	{
		number = 0;
	}
	
	public Perfect(int n)
	{
		setNum(n);
	}
	
	public void setNum(int n)
	{
		number = n;
	}

	//add a set method

	public boolean isPerfect()
	{
		int sum = 0;
		for (int x = 1; x < number; x = x+1)
		{
			if (number % x == 0)
			{
				sum = sum + x;
			}
			else
			{
				sum = sum;
			}
		}
		if (sum == number)
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
		String output = "";
		if (isPerfect() == true)
		{
			output = number + " is perfect.\n";
		}
		else
		{
			output = number + " is not perfect.\n";
		}
		return output;
	}
	
}