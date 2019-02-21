//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayOddToEven
{
	public static int go(int[] ray)
	{
		int odd = 0;
		int even = 0;
		int diff = 0;
		

		while(odd < ray.length)
		{
			if (ray[odd] % 2 == 1)
			{
				even = odd;
				break;
			}
			else
			{
				odd++;
			}
		}
		
		if (odd == ray.length && even == 0 )
		{
			diff = -1;
			return diff;
		}
		
		while (even < ray.length)
		{
			if(ray[even] % 2==0)
			{
				break;
			}
			else
			{
				even++;
			}
		}
		
		diff = even - odd;
		if (even == ray.length && ray[ray.length - 1] % 2 == 1)
		{
			diff = -1;
		}		
		return diff;
		
		
			
			
		
		
		
	}
	
}