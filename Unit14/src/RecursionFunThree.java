//� A+ Computer Science  -  www.apluscompsci.com
//Name - 
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class RecursionFunThree
{
	/* luckyThrees will return the count of 3s in the number
	 * unless the 3 is at the front and then it does not count
	 * 3 would return 0
	 * 31332  would return 2
	 * 134523 would return 2
	 * 3113  would return 1
	 * 13331 would return 3
	 * 777337777  would return 2
	 * the solution to this problem must use recursion
	 */
	public static int luckyThrees( long number )
	{
		int total = 0;
		long n = number;
		if (number > 0)
		{
			if((n%10) == 3)
			{
				total = 1 + luckyThrees (n /10);
	
			}
			else
			{
				total = 0 + luckyThrees(n/10);

			}
			if(n == 3)
			{
				total = total -1;
			}
		}
		
		else
		{
			total = 0;
		}
		return total;
	}
}