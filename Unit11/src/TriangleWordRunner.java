//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class TriangleWordRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		String word = "";
		String answer = "";
		do {
		System.out.println("Enter a word :: ");
		word = keyboard.next();
		
		TriangleWord.printTriangle(word);
		System.out.println("Do you want to enter more sample input?");
		answer = keyboard.next();
		
		}while(answer.equals("y")||answer.equals("Y"));
		
		
		
	}
}