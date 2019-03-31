//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays; 
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberSorter
{
	//instance variables and other methods not shown

	private static int getNumDigits(int number)
	{
		int count = 0;
		int n = number;
		while (n >0)
		{
			n = n/10;
			count++;
		}
		return count;
	}

	public static int[] getSortedDigitArray(int number)
	{
		int size = getNumDigits(number);
		int[] sorted = new int[size];
		int n = number;
		for (int i = 0; i < size; i ++)
		{
			sorted[i] = n % 10;
			n = n/10;
		}
		
		for (int j = 0; j < size; j++)
		{
			for(int k = 0; k < size; k++)
			{
				if(sorted[j] < sorted[k])
				{
					int setter =0;
					setter = sorted[j];
					sorted[j] = sorted[k];
					sorted[k] = setter;
				}
			}
		}
		
		return sorted;
	}
}