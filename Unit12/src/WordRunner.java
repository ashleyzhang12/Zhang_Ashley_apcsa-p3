//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File; 
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.*;

public class WordRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("/Users/ashleyz/Desktop/Zhang_Ashley_apcsa-p3/Zhang_Ashley_apcsa-p3/Unit12/src/words.dat"));

		int size = file.nextInt();
		Word[]orderList = new Word[size];
		
		for (int i= 0; i < size; i ++)
		{
			
			orderList[i] = new Word(file.next());
		}
		
		
		Arrays.sort(orderList);
		System.out.println(Arrays.toString(orderList));
		











	}
}