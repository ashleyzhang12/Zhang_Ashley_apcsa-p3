//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  - 

import static java.lang.System.*;

public class StringEqualityRunner
{
	public static void main( String args[] )
	{
		StringEquality a = new StringEquality("hello", "goodbye");
		System.out.println(a);
		
		StringEquality b = new StringEquality("one", "two");
		System.out.println(b);
		
		StringEquality c = new StringEquality("ABC", "CBA");
		System.out.println(c);
	}
}