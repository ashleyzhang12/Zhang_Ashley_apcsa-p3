//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class TriangleWord
{
	//instance variables and constructors could be present, but are not necessary
		
	public static void printTriangle(String word)
	{
		String output = "";

		for(int i = word.length(); i >= 0; i--)//number of rows
		{
			for (int j = word.length(); j > i; j--)//number of times the segment is printed and how many letters are printed
			{
				output = output + word.substring(0,word.length() - i);
				output = output + " ";
			}
		
			output = output + "\n";
		}
		System.out.println(output);
	}
}
