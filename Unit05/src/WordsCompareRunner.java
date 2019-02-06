//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class WordsCompareRunner
{
   public static void main( String args[] )
   {
	   WordsCompare w = new WordsCompare("abe", "ape");
	   System.out.println(w);
	   
	   WordsCompare a = new WordsCompare("giraffe", "gorilla");
	   System.out.println(a);
	   
	   WordsCompare b = new WordsCompare ("one", "two");
	   System.out.println(b);
	   
	   WordsCompare c = new WordsCompare ("fun", "funny");
	   System.out.println(c);
	   
	   WordsCompare d = new WordsCompare("123", "19");
	   System.out.println(d);

	}
}