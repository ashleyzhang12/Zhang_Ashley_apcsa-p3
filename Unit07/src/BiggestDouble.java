//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class BiggestDouble
{
	private double one,two,three,four;

	public BiggestDouble()
	{
		this(0,0,0,0);
	}

	public BiggestDouble(double a, double b, double c, double d)
	{
		setDoubles(a,b,c,d);
	}

	public void setDoubles(double a, double b, double c, double d)
	{
		one = a;
		two = b;
		three = c;
		four = d;
	}

	public double getBiggest()
	{
		if (Math.max(two, three) < one && Math.max(three, four)< one && Math.max(two, four)<one)
			return one;
		else if(Math.max(one, three) < two && Math.max(three, four) < two && Math.max(one, four) < two)
			return two;
		else if (Math.max(one, two) < three && Math.max(two, four) < three && Math.max(one, four) < three)
			return three;
		else
			return four;
	}

	public String toString()
	{
	   return one + " " + two + " " + three + "  " + four; 
	}
}