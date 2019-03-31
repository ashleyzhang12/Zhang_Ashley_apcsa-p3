//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

public class WordSortTwo
{
	private String[] wordRay;

	public WordSortTwo(String sentence)
	{
		wordRay = sentence.split(" ");
	}	
		

	public void sort()
	{
		for (int i = 0; i < wordRay.length; i++)
		{
			for(int j = i+1; j < wordRay.length; j ++)
			{
				if (wordRay[i].compareTo(wordRay[j]) > 0)
				{
					String setter = "";
					setter = wordRay[i];
					wordRay[i] = wordRay[j];
					wordRay[j] = setter;
				}
			}
		}
	}

	public String toString()
	{
		String output = "";
		for (String word: wordRay)
		{
			output = output + "\n" + word;
		}
		return output+"\n\n";
	}
}