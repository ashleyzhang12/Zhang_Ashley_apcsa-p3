//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class RecursionFunOne
{
	public static int countEvenDigits(int num)
	{
		int n = num;
		int count = 0;
		if (num > 0)
		{
				if ((n % 10) % 2 == 0)
				{
					
					return 1 + countEvenDigits(n/10);
					
				}
				else
				{
					return 0 + countEvenDigits(n/10);
				}
		}
		
		return 0;
		
		


		
	}
}