//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;

import java.util.Scanner;

public class StringRunner
{
	public static void main ( String[] args )
	{
		StringRunner word = new StringRunner();
		Scanner keyboard = new Scanner(System.in);
		
		out.print("Enter a word:: ");
		String w = keyboard.next();
		StringOddOrEven test = new StringOddOrEven(w);
		test.isEven();
		System.out.println(test);
		
		
	}
}