//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.ArrayList;
import java.util.List;

public class ListOddToEven
{
	public static int go( List<Integer> ray )
	{
		int odd = 0;
		int even = 0;
		int difference = 0;
		for (int i = 0; i < ray.size(); i++)
		{
			if (ray.get(i) %2 != 0)
			{
				odd = i + 1;
				break;
			}
		}
		if (odd != 0)
		{
			for(int j = odd; j < ray.size(); j++)
			{
				if (ray.get(j) %2==0)
				{
					if(j > even)
						even = j;
					else
						even = even;
				}
			}
			if(even != 0)
			{
				difference = even - odd + 1 ;
				return difference;
			}
			else
				return -1;
				
		}
		else
		{
			return -1;
		}
	}
}