//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifter
{
	public static int[] makeLucky7Array( int size)
	{
		int[] numArray = new int[size];
		for(int i = 0; i < size; i++)
		{
			numArray[i] = (int)(Math.random()*10);
		}
		return numArray;
	}
	public static void shiftEm(int[] array)
	{
		int setter = 0;
		for(int i = 0; i < array.length; i++)
		{
			if(array[i] == 7)
			{
				for(int j = 0; j < array.length; j++)
				{
					if (array[j] == 7)
					continue;
					else
					{
						setter = array[i];
						array[i] = array[j];
						array[j] = setter;
					}
				}
			}
			else
				continue;
		}
	}
}