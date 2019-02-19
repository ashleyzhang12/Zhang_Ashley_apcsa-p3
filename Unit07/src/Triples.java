//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class Triples
{
   private int number;

	public Triples()
	{
		this(0);
	}

	public Triples(int num)
	{
		setNum(num);

	}

	public void setNum(int num)
	{
		number = num;

	}
	
	private int greatestCommonFactor(int a, int b, int c)
	{
		int max = 0;
		for (int i = 1; i < Math.min(Math.min(a, b), c); i++)
		{
			if (a % i ==0 && b % i == 0 && c % i ==0)
			{
				max = i;
			}
			else
			{
				max = max;
			}
		}
		return max;
	
	}

	public String toString()
	{
		String output="";
		for (int i = 1; i < number; i ++)
		{
			for (int j = i; j < number; j ++)
			{
				if (i % 2 == j % 2) continue;
				for (int k = j; k < number; k++)
				{
					if ((i * i + j * j) == k * k)
					{
						output = output + "\n" + i + " " + j + " " + k;
					}
				}
			}
		}




		return output+"\n";
	}
}