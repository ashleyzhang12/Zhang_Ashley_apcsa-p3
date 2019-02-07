//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class WordRunner
{
	public static void main ( String[] args )
	{
		Word a = new Word("Hello");
		System.out.println(a.getFirstChar());
		System.out.println(a.getLastChar());
		System.out.println(a.getBackWards());
		System.out.println(a.toString());
		
	}
}