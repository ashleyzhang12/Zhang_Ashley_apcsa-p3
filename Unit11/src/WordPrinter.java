//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class WordPrinter
{
	//instance variables and constructors could be present, but are not necessary
	
	private String word = "";
	private int times = 0;
	
	public WordPrinter(String w, int t)
	{
		setWord(w);
		setTimes(t);
	}
	
	public void setWord(String w)
	{
		word = w;
	}
	
	public void setTimes(int t)
	{
		times = t;
	}
	
	public static void printWord(String word, int times)
	{
		String output = "";
		for(int i  = times; i > 0; i--)
		{
			output = output + "\n" + word;
		}
		System.out.println(output);
		}
	}
