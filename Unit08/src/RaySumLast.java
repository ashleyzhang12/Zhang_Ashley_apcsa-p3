//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RaySumLast
{
	public static int go(int[] ray)
	{
		int total = 0;
		int count = 0;
		int last = ray[ray.length-1];
		for (int n = 0; n<ray.length;n++)
		{
			if (ray[n] != last)
			{
				count++;
			}
			else
			{
				count = count ;
			}
		}
		if (count > 0 && ray.length>0)
		{
			for (int i = 0; i < ray.length; i++)
			{
				if (ray[i] > last)
				{
					total = total + ray[i];
				}
				else
				{
					total = total;
				}
			}
		}
		else
		{
			total = -1;
		}
		return total;
		
	}
}