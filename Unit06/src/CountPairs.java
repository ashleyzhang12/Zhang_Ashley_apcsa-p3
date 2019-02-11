//(c) A+ Computer Science
//www.apluscompsci.com
//Name

//import static java.lang.System.*;

public class CountPairs
{
	public static int pairCounter( String str )
	{ 
		int count = 0;


		for(int x=0; x < str.length()-1; x = x + 1)
		{
			if(str.charAt(x) == str.charAt(x+1))
			{
				count = count + 1;
			}
			else
			{
				count = count;
			}
		}

		return count;
	}
}