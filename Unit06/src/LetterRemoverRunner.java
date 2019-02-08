//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class LetterRemoverRunner
{
	public static void main( String args[] )
	{

		//add test cases		

		LetterRemover a = new LetterRemover("I am Sam I am  a", 'a');
		System.out.println(a.toString());
		System.out.println(a.removeLetters());
		
		LetterRemover b = new LetterRemover("qwertyqwerty", 'a');
		System.out.println(b.toString());
		System.out.println(b.removeLetters());

											
	}
}