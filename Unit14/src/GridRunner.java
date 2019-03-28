//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class GridRunner
{
	public static void main( String args[] ) throws IOException
	{
		String[] vals = new String[]{"a", "9", "b", "c", 
				"7", "x"};
		Grid newGrid = new Grid(10,10,vals);
		System.out.println(newGrid.toString());
		for (int i = 0; i < vals.length ; i ++)
		{
			System.out.println(vals[i] + " count is " + newGrid.countVals(vals[i]));
		}
		
		System.out.println(newGrid.findMax(vals) + " occurs the most.");
	}
}